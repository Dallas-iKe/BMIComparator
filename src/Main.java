import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Person 1 input
        System.out.println("Enter Person 1's weight in kilograms:");
        double weight1 = scanner.nextDouble();
        
        System.out.println("Enter Person 1's height in meters:");
        double height1 = scanner.nextDouble();
        
        // Person 2 input
        System.out.println("Enter Person 2's weight in kilograms:");
        double weight2 = scanner.nextDouble();
        
        System.out.println("Enter Person 2's height in meters:");
        double height2 = scanner.nextDouble();
        
        // Calculate BMI for Person 1
        double bmi1 = weight1 / (height1 * height1);
        
        // Calculate BMI for Person 2
        double bmi2 = weight2 / (height2 * height2);
        
        // Compare the BMIs
        System.out.println("\nPerson 1's BMI: " + bmi1);
        System.out.println("Person 2's BMI: " + bmi2);
        
        if (bmi1 > bmi2) {
            System.out.println("Person 1 has a higher BMI.");
        } else if (bmi1 < bmi2) {
            System.out.println("Person 2 has a higher BMI.");
        } else {
            System.out.println("Both persons have the same BMI.");
        }
        
        scanner.close();
    }
}
