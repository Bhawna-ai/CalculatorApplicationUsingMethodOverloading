import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    public void performAddition() {
        try {
            System.out.println("\nChoose type of addition:");
            System.out.println("1. Add two integers");
            System.out.println("2. Add two doubles");
            System.out.println("3. Add three integers");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first integer: ");
                    int a1 = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int b1 = sc.nextInt();
                    System.out.println("Result: " + calc.add(a1, b1));
                    break;

                case 2:
                    System.out.print("Enter first double: ");
                    double a2 = sc.nextDouble();
                    System.out.print("Enter second double: ");
                    double b2 = sc.nextDouble();
                    System.out.println("Result: " + calc.add(a2, b2));
                    break;

                case 3:
                    System.out.print("Enter first integer: ");
                    int x = sc.nextInt();
                    System.out.print("Enter second integer: ");
                    int y = sc.nextInt();
                    System.out.print("Enter third integer: ");
                    int z = sc.nextInt();
                    System.out.println("Result: " + calc.add(x, y, z));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
            sc.nextLine(); 
        }
    }

    public void performSubtraction() {
        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            System.out.println("Result: " + calc.subtract(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    public void performMultiplication() {
        try {
            System.out.print("Enter first double: ");
            double a = sc.nextDouble();
            System.out.print("Enter second double: ");
            double b = sc.nextDouble();
            System.out.println("Result: " + calc.multiply(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    public void performDivision() {
        try {
            System.out.print("Enter numerator (int): ");
            int a = sc.nextInt();
            System.out.print("Enter denominator (int): ");
            int b = sc.nextInt();

            try {
                double result = calc.divide(a, b);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Welcome to the Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        performAddition();
                        break;
                    case 2:
                        performSubtraction();
                        break;
                    case 3:
                        performMultiplication();
                        break;
                    case 4:
                        performDivision();
                        break;
                    case 5:
                        System.out.println("Exiting... Thank you!");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                choice = 0;
            }

        } while (choice != 5);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
