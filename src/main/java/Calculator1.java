/**
 * Exercise: https://www.youtube.com/watch?v=jsX3nQN8ESk&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=9
 * @author Farida Fatali
 */

// 1st way creating Calculator App with if-else and switch-case

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Select the operation (+, -, *, /) : ");
        String operation = scanner.next();

        String message = "The result: ";
        double result;

        if (operation.equals("+")) {
            result = a + b;
            System.out.println(message + result);
        } else if (operation.equals("-")) {
            result = a - b;
            System.out.println(message + result);
        } else if (operation.equals("*")) {
            result = a * b;
            System.out.println(message + result);
        } else if (operation.equals("/")) {
            result = (a / b);
            if (b == 0) {
                System.out.println("The second number can't be zero!");
            } else {
                System.out.println(message + result);
            }
        } else {
                System.out.print("Enter the valid operation!");
            }



//        OR
//        switch (operation){
//            case "+":
//                result = a + b;
//                System.out.println(message + result);
//                break;
//            case "-":
//                result = a - b;
//                System.out.println(message + result);
//                break;
//            case "*":
//                result = a * b;
//                System.out.println(message + result);
//                break;
//            case "/":
//                result = a / b;
//                if (b == 0){
//                    System.out.println("The second number can't be zero!");
//                } else {
//                    System.out.println(message + result);
//                }
//                break;
//            default:
//                System.out.println("Enter the correct operation");
//        }
    }
}
