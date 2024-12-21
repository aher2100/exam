import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.println("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Find the largest of the three numbers
        double largest = Math.max(num1, Math.max(num2, num3));

        // Display the sum of the largest number (which is the number itself in this case)
        System.out.println("The largest number is: " + largest);
        System.out.println("Sum of the largest number is: " + largest);
        
        scanner.close();
    }
}
