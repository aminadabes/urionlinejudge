package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double fuelTotal = X / Y;

        System.out.printf("%.3f km/l%n", fuelTotal);

    }

}
