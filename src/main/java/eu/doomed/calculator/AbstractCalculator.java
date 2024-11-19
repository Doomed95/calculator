package eu.doomed.calculator;

import eu.doomed.ArithmeticOperator;
import eu.doomed.Operands;
import eu.doomed.operation.Operation;

import java.util.Map;

public abstract class AbstractCalculator {
    private final String name;
    private final Map<ArithmeticOperator, Operation> operationMap;

    public AbstractCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        this.name = name;
        this.operationMap = operationMap;
    }

    public double calculate(Operands operands, ArithmeticOperator operator) {
        if (this.operationMap.containsKey(operator)) {
            final Operation operation = this.operationMap.get(operator);
            final double result = this.calculateResults(operands, operation);
            this.printResult(result);
            return result;
        } else {
            throw new IllegalArgumentException("Calculator doesn't support operation: " + operator);
        }

    }

    private double calculateResults(Operands operands, Operation operation) {
        final double result = operation.calculate(operands.left(), operands.right());
        return result;
    }

    private void printResult(double result) {
        System.out.println(this.name + " calculated result " + result);
    }
}
