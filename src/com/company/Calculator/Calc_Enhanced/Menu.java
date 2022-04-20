package com.company.Calc_Enhanced;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Menu {

    private static final String MENU = "Calculator. Chose a number and then an operator, the times you want.";

    public static void showMenu() {
        System.out.println(MENU);
    }

    public static void readOption() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        List<Integer> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();
        Boolean exit_readoption = false;

        System.out.print("Enter a number: ");
        String first_num_red = myObj.next();
        Integer numb = Integer.valueOf(first_num_red);
        numbers.add(numb);
        while (!exit_readoption) {
            // num and operator input
            System.out.print("Enter an operator: ");
            String op_red = myObj.next();

            if (!op_red. equals("=")){
                System.out.print("Enter a number: ");
                String num_red = myObj.next();
                Integer num = Integer.valueOf(num_red);
                numbers.add(num);
                operators.add(op_red);
            }
            else{
                exit_readoption = true;
            }
        }
        processOpt(operatorsToArray(operators), listToArray(numbers));
    }

    public static Integer[] listToArray(List<Integer> numbers) {
        return numbers.toArray(new Integer[0]);
    }


    public static String[] operatorsToArray(List<String> operators) {
        return operators.toArray(new String[0]);
    }

    private static void processOpt(String[] operators, Integer[] numbers) {
        int result = numbers[0];
        int i=0;
        boolean do_i_print = true;

        for (String op : operators) {
            i++;
            switch (op) {
                case "+" -> {
                    if (i==1){
                        result = Calculator.add(numbers[i-1], numbers[i]);
                    }
                    else {
                        result = Calculator.add(result, numbers[i]);
                    }
                }
                case "*" -> {
                    if (i==1){
                        result = Calculator.multiply(numbers[i-1], numbers[i]);
                    }

                    else {
                        result = Calculator.multiply(result, numbers[i]);
                    }
                }
                case "-" -> {
                    if (i==1){
                        result = Calculator.sub(numbers[i-1], numbers[i]);
                    }

                    else {
                        result = Calculator.sub(result, numbers[i]);
                    }
                }
                case "/" -> {
                    if (i==1){
                        result = Calculator.div(numbers[i-1], numbers[i]);
                    }

                    else {
                        result = Calculator.div(result, numbers[i]);
                    }
                }
                default -> {
                    System.out.println("Error, option doesn't  exit.");
                    do_i_print = false;
                }
            }
        }
        Logger.log(result, do_i_print);
    }
}
