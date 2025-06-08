import java.util.Scanner;

// Module 4 CTA
// Option #1: Looping Construct with Floating Point Numbers
// CSC320 - Programming I, Dr. Terrell Brandes
public class Module4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int entries = 0;
        float sum = 0;
        float highest = Float.NEGATIVE_INFINITY;
        float lowest = Float.POSITIVE_INFINITY;

        System.out.println("Please enter 5 numbers:");

        while (entries < 5) {  // Ensure only 5 values are accepted
            if (input.hasNextFloat()) {
                float number = input.nextFloat();
                sum += number;
                if (number > highest) highest = number;
                if (number < lowest) lowest = number;
                entries++;
            } else {
                System.out.println("That wasn't a valid number. Try again:");
                input.next();  // Skip invalid input
            }
        }

        float mean = sum / 5;
        float interestAmount = sum * 0.20f;

        // Output the results
        System.out.println("Sum of values: " + sum);
        System.out.println("Average value: " + mean);
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("20% interest on sum: " + interestAmount);

        input.close();
    }
}
