package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Entre an operator");
        Scanner sc = new Scanner(System.in);
        String operatorName = sc.nextLine();
        String x = args[0];
        String y = args[1];
        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);

        switch (operatorName) {
            case "+":
                int sum = i + j;
                System.out.println(sum);
                break;
            case "-":
                System.out.println(i - j);
                break;
            case "*":
                System.out.println(i * j);
                break;
            case "/":
                System.out.println(i / j);
                break;
            default:

        }
    }
}
