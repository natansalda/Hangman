import java.util.Scanner;

public class Hangman {

    public static Scanner sc = new Scanner(System.in);
    public static String word;
    public static char a;

    public static void main(String[] args) {
        System.out.println("This is a classic Hangman game. Will you guess a word?");
        System.out.println("---------");
        System.out.println("|HANGMAN|");
        System.out.println("---------");
        System.out.println("Do you want to play? Y/N");
        String userInput = sc.nextLine().toUpperCase();

        if (userInput.equals("Y")) {
            System.out.println("Let's play!");
            System.out.println("");
            playGame(word);
        } else {
            System.out.println("See you next time!");
        }
    }

    public static void playGame(String word) {

        Hangman.word = word;
        word = "DEVELOPER";
        for (int i = 0; i < word.length(); i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("Podaj literę:");
        guessLetter(a);
    }

    private static void guessLetter(char a) {
        String letter = sc.nextLine().toUpperCase();

        switch (letter) {
            case "D":
                System.out.println("D--------");
                break;
            case "E":
                System.out.println("-E-E---E-");
                break;
            case "V":
                System.out.println("--V-----");
                break;
            case "L":
                System.out.println("----L----");
                break;
            case "O":
                System.out.println("-----O---");
                break;
            case "P":
                System.out.println("------P--");
                break;
            case "R":
                System.out.println("--------R");
                break;
            default:
                System.out.println("There is no that letter in giver word");
        }
    }
}
