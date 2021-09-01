package assessment;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = inputReader.nextInt();

        System.out.printf("Your maximum heart rate should be %d beats per minute\n", 220 - age);

        System.out.printf("Your target HR Zone is %.0f - %.0f beats per minute", 0.5 * (220 - age), 0.85 * (220 - age));
    }
}
