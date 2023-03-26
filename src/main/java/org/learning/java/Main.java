package org.learning.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        - float add(float num1, float num2)
        - float subtract(float num1, float num2)
        - float divide(float num1, float num2)
        - float multiply(float num1, float num2)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero");
        Float num1 = Float.parseFloat(scan.nextLine());
        System.out.println("inserisci un altro numero");
        Float num2 = Float.parseFloat(scan.nextLine());
        scan.close();

        try {
            System.out.println(Calculator.divide(num1, num2)
                    + " è il risultato della divisione " + num1 + "/" + num2);
        } catch (IllegalArgumentException e) {
            System.out.println("il numero deve essere diverso da 0");
        }
    }
}