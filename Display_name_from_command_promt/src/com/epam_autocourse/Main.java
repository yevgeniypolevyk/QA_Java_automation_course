package com.epam_autocourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        String name;
        System.out.print("Enter your name and press Enter ");
        name = getName.next();
        System.out.print("\nHello " + name);
    }
}

