import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
        System.out.println("Choose an operation: ");
        System.out.println("add");
        System.out.println("subtract");
        System.out.println("multiply");
        System.out.println("divide");
        String operation = getString("end");
        System.out.println("");

        Calculator calculator = new Calculator();
        
        if (operation.equals("add")) {
            //double num1 = getDouble("First number: ");
            //double num2 = getDouble("Second number: ");
            System.out.println("Enter two numbers?");
            double num1 = inputScanner.nextDouble();
            double num2 = inputScanner.nextDouble();
            double resultAdd = calculator.add(num1, num2);
            System.out.printf("%.1f + %.1f = %.1f%n", num1, num2, resultAdd);
            System.out.println("");
        }
        
        if (operation.equals("subtract")) {
            double num1 = getDouble("First number: ");
            double num2 = getDouble("Second number: ");
            double resultSub = calculator.subtract(num1, num2);
            System.out.printf("%.1f - %.1f = %.1f%n", num1, num2, resultSub);
            System.out.println("");
        }
        
        if (operation.equals("multiply")) {
            double num1 = getDouble("First number: ");
            double num2 = getDouble("Second number: ");
            double resultMult = calculator.multiply(num1, num2);
            System.out.printf("%.1f * %.1f = %.1f%n", num1, num2, resultMult);
            System.out.println("");
        }
        
        if (operation.equals("divide")) {
            double num1 = getDouble("First number: ");
            double num2 = getDouble("Second number: ");
            if (num2 == 0) {
               System.out.println("Number cannot be divided by 0"); 
            }
            else {
                double resultDiv = calculator.divide(num1, num2);
                System.out.printf("%.1f / %.1f = %.1f%n", num1, num2, resultDiv);
                System.out.println("");
            }
        }
        
        if (operation.equals("end")) {
            System.out.println("Goodbye");
            break;
        }
        }
        
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        String stringInput = inputScanner.nextLine();
        return stringInput;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double doubleInput = inputScanner.nextDouble();
        inputScanner.nextLine();
        return doubleInput;
    }

    
}