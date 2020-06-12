#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

int main()
{
	Mat first = imread("choseong.jpg", IMREAD_GRAYSCALE);
	Mat last = imread("jongseong.jpg", IMREAD_GRAYSCALE);
	Mat final = imread("1.jpg", IMREAD_GRAYSCALE);
	Mat dst; //���η� �̹��� ���� ���
	Mat dst_1; //���η� �̹��� ���� ���


	resize(first, first, Size(300, 300), INTER_AREA);
	resize(last, last, Size(200, 300), INTER_AREA);
	resize(final, final, Size(500, 300), INTER_AREA);

	hconcat(first, last, dst); //���η� �̹��� ���̱�

	vconcat(dst, final, dst_1); //���η� �̹��� ���̱�

	//����ȭ�ؼ� ���ڸ� �����ϱ�
	//���Ż�� THRESH_BINARY_INV
	threshold(dst_1, dst_1, 170, 255, THRESH_BINARY_INV);

	//������
	dst_1 = ~dst_1;

	resize(dst_1, dst_1, Size(500, 500), INTER_AREA);

	//�̹��� �����ֱ�
	imshow("font_Composing", dst_1);

	waitKey();
	destroyAllWindows();

	return 0;

}