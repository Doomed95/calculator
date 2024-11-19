package eu.doomed;

import eu.doomed.calculator.CalculatorHolder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static CalculatorHolder calculatorHolder = new CalculatorHolder();

    public static void main(String[] args) {
        do {
            System.out.println("Write number, then type of operator (+, - ,* , /) and then write a number again");

            final double left, right;
            final ArithmeticOperator operator;

            try {
                left = scanner.nextDouble();
                final String line = scanner.next();
                operator = ArithmeticOperator.getFromSymbol(line);
                right = scanner.nextDouble();
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            final Operands operands = new Operands(left, right);
            calculatorHolder.calculateResults(operands, operator);
        } while (true);
    }
}
