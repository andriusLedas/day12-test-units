package com.academy2024.task1;

public class Calculator {

    public static int addNumber(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int subtractNumber(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int multiplyNumber(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    //bonus to implement it with exception
    public static float divideNumber(int numberOne, int numberTwo) {
        if (numberTwo != 0) {
            return (float) numberOne / numberTwo;
        } else {
            throw new ArithmeticException(
                    "Division by zero is not allowed.");
        }
    }

    public static int findRemainder(int numberOne, int numberTwo) {
        if (numberTwo != 0) {
            return numberOne % numberTwo;
        } else {
            throw new ArithmeticException(
                    "Division by zero is not allowed.");
        }
    }
}
