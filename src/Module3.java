// Module 3 CTA
// Option #1: Calculate Average Withholding
// CSC320 - Programming I, Dr. Terrell Brandes
public class Module3 {
    public static void main(String[] args) {
        double weeklyEarnings = 1600; // Example income for the week
        double rate;

        // Determine the tax rate based on weekly earnings
        if (weeklyEarnings < 500) {
            rate = 0.10;
        } else if (weeklyEarnings < 1500) {
            rate = 0.15;
        } else if (weeklyEarnings < 2500) {
            rate = 0.20;
        } else {
            rate = 0.30;
        }

        // Calculate the withholding amount
        double withheldAmount = weeklyEarnings * rate;

        // Display the output
        System.out.println("Customer's weekly earnings: $" + weeklyEarnings);
        System.out.println("Applicable tax rate: " + (rate * 100) + "%");
        System.out.println("Estimated tax withholding: $" + withheldAmount);
    }
}
