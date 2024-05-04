package badia;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = getUserInput(scanner, "Enter first number: ");
        int num2 = getUserInput(scanner, "Enter second number: ");
        
        int sum = Adder.add(num1, num2);
        
        displayResult(num1, num2, sum);
        
        scanner.close();
    }
    
    private static int getUserInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        return input;
    }
    
    private static void displayResult(int num1, int num2, int sum) {
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
