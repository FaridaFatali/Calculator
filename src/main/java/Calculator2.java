import java.util.Scanner;

// 2nd way creating Calculator App with if-else and switch-case

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Select the operation:\n1: +\n2: -\n3: *\n4: /");
        int operation = scanner.nextInt();

        String message = "The result: ";
        double result;

        if(operation == 1){
            System.out.println(message + (a + b));
        } else if (operation == 2){
            System.out.println(message + (a - b));
        } else if (operation == 3) {
            System.out.println(message + (a * b));
        } else if (operation == 4) {
            if (b == 0) {
                System.out.println("The second number can't be zero!");
            } else {
                System.out.println(message + (a / (double) b));
            }
        } else {
            System.out.println("Enter the valid operation!");
        }


//        OR
//        switch (operation){
//            case 1:
//                System.out.println(message + (a + b));
//                break;
//            case 2:
//                System.out.println(message + (a - b));
//                break;
//            case 3:
//                System.out.println(message + (a * b));
//                break;
//            case 4:
//                if (b == 0){
//                    System.out.println("The second number can't be zero!");
//                } else {
//                    System.out.println(message + (a / (double) b));
//                }
//                break;
//            default:
//                System.out.println("Enter the valid operation!");
//        }
    }
}
