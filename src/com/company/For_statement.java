package com.company;

import java.util.Scanner;

/**
 * Created by chi on 10/4/2016.
 */
public class For_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so hang cua tam giac la:");
        int n = input.nextInt();
//        String [][] a = new String[n][n];
        for (int i=1;i<n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" \n");
        }

    }
}
