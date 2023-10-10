import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        Scanner scanner = new Scanner(System.in);
        boolean verify = false;
        double meters = 0;

        do {
            System.out.println("Give me a measurement in meters.");

            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                if (meters <= 0) {
                    System.out.println("You have entered an invalid meter measurement. Please try again.");
                } else {
                    verify = true;
                }
            } else {
                System.out.println("You have entered an invalid meter measurement. Please try again.");
            }
            scanner.nextLine();
        } while (!verify);

        System.out.printf("%-7s %.02f\n", "Meters:", meters);
        System.out.printf("%-7s %.02f\n", "Miles:", meters * METERS_TO_MILES);
        System.out.printf("%-7s %.02f\n", "Feet:", meters * METERS_TO_FEET);
        System.out.printf("%-7s %.02f\n", "Inches:", meters * METERS_TO_INCHES);
    }
}