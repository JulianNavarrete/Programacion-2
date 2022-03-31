package com.company.calcImproved;
import java.util.Scanner;


class Menu {

    private static final String MENU = "Calculator.\nChoose 1 for add, 2 for multiply, 3 for subtract, 4 for div.";

    public static void showMenu() {

        System.out.println(MENU);

    }

    public static void readOption() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        // Option input
        System.out.print("Enter option: ");
        Integer opt = myObj.nextInt();

        // num1 input
        System.out.print("Enter first number: ");
        Integer num1 = myObj.nextInt();

        // num2 input
        System.out.print("Enter second number: ");
        Integer num2 = myObj.nextInt();

        processOpt(opt, num1, num2);

    }

    private static void processOpt(Integer opt, Integer num1, Integer num2) {

        int result = 0;
        String operator = "";
        boolean do_i_print = true;

        switch (opt) {
            case 1 -> {
                result = Calculator.add(num1, num2);
                operator = "+";
            }
            case 2 -> {
                result = Calculator.multiply(num1, num2);
                operator = "*";
            }
            case 3 -> {
                result = Calculator.sub(num1, num2);
                operator = "-";
            }
            case 4 -> {
                result = Calculator.div(num1, num2);
                operator = "/";
            }
            default -> {
                System.out.println("Error, wrong option.");
                do_i_print = false;
            }


        }

        Logger.log(result, operator, num1, num2, do_i_print);

    }
}
