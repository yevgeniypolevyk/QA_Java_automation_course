package com.epam_autocourse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getArguments = new Scanner(System.in);
        System.out.println("Enter your arguments ");
        StringBuffer toll = new StringBuffer(getArguments.nextLine());
        toll.reverse();
        System.out.println("Entered arguments in reverse order: " + toll.toString());

    }
}
