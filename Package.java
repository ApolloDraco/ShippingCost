/* 
 *  Description: A Java Program that calculates shipping cost of a package given the weight in pounds
*/

import java.util.Scanner;

public class Package {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the weight of the package
        System.out.print("Enter the weight of the package in pounds: ");
        double weight = input.nextDouble();

        // Calculate the cost of shipping
        double costPerPound;
        if (weight <= 0) {
            System.out.println("Invalid input. Weight must be greater than 0.");
        } else if (weight > 50) {
            System.out.println("The package cannot be shipped. Maximum weight limit is 50 pounds.");
        } else if (weight <= 1) {
            costPerPound = 3.5;
            System.out.printf("Shipping cost of package is $%.2f\n", costPerPound * weight);
        } else if (weight <= 3) {
            costPerPound = 5.5;
            System.out.printf("Shipping cost of package is $%.2f\n", costPerPound * weight);
        } else if (weight <= 10) {
            costPerPound = 8.5;
            System.out.printf("Shipping cost of package is $%.2f\n", costPerPound * weight);
        } else {
            costPerPound = 10.5;
            System.out.printf("Shipping cost of package is $%.2f\n", costPerPound * weight);
        }
    }
}
