package com.company;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count1 = 0;
        int result;

        String buttons = input.next();

        for (int i = 0; i < buttons.length(); i++) {
            char currentButton = buttons.charAt(i);

            if (currentButton == '1') {
                count1++;
            }

        }
        if (count1 % 2 == 0) {
            result = count1 + 1;
        } else {
            result = count1;
        }

        System.out.print(result);
    }
}