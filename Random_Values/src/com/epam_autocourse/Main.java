package com.epam_autocourse;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 250;
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number1);
        }

        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.println(" " + random_number1);
        }
    }
}


