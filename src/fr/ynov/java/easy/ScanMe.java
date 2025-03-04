package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and your ager");

        String name = sc.nextLine();
        System.out.println("Your age is " + name);
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
    }
}
