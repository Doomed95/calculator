package eu.doomed.calculator;

import eu.doomed.ArithmeticOperator;
import eu.doomed.operation.Operation;

import java.util.Map;

public class BasicCalculator extends AbstractCalculator {
    public BasicCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
