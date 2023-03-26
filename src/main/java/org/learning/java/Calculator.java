package org.learning.java;

public class Calculator {
    /*
    - float add(float num1, float num2)
    - float subtract(float num1, float num2)
    - float divide(float num1, float num2)
    - float multiply(float num1, float num2)
    */


    public static float add(float num1, float num2){
        return num1 + num2;
    }

    public static float subtract(float num1, float num2){
        return num1 - num2;
    }

    public static float divide(float num1, float num2){
        if(num2 == 0){
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }

    public static float multiply(float num1, float num2){
        return num1 * num2;
    }


}
