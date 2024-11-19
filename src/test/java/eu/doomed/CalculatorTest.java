package eu.doomed;

import eu.doomed.calculator.CalculatorHolder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final CalculatorHolder calculatorHolder = new CalculatorHolder();
    private final Operands operands = new Operands(5, 10);

    @Test
    public void testAddition() {
        final ArithmeticOperator operator = ArithmeticOperator.ADDITION;
        final double expected = 15;
        final double result = calculatorHolder.calculateResults(operands, operator);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        final ArithmeticOperator operator = ArithmeticOperator.SUBTRACTION;
        final double expected = -5;
        final double result = calculatorHolder.calculateResults(operands, operator);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        final ArithmeticOperator operator = ArithmeticOperator.MULTIPLICATION;
        final double expected = 50;
        final double result = calculatorHolder.calculateResults(operands, operator);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        final ArithmeticOperator operator = ArithmeticOperator.DIVISION;
        final double expected = 0.5;
        final double result = calculatorHolder.calculateResults(operands, operator);
        Assertions.assertEquals(expected, result);
    }
}
