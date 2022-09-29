import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Rock = "Rock";
        String Paper = "Paper";
        String Scissors = "Scissors";


        int userScore = 0;
        int computerScore = 0;
        while (true) {
            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = Rock;
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = Paper;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = Scissors;
            } else {
                System.out.println("Invalid Input. Try Again...");
                return;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(4);
            String computerMove = "";

            switch (computerRandomNumber) {
                case 1:
                    computerMove = Rock;
                    break;
                case 2:
                    computerMove = Paper;
                    break;
                case 3:
                    computerMove = Scissors;
                    break;
            }
            System.out.printf("The computer chose %s.%n", computerMove);

            if (playerMove.equals(Rock) && computerMove.equals(Rock) ||
                    playerMove.equals(Paper) && computerMove.equals(Paper) ||
                    playerMove.equals(Scissors) && computerMove.equals(Scissors)) {
                System.out.println("It's a draw.");
                computerScore++;
                userScore++;

            } else if (playerMove.equals(Rock) && computerMove.equals(Paper) ||
                    playerMove.equals(Paper) && computerMove.equals(Scissors) ||
                    playerMove.equals(Scissors) && computerMove.equals(Rock)) {
                System.out.println("You lose by a lot!!!");
                computerScore++;

            } else if (playerMove.equals(Rock) && computerMove.equals(Scissors) ||
                    playerMove.equals(Paper) && computerMove.equals(Rock) ||
                    playerMove.equals(Scissors) && computerMove.equals(Paper)) {
                System.out.println("You crushed the computer! [MUHAHAHA]");
                userScore++;
            }

            System.out.printf("The score is: user %d : computer %d%n", userScore, computerScore);

            System.out.println("You want to play again ??? [y]es or [n]o.");
            String userChoice = scanner.nextLine();
            if (userChoice.equals("y") || userChoice.equals("yes")) {
                continue;
            } else {
                System.out.printf("You just quit the score is: user %d : computer %d%n", userScore, computerScore);
                break;
            }

        }
    }
}

