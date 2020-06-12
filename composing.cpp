#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

int main()
{
	Mat first = imread("choseong.jpg", IMREAD_GRAYSCALE);
	Mat last = imread("jongseong.jpg", IMREAD_GRAYSCALE);
	Mat final = imread("1.jpg", IMREAD_GRAYSCALE);
	Mat dst; //가로로 이미지 붙인 결과
	Mat dst_1; //세로로 이미지 붙인 결과


	resize(first, first, Size(300, 300), INTER_AREA);
	resize(last, last, Size(200, 300), INTER_AREA);
	resize(final, final, Size(500, 300), INTER_AREA);

	hconcat(first, last, dst); //가로로 이미지 붙이기

	vconcat(dst, final, dst_1); //세로로 이미지 붙이기

	//이진화해서 글자만 추출하기
	//열거상수 THRESH_BINARY_INV
	threshold(dst_1, dst_1, 170, 255, THRESH_BINARY_INV);

	//색반전
	dst_1 = ~dst_1;

	resize(dst_1, dst_1, Size(500, 500), INTER_AREA);

	//이미지 보여주기
	imshow("font_Composing", dst_1);

	waitKey();
	destroyAllWindows();

	return 0;

}