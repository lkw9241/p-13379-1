package com.back;

public class Calc {
    public static int run(String expression) {
        int num1;
        int num2;

        if (expression.contains(" + ")) {
            String[] expressionBits = expression.split(" \\+ ");

            num1 = Integer.parseInt(expressionBits[0]);
            num2 = Integer.parseInt(expressionBits[1]);

            return num1 + num2;

        } else {
            String[] expressionBits = expression.split(" \\- ");

            num1 = Integer.parseInt(expressionBits[0]);
            num2 = Integer.parseInt(expressionBits[1]);

            return num1 - num2;

        }
    }
}
