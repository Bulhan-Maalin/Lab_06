import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rectLeft = 0;
        double rectTop = 0;
        double rectRight = 0;
        double rectBottom = 0;
        boolean validInputOne = false;
        boolean validInputTwo = false;
        boolean validInputThree = false;
        boolean validInputFour = false;
        double rectArea = 0;
        double rectPer = 0;
        double rectDiag = 0;

        do {
            do {
                System.out.println("Please enter the length of the left of the rectangle:");
                if (scan.hasNextDouble()) {
                    rectLeft = scan.nextDouble();
                    if (rectLeft > 0) {
                        validInputOne = true;
                    } else {
                        System.out.println("You have entered an invalid side length. Please try again.");
                        scan.nextLine();
                    }
                } else {
                    System.out.println("You have an invalid side length. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputOne);
            do {
                System.out.println("Please enter the length of the top of the rectangle:");
                if (scan.hasNextDouble()) {
                    rectTop = scan.nextDouble();
                    if (rectTop > 0) {
                        validInputTwo = true;
                    } else {
                        System.out.println("You have entered an invalid side length. Please try again.");
                        scan.nextLine();
                    }
                } else {
                    System.out.println("You have an invalid side length. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputTwo);
            do {
                System.out.println("Please enter the length of the right of the rectangle:");
                if (scan.hasNextDouble()) {
                    rectRight = scan.nextDouble();
                    if (rectRight > 0) {
                        validInputThree = true;
                    } else {
                        System.out.println("You have entered an invalid side length. Please try again.");
                        scan.nextLine();
                    }
                } else {
                    System.out.println("You have an invalid side length. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputThree);
            do {
                System.out.println("Please enter the length of the bottom of the rectangle:");
                if (scan.hasNextDouble()) {
                    rectBottom = scan.nextDouble();
                    if (rectBottom > 0) {
                        validInputFour = true;
                    } else {
                        System.out.println("You have entered an invalid side length. Please try again.");
                        scan.nextLine();
                    }
                } else {
                    System.out.println("You have an invalid side length. Please try again.");
                    scan.nextLine();
                }
            } while (!validInputFour);
        } while (!validInputOne || !validInputTwo || !validInputThree || !validInputFour);
        rectArea = rectLeft * rectTop;
        rectPer = rectLeft + rectTop + rectRight + rectBottom;
        rectDiag = Math.sqrt(Math.pow(rectLeft, 2) + Math.pow(rectTop, 2));

        System.out.printf("%-13s%13.2f", "Side 1:", rectLeft);
        System.out.printf("\n%-13s%13.2f", "Side 2:", rectTop);
        System.out.printf("\n%-13s%13.2f", "Area:", rectArea);
        System.out.printf("\n%-13s%13.2f", "Perimeter:", rectPer);
        System.out.printf("\n%-13s%13.2f", "Diagonal:",rectDiag);



    }
}
