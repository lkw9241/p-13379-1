package com.back;

public class Calc {
    public static int run(String expression) {
        int num1;
        int num2;
        int result=0;

        if (expression.contains(" + ")) {
            String[] expressionBits = expression.split(" \\+ ");

            for(int i =0 ; i<expressionBits.length; i++){

            result += Integer.parseInt(expressionBits[i]);
            }
            return result;

        } else {
            String[] expressionBits = expression.split(" \\- ");

            num1 = Integer.parseInt(expressionBits[0]);
            num2 = Integer.parseInt(expressionBits[1]);


            return num1 - num2 ;

        }
    }
}
