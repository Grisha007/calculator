package com.kodilla;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator(2,3);

        calculator.add();
        System.out.println("Addition result: " + calculator.add());

        calculator.subtraction();
        System.out.println("Result of the subtraction: " + calculator.subtraction());
    }
}
