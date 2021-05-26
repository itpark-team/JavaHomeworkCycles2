package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countBridges;
        int heightCurrentBridges;

        int numberCrashBridge = 0;
        boolean hasCrash = false;

        int numberCurrentBridge = 0;

        int heightBus = 437;

        Scanner input = new Scanner(System.in);
        countBridges = input.nextInt();

        while (numberCurrentBridge < countBridges) {

            heightCurrentBridges = input.nextInt();
            numberCurrentBridge++;

            if (hasCrash == false && heightCurrentBridges <= heightBus) {
                numberCrashBridge = numberCurrentBridge;
                hasCrash = true;
            }
        }

        if (hasCrash == true) {
            System.out.println("Crash " + numberCrashBridge);
        } else {
            System.out.println("No crash");
        }


    }


}
