package com.company.calcImproved;

public class Calculator {


    public static int add(int num1, int num2) {

        return num1 + num2;
    }


    public static int multiply(int num1, int num2) {

        return num1 * num2;
    }


    public static int sub(int num1, int num2) {

        return num1 - num2;
    }


    public static int div(int num1, int num2) {
        if (num2 > 0) {
            return num1 / num2;
        }
        else System.out.println("The opperation could not be done");
        return 0;
    }
}
