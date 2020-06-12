#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

void composing(Mat img1, Mat img2, Mat background)
{
	Mat initial; //�ʼ�
	Mat final; //����
	Mat dst; //�����̹���

    //�̹��� ��������
	//Size(width, height), ������ INTER_AREA
	resize(img1, initial, Size(300, 300), INTER_AREA);
	resize(img2, final, Size(200, 500), INTER_AREA);

	//��濡 ���������� �̹��� ���̱�
	//Rect(x��ǥ,y��ǥ,width,height)
	background(Rect(0, 0, 300, 300)) = initial;
	background(Rect(300, 0, 200, 500)) = final;

	//����ȭ�ؼ� ���ڸ� �����ϱ�
	//���Ż�� THRESH_BINARY_INV
	threshold(background, dst, 170, 255, THRESH_BINARY_INV);

	//������
	dst = ~dst;

	//�̹��� �����ֱ�
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

