package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();

        if (m1 < 94 || m1 > 727 || m2 < 94 || m2 > 727 || m3 < 94 || m3 > 727) {
            System.out.println("Error");
            return;
        }

        if (m1 > m2) {
            max = m1;
        } else {
            max = m2;
        }

        if (m3 > max) {
            max = m3;
        }


        System.out.print(max);
    }

}