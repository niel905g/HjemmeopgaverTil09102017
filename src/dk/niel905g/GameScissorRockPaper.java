package dk.niel905g;
// Opgave 3.17
import java.util.Scanner;

public class GameScissorRockPaper {
    //
    public static void main(String[] Strings) {
        //Declaring and initiating the variables

        Scanner input = new Scanner(System.in);

        int computerHand = (int) (Math.random() * 3);


        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int playerHand = input.nextInt();

        String computer = getHand(computerHand);
        String player = getHand(playerHand);
        String gameStats = getGameStatus(computerHand, playerHand);
        System.out.println("The computer is " + computer + ". You are " + player + ". " + gameStats+ ".");

    }

    public static String getHand(int hand) {

        String handString;
        switch (hand) {
            case 0: handString = "scissor"; break;
            case 1: handString = "rock"; break;
            case 2: handString = "paper"; break;
            default:
                handString = null;
        }
        return handString;
    }

    public static String getGameStatus(int computer, int player) {
        if (computer == player) return "It's a draw";

        String status = "";
        switch (player) {
            case 0: status = (computer != 1) ? "You won" : "You lost"; break;
            case 1: status = (computer != 2) ? "You won" : "You lost"; break;
            case 2: status = (computer != 0) ? "You won" : "You lost"; break;
        }

        return status;
    }
}


