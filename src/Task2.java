import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currentGallons = 0;
        double fuelEff = 0;
        double pricePerGallon = 0;
        double hundredMilePrice;
        double distanceLeft;
        boolean validInputOne = false;
        boolean validInputTwo = false;
        boolean validInputThree = false;

        do {
            do {
                System.out.println("Please enter the current number of gallons of gasoline in your vehicle:");
                if (scan.hasNextDouble()){
                    currentGallons = scan.nextDouble();
                    validInputOne = true;
                }
                else {
                    System.out.println("You have entered an invalid value for gallons of gas. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputOne);
            do {
                System.out.println("Please enter the fuel efficiency of your vehicle in MPG:");
                if (scan.hasNextDouble()) {
                    fuelEff = scan.nextDouble();
                    validInputTwo = true;
                }
                else {
                    System.out.println("You have entered an invalid value for your fuel efficiency. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputTwo);
            do {
                System.out.println("Please enter the current price for a gallon of gas:");
                if (scan.hasNextDouble()) {
                    pricePerGallon = scan.nextDouble();
                    validInputThree = true;
                }
                else {
                    System.out.println("You have entered an invalid value for the price of a gallon of gas. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputThree);
        } while (!(validInputOne || validInputTwo || !validInputThree));
        distanceLeft = currentGallons * fuelEff;
        hundredMilePrice = (100/fuelEff) * pricePerGallon;
        System.out.printf("%-13s%13.2f", "Cost per 100 miles in $:", hundredMilePrice);
        System.out.printf("\n%-13s%14.2f", "Distance Left in Miles:", distanceLeft);
    }
}
