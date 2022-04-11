package com.company.Calculator.Calc_Enhanced;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Menu {

    private static final String MENU = "Calculator.\nChoose 1 for add, 2 for multiply, 3 for subtract, 4 for div.";

    public static void showMenu() {

        System.out.println(MENU);

    }

    public static void readOption() {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        List<Integer> numbers = new ArrayList<>();
        Boolean exit_readoption = false;


        // Option input
        System.out.print("Enter option: ");
        Integer opt = myObj.nextInt();

        while (!exit_readoption) {
            // num input
            System.out.print("Enter a number: ");
            String num_red = myObj.next();
            if (!num_red. equals("exit")){

                Integer num = Integer.valueOf(num_red);
                numbers.add(num);

            }
            else{
                exit_readoption = true;
            }

        }

        processOpt(opt, listToArray(numbers));

    }

    public static Integer[] listToArray(List<Integer> numbers) {
        // System.out.println(numbers);
        return numbers.toArray(new Integer[0]);
    }

    private static void processOpt(Integer opt, Integer[] numbers) {

        int result = 0;
        boolean do_i_print = true;

        switch (opt) {
            case 1 -> {
                result = Calculator.add(numbers);
            }
            case 2 -> {
                result = Calculator.multiply(numbers);
            }
            case 3 -> {
                result = Calculator.sub(numbers);
            }
            case 4 -> {
                result = Calculator.div(numbers);
            }
            default -> {
                System.out.println("Error, option doesn't  exit.");
                do_i_print = false;
            }


        }

        Logger.log(result, do_i_print);

    }
}
