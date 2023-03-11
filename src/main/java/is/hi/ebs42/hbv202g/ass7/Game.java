package is.hi.ebs42.hbv202g.ass7;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Let's play Rock Paper Scissors!");
            System.out.print("Choose rock (r), paper (p), or scissors (s): ");
            String userChoice = input.nextLine().toLowerCase();
            String computerChoice = "";
            switch (random.nextInt(3)) {
                case 0:
                    computerChoice = "r";
                    System.out.println("Computer chooses rock.");
                    break;
                case 1:
                    computerChoice = "p";
                    System.out.println("Computer chooses paper.");
                    break;
                case 2:
                    computerChoice = "s";
                    System.out.println("Computer chooses scissors.");
                    break;
            }

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("r") && computerChoice.equals("s")
                    || userChoice.equals("p") && computerChoice.equals("r")
                    || userChoice.equals("s") && computerChoice.equals("p")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = input.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
