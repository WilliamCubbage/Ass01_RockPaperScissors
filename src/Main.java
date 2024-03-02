import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;
        String playerOneInput = "";
        String playerTwoInput = "";
        boolean validInput1;
        boolean validInput2;
        boolean validInput3;
        String playerOne = "Let's play Paper, Rock, Scissors! Player One, Paper (P), Rock (R), or Scissors (S)? Please enter P, R, or S: ";
        String playerTwo = "Player Two, Paper (P), Rock (R), or Scissors (S)? Please enter P, R, or S: ";
        String thanks = "Thanks for playing!";
        String results = "";

        while (playAgain) {
            do {
                System.out.println(playerOne);
                playerOneInput = in.nextLine().toUpperCase(); // Input from Player One that gets converted to Uppercase
                validInput1 = playerOneInput.equals("P") || playerOneInput.equals("R") || playerOneInput.equals("S"); // Checks if input is a valid letter
                if (!validInput1)
                    System.out.println("Invalid input, try again. P, R, S?"); // Invalid Input
            }
            while (!validInput1);

            do {
                System.out.println(playerTwo);
                playerTwoInput = in.nextLine().toUpperCase(); // Input from Player Two that gets converted to Uppercase
                validInput2 = playerTwoInput.equals("P") || playerTwoInput.equals("R") || playerTwoInput.equals("S"); //Checked if input is valid letter
                if (!validInput2)
                    System.out.println("Invalid input, try again. P, R, S?"); // Invalid Input
            }
            while (!validInput2);

            if (playerOneInput.equals(playerTwoInput)) {
                System.out.println("It's a tie!"); // Outcome if inputs are the same.

            } else if
            ((playerOneInput.equals("P") && playerTwoInput.equals("R")) ||
                            (playerOneInput.equals("R") && playerTwoInput.equals("S")) || //these compare to see if player one wins
                            (playerOneInput.equals("S") && playerTwoInput.equals("P"))) {
                System.out.println("Player One wins!");

            } else {
                System.out.println("Player Two wins!"); // if the above do not pass that means player 2 wins
            }
            System.out.println(thanks); //thanks for playing message

            do {
                System.out.println("Would you like to play again? (yes or no)"); // asking if you'd like to play again
                String playAgainInput = in.nextLine().toLowerCase();
                validInput3 = playAgainInput.equals("yes") || playAgainInput.equals("no");
                playAgain = playAgainInput.equals("yes");
                if (!validInput3)
                    System.out.println("Incorrect input, yes or no?");
                else if (playAgainInput.equals("yes"))
                    playAgain = true;
                else
                    playAgain = false;
            }
            while (!validInput3);

        }
    }
}
