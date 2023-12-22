package helloworld;

import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number :");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation do you want to proform \n 1 sum \n 2 sub \n 3 mal \n 4 div \n Select ut option: ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f ", number1, number2, number1 + number2);
            case "sub":
                System.out.printf("%f - %f = %f ", number1, number2, number1 - number2);
                break;
            case "mal":
                System.out.printf("%f * %f = %f ", number1, number2, number1 * number2);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    System.out.printf("%f / %f = %f ", number1, number2, number1 / number2);
                }
                break;

            default:
                System.out.printf("%s is not a supported operation \n", operation);
        }


        scanner.close();
    }

}

