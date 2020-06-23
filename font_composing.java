//안드로이드 어플에 삽입할 용도의 함수 구성

void type_a(Mat ini, Mat medi) //아,에
{
   Mat dst = cv::Mat::zeros(Size(500, 500), CV_8U);
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   dst = ~dst;
   ini = ~ini;
   medi = ~medi;

   cvtColor(ini, ini, COLOR_RGBA2GRAY);
   cvtColor(medi, medi, COLOR_RGBA2GRAY);

   resize(ini, ini, Size(300, 300), INTER_AREA);
   resize(medi, medi, Size(300, 300), INTER_AREA);


   threshold(ini, ini, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);


   Rect rect;
   Scalar color = Scalar(0, 0, 0);
   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;

   //초성
   //contour 위치 초기화
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(150, 200));




   //중성
   //contour 위치 초기화
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(250, 150));



   //이미지 보여주기
   imshow("font_Composing_type_d", dst);

   waitKey();
   destroyAllWindows();

}

void type_b(Mat ini, Mat medi) //오,유
{
   Mat dst = cv::Mat::zeros(Size(500, 500), CV_8U);
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   dst = ~dst;
   ini = ~ini;
   medi = ~medi;

   cvtColor(ini, ini, COLOR_RGBA2GRAY);
   cvtColor(medi, medi, COLOR_RGBA2GRAY);
   
   resize(ini, ini, Size(500, 500), INTER_AREA);
   resize(medi, medi, Size(500, 500), INTER_AREA);


   threshold(ini, ini, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);


   Rect rect;
   Scalar color = Scalar(0, 0, 0);
   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;

   //초성
   //contour 위치 초기화
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0-rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(200, 80));
   

   //중성
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(120, 230));




   //이미지 보여주기
   imshow("font_Composing_type_d", dst);

   waitKey();
   destroyAllWindows();

}

void type_c(Mat ini, Mat medi, Mat medi_2) //와,위
{
   Mat dst = cv::Mat::zeros(Size(500, 500), CV_8U);
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   dst = ~dst;
   ini = ~ini;
   medi = ~medi;
   medi_2 = ~medi_2;

   cvtColor(ini, ini, COLOR_RGBA2GRAY);
   cvtColor(medi, medi, COLOR_RGBA2GRAY);
   cvtColor(medi_2, medi_2, COLOR_RGBA2GRAY);

   resize(ini, ini, Size(300, 300), INTER_AREA);
   resize(medi, medi, Size(300, 300), INTER_AREA);
   resize(medi_2, medi_2, Size(300, 300), INTER_AREA);

   threshold(ini, ini, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);
   threshold(medi_2, medi_2, 170, 255, THRESH_BINARY_INV);

   Rect rect;
   Scalar color = Scalar(0, 0, 0);
   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;

   //초성
   //contour 위치 초기화
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(220, 150));

   //중성
   //contour 위치 초기화
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(300, 160));


   //중성2
   //contour 위치 초기화
   findContours(medi_2, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi_2, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(150, 210));



   //이미지 보여주기
   imshow("font_Composing_type_d", dst);

   waitKey();
   destroyAllWindows();

}

void type_d(Mat ini, Mat medi, Mat fin) //앙, 엥
{
   Mat dst = cv::Mat::zeros(Size(500, 500), CV_8U);
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   dst = ~dst;
   ini = ~ini;
   medi = ~medi;
   fin = ~fin;

   cvtColor(ini, ini, COLOR_RGBA2GRAY);
   cvtColor(medi, medi, COLOR_RGBA2GRAY);
   cvtColor(fin, fin, COLOR_RGBA2GRAY);

   resize(ini, ini, Size(300, 300), INTER_AREA);
   resize(medi, medi, Size(300, 300), INTER_AREA);
   resize(fin, fin, Size(300, 300), INTER_AREA);

   threshold(ini, ini, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);
   threshold(fin, fin, 170, 255, THRESH_BINARY_INV);

   Rect rect;
   Scalar color = Scalar(0, 0, 0);
   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;

   //초성
   //contour 위치 초기화
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(150, 100));


   

   //중성
   //contour 위치 초기화
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(250, 80));


   //종성
   //contour 위치 초기화
   findContours(fin, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(fin, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(200, 250));

   

   //이미지 보여주기
   imshow("font_Composing_type_d", dst);

   waitKey();
   destroyAllWindows();

}

