package eu.doomed.operation;

public class Division implements Operation {
    @Override
    public double calculate(double left, double right) {
        return left / right;
    }
}
