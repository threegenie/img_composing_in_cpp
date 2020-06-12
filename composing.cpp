#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

void composing(Mat img1, Mat img2, Mat background)
{
	Mat initial; //초성
	Mat final; //종성
	Mat dst; //최종이미지

    //이미지 리사이즈
	//Size(width, height), 보간법 INTER_AREA
	resize(img1, initial, Size(300, 300), INTER_AREA);
	resize(img2, final, Size(200, 500), INTER_AREA);

	//배경에 리사이즈한 이미지 붙이기
	//Rect(x좌표,y좌표,width,height)
	background(Rect(0, 0, 300, 300)) = initial;
	background(Rect(300, 0, 200, 500)) = final;

	//이진화해서 글자만 추출하기
	//열거상수 THRESH_BINARY_INV
	threshold(background, dst, 170, 255, THRESH_BINARY_INV);

	//색반전
	dst = ~dst;

	//이미지 보여주기
	imshow("font_Composing", dst);

}

int main()
{
	Mat first = imread("choseong.jpg", IMREAD_GRAYSCALE);
	Mat last = imread("jongseong.jpg", IMREAD_GRAYSCALE);
	Mat backimg = imread("background.jpg");

	composing(first, last, backimg);

	waitKey();
	return 0;

}

