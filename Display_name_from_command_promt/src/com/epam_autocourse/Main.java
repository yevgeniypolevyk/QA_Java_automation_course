package com.epam_autocourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Hello " + getName.nextLine());
        }
    }
}