void type_e(Mat ini, Mat medi, Mat fin) {//옹, 웅
   Mat dst = cv::Mat::zeros(Size(500, 500), CV_8U);
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   dst = ~dst;
   ini = ~ini;
   medi = ~medi;
   fin = ~fin;

   cvtColor(ini, ini, COLOR_RGBA2GRAY);
   cvtColor(medi, medi, COLOR_RGBA2GRAY);
   cvtColor(fin, fin, COLOR_RGBA2GRAY);

   resize(ini, ini, Size(300, 300), INTER_AREA);
   resize(medi, medi, Size(300, 300), INTER_AREA);
   resize(fin, fin, Size(300, 300), INTER_AREA);

   threshold(ini, ini, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);
   threshold(fin, fin, 170, 255, THRESH_BINARY_INV);

   Rect rect;
   Scalar color = Scalar(0, 0, 0);
   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;

   //초성
   //contour 위치 초기화
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(200, 80));




   //중성
   //contour 위치 초기화
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(150, 150));


   //종성
   //contour 위치 초기화
   findContours(fin, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(fin, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(200, 250));



   //이미지 보여주기
   imshow("font_Composing_type_d", dst);

   waitKey();
   destroyAllWindows();

}

void type_f(Mat ini, Mat medi, Mat medi_2, Mat fin) //왕,윙
{
   Mat dst = cv::Mat::zeros(Size(500, 500), CV_8U);
   cvtColor(dst, dst, COLOR_GRAY2RGB);
   dst = ~dst;
   ini = ~ini;
   medi = ~medi;
   medi_2 = ~medi_2;
   fin = ~fin;

   cvtColor(ini, ini, COLOR_RGBA2GRAY);
   cvtColor(medi, medi, COLOR_RGBA2GRAY);
   cvtColor(medi_2, medi_2, COLOR_RGBA2GRAY);
   cvtColor(fin, fin, COLOR_RGBA2GRAY);


   resize(ini, ini, Size(300, 300), INTER_AREA);
   resize(medi, medi, Size(300, 300), INTER_AREA);
   resize(medi_2, medi_2, Size(300, 300), INTER_AREA);
   resize(fin, fin, Size(300, 300), INTER_AREA);

   threshold(ini, ini, 170, 255, THRESH_BINARY_INV);
   threshold(medi, medi, 170, 255, THRESH_BINARY_INV);
   threshold(medi_2, medi_2, 170, 255, THRESH_BINARY_INV);
   threshold(fin, fin, 170, 255, THRESH_BINARY_INV);

   Rect rect;
   Scalar color = Scalar(0, 0, 0);
   std::vector<vector<Point>> contours;
   std::vector<Vec4i> hierarchy;

   //초성
   //contour 위치 초기화
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(ini, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(200, 100));

   //중성
   //contour 위치 초기화
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(280, 100));


   //중성2
   //contour 위치 초기화
   findContours(medi_2, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(medi_2, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(130, 190));

   //종성
   //contour 위치 초기화
   findContours(fin, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0, 0));
   for (int i = 0; i< contours.size(); i++)
   {
      rect = boundingRect(contours[i]);
   }
   //contour 그리기
   findContours(fin, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE, Point(0 - rect.x, 0 - rect.y));
   cv::fillPoly(dst, contours, color, cv::LINE_8, 0, Point(210, 250));



   //이미지 보여주기
   imshow("font_Composing_type_d", dst);

   waitKey();
   destroyAllWindows();

}

