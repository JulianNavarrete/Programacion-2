package com.company.Calculator.Calc_Enhanced;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Calculator {


    public static int add(Integer ... numbers) {

        Integer result = 0;

        for (Integer num:numbers){

            result = result + num;

        }

        return result;

    }


    public static int multiply(Integer ... numbers) {

        Integer result = 1;

        for (Integer num:numbers){

            result = result * num;

        }

        return result;

    }


    public static int sub(Integer ... numbers) {

        Integer result = 0;

        for (Integer num:numbers){

            result = result - num;

        }

        return result;

    }


    public static int div(Integer ... numbers) {

        Integer result = numbers[0];
        Integer[] modified_numbers = Arrays.copyOfRange(numbers, 0, numbers.length);

        for (Integer num:modified_numbers){

            result = result / num;

        }

        return result;

    }
}
