import java.util.Scanner;

public class Task1  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userCelsius = 0;
        double userToFahrenheit = 0;
        boolean validType = false;

        do {
            System.out.println("Please enter your current temperature in Celsius:");
            if (scan.hasNextDouble()) {
                validType = true;
                userCelsius = scan.nextDouble();
            } else {
                System.out.println("You have entered an invalid temperature value. Please try again.");
                scan.nextLine();
            }
        } while (!validType);

        userToFahrenheit = ((userCelsius * 1.8) + 32);
        System.out.printf("%-13s%13.2f", "Degrees C:", userCelsius);
        System.out.printf("\n%-13s%13.2f", "Degrees F:", userToFahrenheit);

    }
}
