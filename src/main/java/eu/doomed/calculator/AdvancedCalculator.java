package eu.doomed.calculator;

import eu.doomed.ArithmeticOperator;
import eu.doomed.operation.Operation;

import java.util.Map;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
