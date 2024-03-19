package com.academy2024.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    //addNumber
    @Test
    public void addNumber_shouldReturnCorrectSum_withPositiveNumbers() {
        int result = Calculator.addNumber(5, 3);
        int expectedResult = 8;
        assertEquals(expectedResult, result);
    }

    @Test
    public void addNumber_shouldReturnCorrectSum_withNegativeNumbers() {
        int result = Calculator.addNumber(-3, -5);
        int expectedResult = -8;
        assertEquals(expectedResult, result);
    }

    @Test
    public void addNumber_shouldReturnCorrectSum_withZeroAndNegativeNumbers() {
        int result = Calculator.addNumber(0, -5 );
        int expectedResult = -5;
        assertEquals(expectedResult, result);
    }

    //subtractNumber
    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withPositiveNumbers() {
        int result = Calculator.subtractNumber(3, 5);
        int expectedResult = -2;
        assertEquals(expectedResult, result);
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        int result = Calculator.subtractNumber(-3, -5);
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withZeroAndNegativeNumbers() {
        int result = Calculator.subtractNumber(0, -5);
        int expectedResult = 5;
        assertEquals(expectedResult, result);
    }

    //multiplyNumber
    @Test
    public void multiplyNumbers_shouldReturnCorrectValue_withZeroAndNegativeNumbers() {
        int result = Calculator.multiplyNumber(0, -3);
        int expectedResult = 0;
        assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectNumber_withPositiveNumbers() {
        int result = Calculator.multiplyNumber(3, 4);
        int expectedResult = 12;
        assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        int result = Calculator.multiplyNumber(-3, -5);
        int expectedResult = 2;
        assertEquals(expectedResult, result);
    }

    //divideNumber
    @Test
    public void divideNumbers_shouldReturnCorrectNumber_withPositiveNumbers() {
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withZeroNumber() {
    }

    //bonus
    @Test
    public void divideNumbers_shouldReturnException_whenDividingByZero() {
        int numberOne = 5;
        int numberTwo = 0;

        assertThrows(ArithmeticException.class, () -> {
            Calculator.divideNumber(5, 0);
        }, "Expected ArithmeticException was not thrown.");
    }

    //findRemainder
    @Test
    public void findRemainder_shouldReturnCorrectNumber_withPositiveNumbers() {
    }

    @Test
    public void findRemainder_shouldReturnCorrectValue_withNegativeNumbers() {
    }

    @Test
    public void findRemainder_shouldReturnCorrectValue_withZeroNumber() {
    }

    @Test
    public void findRemainder_shouldReturnException_whenDividingByZero() {
    }
}
