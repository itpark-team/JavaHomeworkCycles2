package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxFloor = 0;
        int minFloor = 0;
        int currentFloor = 0;

        String buttons = input.next();

        for (int i = 0; i < buttons.length(); i++) {
            char currentButton = buttons.charAt(i);

            if (currentButton == '1') {
                currentFloor++;
            } else if (currentButton == '2') {
                currentFloor--;
            }

            if(currentFloor > maxFloor){
                maxFloor = currentFloor;
            }

            if(currentFloor < minFloor){
                minFloor = currentFloor;
            }

        }
        System.out.print(maxFloor - minFloor + 1);
    }
}