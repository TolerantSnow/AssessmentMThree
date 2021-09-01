package assessment;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("What is your dog's name? ");
        String name = inputReader.nextLine();
        System.out.printf("Well then, I have this highly reliable report on %s's prestigious background right here.\n", name);

        System.out.printf("%s is: \n\n", name);

        //generate 4 random points between 0 and 1, and sort them. this will be the cutoffs between the 5 breeds
        double[] troughs = {rand.nextDouble(), rand.nextDouble(), rand.nextDouble(), rand.nextDouble()};
        Arrays.sort(troughs);

        String[] dog_breeds = {"St. Bernard", "Chihuahua", "Pug", "Poodle", "King Doberman"};

        //print the breeds alongside their percentages (anything not adding up to 100 is due to rounding)
        for(int index = 0; index < dog_breeds.length; index++) {
            System.out.printf("%.0f%% %s\n", ((index < 4 ? troughs[index] : 1) - (index > 0 ? troughs[index - 1] : 0)) * 100.0, dog_breeds[index]);
        }

        System.out.print("\nWow, that's QUITE the dog!");
    }
}
