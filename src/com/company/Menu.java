package com.company;
import java.awt.*;
import java.net.Inet4Address;
import java.util.Scanner;


class Menu {

    private static final String MENU = "Calculator. Choose: 1 for add, 2 for multiply, 3 for subtract, 4 for div.";

    public static void showMenu() {

        System.out.println(MENU);

    }

    public static void readOption() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter option: ");
        Integer opt = myObj.nextInt();
        processOpt(opt);

    }

    private static int processOpt(Integer opt) {

        switch (opt) {
            case 1 -> { return Calculator.add(6, 2); }
            case 2 -> { return Calculator.multiply(6, 2); }
            case 3 -> { return Calculator.sub(6, 2); }
            case 4 -> { return Calculator.div(6, 2); }
            default -> {
                System.out.println("Error, wrong option.");
                return 0;
            }

        Logger.log();

        }

    }
}
