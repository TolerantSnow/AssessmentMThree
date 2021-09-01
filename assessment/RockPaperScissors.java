package assessment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static Scanner inputReader = new Scanner(System.in);
    static Random rand = new Random();
    static boolean running = true;

    public static void main(String[] args) {

        //loop for multiple rounds
        game_loop: while(running) {

            System.out.print("How many rounds do you want to play? ");
            int total_rounds = inputReader.nextInt();
            inputReader.nextLine();

            if (total_rounds > 10 || total_rounds < 1) {
                System.out.println("Number must be positive and at most 10. Stopping game.");
                break game_loop;
            }
            int wins = 0, ties = 0, losses = 0;
            //loop for each round
            for(int round = 1; round <= total_rounds; round++) {
                System.out.print("Rock, Paper, or Scissors? (1 = rock, 2 = paper, 3 = scissors): ");
                int play = inputReader.nextInt();
                inputReader.nextLine();
                int computer_play = rand.nextInt(3) + 1;
                if(computer_play == play) {
                    ties++;
                    System.out.println("Round ends in a draw.");
                } else if(computer_play - 1 == play || (computer_play == 1 && play == 3)) {
                    losses++;
                    System.out.println("Round ends in a loss.");
                } else {
                    wins++;
                    System.out.println("Round ends in a win.");
                }
            }
            if(wins == losses) {
                //draw
                System.out.print("Game ended in a draw, would you like to play again? (Yes/No): ");
            }
            else if(wins > losses) {
                //win
                System.out.print("Game ended in victory!!! Would you like to play again? (Yes/No): ");
            }
            else if(losses > wins) {
                //loss
                System.out.print("Computer won this time, would you like to play again? (Yes/No): ");
            }
            String response = inputReader.nextLine();
            if(response.equalsIgnoreCase("Yes")) {
                continue game_loop;
            }
            System.out.println("Thanks for playing!");
            running = false;
        }
    }
}
