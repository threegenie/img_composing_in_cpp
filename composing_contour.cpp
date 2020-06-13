#include "opencv2/imgproc/imgproc.hpp"

#include "opencv2/imgcodecs.hpp"

#include "opencv2/highgui/highgui.hpp"

#include <iostream>

#include <opencv2/core/core.hpp>

#include <string>

using namespace cv;
using namespace std;

int main()
{
   Mat first = imread("1.jpg", IMREAD_GRAYSCALE);
   Mat medi = imread("2.jpg", IMREAD_GRAYSCALE);
   Mat final = imread("3.jpg", IMREAD_GRAYSCALE);
   Mat dst = cv::Mat::zeros(Size(500, 550), CV_8U);
   
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   //색반전
   dst = ~dst;

   resize(first, first, Size(300, 300), INTER_AREA);
   resize(medi, medi, Size(300, 300), INTER_AREA);
   resize(final, final, Size(300, 200), INTER_AREA);

   threshold(first, first, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);
   threshold(final, final, 170, 255, THRESH_BINARY_INV);

   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;
   //초성
   findContours(first, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      Scalar color = Scalar(0, 0, 0);
      drawContours(dst, contours, i, color, 2, 8, hierarchy, 0, Point(0, 0));
   }
   cv::fillPoly(dst, contours, cv::Scalar(0, 0, 0));

   //중성
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      Scalar color = Scalar(0, 0, 0);
      drawContours(dst, contours, i, color, 2, 8, hierarchy, 0, Point(200, 0));
   }
   cv::fillPoly(dst, contours, cv::Scalar(0, 0, 0), cv::LINE_8, 0, Point(200, 0));

   //종성
   findContours(final, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      Scalar color = Scalar(0, 0, 0);
      drawContours(dst, contours, i, color, 2, 8, hierarchy, 0, Point(100,300));
   }
   cv::fillPoly(dst, contours, cv::Scalar(0, 0, 0), cv::LINE_8, 0, Point(100, 300));

   //이미지 보여주기
   imshow("font_Composing", dst);

   waitKey();
   destroyAllWindows();

   return 0;

}
