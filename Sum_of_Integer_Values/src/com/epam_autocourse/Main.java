package com.epam_autocourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enterValues = new Scanner(System.in);
        int number1, number2;
        System.out.print("\nEnter 1-st number:");
        number1 = enterValues.nextInt();
        System.out.print("\nEnter 2-nd number:");
        number2 = enterValues.nextInt();
        System.out.print("\nSum of these numbers = " + (number1 + number2));
        System.out.print("\nComposition of these numbers = " + (number1 * number2));
    }
}


