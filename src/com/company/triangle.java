package com.company;

import java.util.Scanner;

/**
 * Created by c on 20-Sep-16.
 */
public class triangle {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);
        System.out.println(" nhập giá trị cạnh 1");
        int canh1 = side.nextInt();
        System.out.println(" nhập giá trị cạnh 2");
        int canh2 = side.nextInt();
        System.out.println(" nhập giá trị cạnh 3");
        int canh3 = side.nextInt();

        if ( (canh1>0)&&(canh2>0)&&(canh3>0)  &&((canh1+canh2)>canh3)&&((canh1+canh3)>canh2) && ((canh2+canh3)>canh1)){
            System.out.println(" vậy ba cạnh này là một tam giác");
        }
        else {
            System.out.println(" ba cạnh này không phải là một tam giác");
        }
    }
}
