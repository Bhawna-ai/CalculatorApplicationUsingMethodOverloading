 public class Calculator {

    // Overloaded add methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide method
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

    

