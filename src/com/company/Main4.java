package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int countPersons;
        int maxAge = 0;
        int saveNumber = -1;

        Scanner input = new Scanner(System.in);
        countPersons = input.nextInt();

        for (int i = 1; i <= countPersons; i++) {
            int currentAge = input.nextInt();
            int sex = input.nextInt();

            if (sex == 1) {
                if (currentAge > maxAge) {
                    maxAge = currentAge;
                    saveNumber = i;
                }
            }
        }

        System.out.println(saveNumber);
    }
}