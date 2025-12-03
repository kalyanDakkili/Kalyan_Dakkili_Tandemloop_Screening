import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
                return a + b;
            case "subtract":
            case "subtraction":
                return a - b;
            case "multiply":
            case "multiplication":
                return a * b;
            case "divide":
            case "division":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Problem1_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);
        sc.close();
    }
}
