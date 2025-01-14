package com.calculator.controller;

import com.calculator.domain.Calculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {
    private final Calculator calculator;
    private final OutputView outputView;
    private final InputView inputView;

    public CalculatorController(Calculator calculator, InputView inputView, OutputView outputView) {
        this.calculator = calculator;
        this.outputView = outputView;
        this.inputView = inputView;
    }

    private void addResult(int firstNumber, int secondNumber) {
        int add = calculator.add(firstNumber, secondNumber);
        outputView.printAddResult(add);
    }

    private void subtractResult(int firstNumber, int secondNumber) {
        int subtract = calculator.subtract(firstNumber, secondNumber);
        outputView.printSubtractResult(subtract);
    }

    private void multiplyResult(int firstNumber, int secondNumber) {
        int multiply = calculator.multiply(firstNumber, secondNumber);
        outputView.printMultiplyResult(multiply);
    }

    private void divideResult(int firstNumber, int secondNumber) {
        int divide = calculator.divide(firstNumber, secondNumber);
        outputView.printDivideResult(divide);
    }

    public void run() {
        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();

        addResult(firstNumber, secondNumber);
        subtractResult(firstNumber, secondNumber);
        multiplyResult(firstNumber, secondNumber);
        divideResult(firstNumber, secondNumber);
    }
}
