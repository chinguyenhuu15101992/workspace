package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by c on 19-Sep-16.
 */
public class switchcase {
    public static void main(String[] args) {
        int thang, nam;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập giá trị năm:");
        nam = input.nextInt();
        System.out.println("nhập giá trị tháng:");
        thang = input.nextInt();
        if (thang >12 || thang <1 || nam <0){
            if ( (thang >12)&&(nam<0) || (thang<1)&&(nam<0) )
//            if (!(thang>12&&thang<1)&& (nam<0))
            {
                System.out.println(" bạn nhập cả năm và tháng rồi!");
            }
            else if (nam <0){
                System.out.println(" bạn nhập sai năm rồi");
            }
            else
             {
                System.out.println("bạn nhập sai tháng rồi");
            }
        }
        else {
            if (nam%4==0){
                System.out.println("đây là năm nhuận");
            }
            else {
                System.out.println(" đây là năm thường");
            }
                switch (thang){
                    case 1:
                        System.out.println("tháng 1 có 31 ngày");
                        break;
                    case 2:
                        if (nam%4==0){
                            System.out.println("tháng hai có 29 ngày");
                        }else {
                            System.out.println("tháng hai có 28 ngày");
                        }
                        break;
                    case 3:
                        System.out.println("tháng ba có 31 ngày");
                        break;
                    case 4:
                        System.out.println("tháng tư có 30 ngày");
                        break;
                    case 5:
                        System.out.println("tháng năm có 31 ngày");
                        break;
                    case 6:
                        System.out.println("tháng sáu có 30 ngày");
                        break;
                    case 7:
                        System.out.println("tháng bảy có 31 ngày");
                        break;
                    case 8:
                        System.out.println("tháng tám có 30 ngày");
                        break;
                    case 9:
                        System.out.println("tháng chín có 31 ngày");
                        break;
                    case 10:
                        System.out.println("tháng mười có 30 ngày");
                        break;
                    case 11:
                        System.out.println("tháng mười một có 31 ngày");
                        break;
                    case 12:
                        System.out.println("tháng mười hai có 30 ngày");
                    break;
                    default:
                        break;



                }


        }

    }
}
