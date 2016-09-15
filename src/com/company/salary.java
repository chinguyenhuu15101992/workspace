package com.company;

import org.omg.CORBA.CharHolder;
import org.omg.CORBA.StringHolder;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by c on 13-Sep-16.
 */

public class salary {
    public static void main(String[] args) {
        int[] worker = new int[5];
//        char     cate;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= worker.length; i++) {


            System.out.println("\n người thứ " + i + " mức lương là:");
            int salary = input.nextInt();
            System.out.println("người thứ " + i + " đạt loại:");
            String cate = input.next();

//            String a,b;

                if (cate.equals("a")) {
                    float x = salary + 3000;
                    System.out.println("người thứ " + i + " nhận được lương là: " + x);
                } else if (cate.equals("b")) {
                    float x = salary + 2000;
                    System.out.println("người thứ " + i + " nhận được lương là: " + x);
                } else {
                    float x = salary + 1000;
                    System.out.println("người thứ " + i + " nhận được lương là: " + x);
                }
//Scanner.close();

//input.close();
        }





    }

}