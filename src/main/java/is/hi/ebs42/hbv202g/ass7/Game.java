package is.hi.ebs42.hbv202g.ass7;

//Rock paper scissors game
public class Game {
    public static void main(String[] args) {
        int player = 0;
        int computer = 0;
        String result = "";
        while (player < 2 && computer < 2) {
            //game play
            if (player == 0) {
                player = (int) (Math.random() * 3);
            }
            //computer play
            if (computer == 0) {
                computer = (int) (Math.random() * 3);
            }

            //show the game result

            if (player == computer) {
                //print  result
                result = "draw";
                System.out.println("Draw");
            } else if (player == 0 && computer == 2) {
                result = "computer wins";
                System.out.println("computer wins");
            } else if (player == 1 && computer == 2) {
                result = "player wins";
                System.out.println("player wins");
            } else if (player == 2 && computer == 1) {
                result = "computer wins";
                System.out.println("computer wins");
            } else if (player == 2 && computer == 0) {
                result = "player wins";
                System.out.println("player wins");
            } else if (player == 0 && computer == 1) {
                result = "computer wins";
                System.out.println("computer wins");
            }
        }
    }
}


