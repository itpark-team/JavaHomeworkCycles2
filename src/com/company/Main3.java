package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        int countMelons;
        int maxWeight = 0;
        int minWeight = 0;
        int currentWeight;

        Scanner input = new Scanner(System.in);

        countMelons = input.nextInt();

        for (int i = 0; i < countMelons; i++) {
            currentWeight = input.nextInt();

            if (i == 0) {
                maxWeight = currentWeight;
                minWeight = currentWeight;
            } else {

                if (currentWeight > maxWeight) {
                    maxWeight = currentWeight;
                }

                if (currentWeight < minWeight) {
                    minWeight = currentWeight;
                }
            }

        }
        System.out.print(minWeight + " " + maxWeight);


    }
}