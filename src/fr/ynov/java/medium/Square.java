package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.next();
        int sum = Integer.parseInt(number);
        System.out.println(sum * sum);
    }
}
