import java.util.Scanner;

public class Hangman {

    public static Scanner sc = new Scanner(System.in);
    static String word = "DEVELOPER";

    public static void main(String[] args) {
        System.out.println("This is a classic Hangman game. Will you guess a word?");
        System.out.println("---------");
        System.out.println("|HANGMAN|");
        System.out.println("---------");
        System.out.println("Do you want to play? Y/N");
        String userInput = sc.nextLine().toUpperCase();

        if (userInput.equals("YES")){
            System.out.println("Let's play!");
            playGame();
        } else {
            System.out.println("See you next time!");
        }
    }

    private static void playGame() {
    }
}
