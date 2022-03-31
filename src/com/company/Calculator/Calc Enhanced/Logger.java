package com.company.calcImproved;

public class Logger {

    public static void log(Integer result,String operator , Integer num1, Integer num2, Boolean do_i_print) {

        if (do_i_print) {

            System.out.println("\n" + num1 + operator + num2 + " = " + result);

        }


    }

}
