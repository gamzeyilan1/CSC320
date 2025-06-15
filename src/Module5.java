// Module 5 CTA
// Option #1: Get Weekly Temperatures
// CSC320 - Programming I, Dr. Terrell Brandes
import java.util.*;

public class Module5 {
    public static void main(String[] args) {
        // List of weekdays
        ArrayList<String> weekDays = new ArrayList<>(Arrays.asList(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        // List of temperatures for each day
        ArrayList<Double> dailyTemps = new ArrayList<>(Arrays.asList(
                18.2, 19.6, 17.9, 20.4, 21.0, 22.3, 19.1));

        Scanner scanner = new Scanner(System.in);

        // Loop until user enters "week"
        while (true) {
            System.out.println("Type a weekday name or enter 'week' to see all:");
            String userInput = scanner.nextLine();

            // If user wants to see the whole week's data
            if (userInput.equalsIgnoreCase("week")) {
                double total = 0;

                // Print each day's temperature and calculate total
                for (int i = 0; i < weekDays.size(); i++) {
                    System.out.println(weekDays.get(i) + " temperature: " + dailyTemps.get(i));
                    total += dailyTemps.get(i);
                }

                // Calculate and print weekly average temperature
                double avg = Math.round((total / dailyTemps.size()) * 100.0) / 100.0;
                System.out.println("Average temperature for the week: " + avg);
                break;
            } else {
                // Format input to match list format and find index
                int foundIndex = weekDays.indexOf(formatInput(userInput));

                // If valid day is found, print temperature
                if (foundIndex != -1) {
                    System.out.println("Temperature on " + weekDays.get(foundIndex) + ": " + dailyTemps.get(foundIndex));
                } else {
                    // If input is not valid
                    System.out.println("Invalid day entered.");
                }
            }
        }

        // Close scanner to avoid resource leak
        scanner.close();
    }

    // Capitalizes first letter of input and makes the rest lowercase
    private static String formatInput(String input) {
        if (input.isEmpty()) return input;
        return input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
    }
}