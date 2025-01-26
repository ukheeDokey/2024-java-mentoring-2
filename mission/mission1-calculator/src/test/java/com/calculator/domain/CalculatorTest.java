package com.calculator.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;
    private int firstNumber;
    private int secondNumber;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        firstNumber = 7;
        secondNumber = 3;
    }

    @Test
    @DisplayName("더하기 테스트")
    void addTest() {
        int expectedResult = 10;
        int actualResult = calculator.add(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("빼기 테스트")
    void subtractTest() {
        int expectedResult = 4;
        int actualResult = calculator.subtract(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void multiplyTest() {
        int expectedResult = 21;
        int actualResult = calculator.multiply(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("나누기 테스트")
    void divideTest() {
        int expectedResult = 2;
        int actualResult = calculator.divide(firstNumber, secondNumber);
        assertEquals(expectedResult, actualResult);
    }
}
