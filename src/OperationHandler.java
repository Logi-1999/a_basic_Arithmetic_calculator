public class OperationHandler {

    public double calculate(int selectedOperation, double firstInputNumber, double secondInputNumber) {
        switch (selectedOperation) {
            case 1:
                return add(firstInputNumber, secondInputNumber);
            case 2:
                return subtract(firstInputNumber, secondInputNumber);
            case 3:
                return multiply(firstInputNumber, secondInputNumber);
            case 4:
                return divide(firstInputNumber, secondInputNumber);
            case 5:
                return modulus(firstInputNumber, secondInputNumber);
            default:
                throw new IllegalArgumentException("Invalid operation code.");
        }
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Divide by using zero is not possible.");
        }
        return a / b;
    }

    private double modulus(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot perform modulus operation by zero.");
        }
        return a % b;
    }
}
