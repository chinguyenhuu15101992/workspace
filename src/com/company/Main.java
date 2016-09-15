package com.company;

import java.util.Date;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.toIntExact;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");

//        giai phuong trinh bac 2: ax^2 + bx + c= 0
//        System.out.println("Bài tập nhập tên");
//        Scanner scanner = new Scanner (System.in);
//        System.out.println(" Mời bạn nhập tên của mình vào:");
//        String ten = scanner.nextLine();
//        System.out.println("xin chao " + ten);
//        System.out.println(" Thời gian hiện tại:");
//        // Instantiate a Date object
////        Date date = new Date();
//
//        // display time and date using toString()
////        System.out.println(date.toString());
//        Date date = new Date();
//        System.out.println(date.toString());
//        int x = 10;
//        if (x == 20) {
//            System.out.println(" yes x == 10");
//
//            }
//        else {
//            System.out.println("no x != 10");
//        }
//

//        System.out.println("hôm nay học về if-else");
//
//        System.out.println("hôm nay học bài nào:");
//        Scanner scan = new Scanner(System.in);
//        String x = scan.nextLine();
//        System.out.println("hôm nay sẽ học bài " +x);

// bài tập lấy từ người dùng số giờ nếu >12h thì chào chieeuff <12h chào sáng
//        System.out.println("bây giờ là mấy giờ:");
//        Scanner time = new Scanner(System.in);
//        int x = time.nextInt();
//        if (x < 12)
//            System.out.println(" chào buổi sáng");
//        else
//            System.out.println("chào buổi chiều");

        /* Bài tập giải bài toán phương trình bậc 2 ax^2+bx+c=0 */
//        System.out.println("Giải bài toán phương trình bậc 2 ax^2+bx+c=0");
//        Scanner variable = new Scanner(System.in);
//        System.out.println("giá trị hằng số a là:");
//        float a = variable.nextInt();
//        System.out.println("gias trị hằng số b là:");
//        float b = variable.nextInt();
//        System.out.println("giá trị hằng số c là:");
//        float c = variable.nextInt();
//        float delta = b*b - 4*a*c;
//        if (delta < 0) {
//            System.out.println("phương trình vô nghiệm");
//        }
//        else if ( delta == 0) {
//            float x = (-b)/(2*a);
//            System.out.println ("phương trình có nghiệm là:");
//        }
//        else {
//            double x1 = ((-b)+sqrt(delta))/(2*a);
//            double x2 = ((-b)-sqrt(delta))/(2*a);
//            System.out.println("phương trình có hai nghiệm đó là");
//            System.out.println("nghiệm đầu tiên là x1= "+x1);
//            System.out.println(" nghiệm thứ 2 là x2= "+x2);
//            System.out.println(" Thank you so much");
//
//        }

            /* Bài tập tính lương cho nhân viên*/

//      Scanner salary = new Scanner(System.in);
//
//        float


        Scanner input = new Scanner(System.in);


            System.out.println("nhân viên đạt loại:");
            String cate = input.nextLine();
            System.out.println("nhân viên mức lương là:");
            int salary = input.nextInt();


//            String a,b;

            if (cate.equals("a")) {
                int x = salary + 3000;
                System.out.println("người nhân viên nhận được lương là: " + x);
            } else if (cate.equals("b")) {
                int x = salary + 2000;
                System.out.println("người nhân viên nhận được lương là: " + x);
            } else {
                int x = salary + 1000;
                System.out.println("người nhân viên nhận được lương là: " + x);
            }




    }
}
