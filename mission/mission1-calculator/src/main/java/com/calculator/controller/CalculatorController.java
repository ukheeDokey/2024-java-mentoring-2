package com.calculator.controller;

import com.calculator.domain.Calculator;
import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {
    private final Calculator calculator;
    private final InputView inputView;
    private final OutputView outputView;

    private int firstNumber;
    private int secondNumber;

    public CalculatorController(Calculator calculator, InputView inputView, OutputView outputView) {
        this.calculator = calculator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    private void getNumber(){
        this.firstNumber = inputView.firstNumber();
        this.secondNumber = inputView.secondNumber();
    }

    private void addResult() {
        int add = calculator.add(firstNumber, secondNumber);
        outputView.printAddResult(add);
    }

    private void subtractResult() {
        int subtract = calculator.subtract(firstNumber, secondNumber);
        outputView.printSubtractResult(subtract);
    }

    private void multiplyResult() {
        int multiply = calculator.multiply(firstNumber, secondNumber);
        outputView.printMultiplyResult(multiply);
    }

    private void divideResult() {
        int divide = calculator.divide(firstNumber, secondNumber);
        outputView.printDivideResult(divide);
    }

    public void run() {
        getNumber();
        addResult();
        subtractResult();
        multiplyResult();
        divideResult();
    }

}
