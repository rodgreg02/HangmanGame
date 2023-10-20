import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        String word = getRandomWord();
        String[] charArray = word.split("");

        String hiddenWord = render(charArray, word);
        System.out.println(hiddenWord);
    }
    //Used to pick a random word from the pre defined array of words
    public static String getRandomWord(){
        String[] words = {"comunicar","roto","maravilha","milagroso","olhar","cadeira","lugares","escada","janela","cabelo"};
        Random random = new Random();
        return words[random.nextInt(0,10)];
    }

//Holds major part of game logic and renders game board
    public static String render(String[] wordArray, String pickedWord) {
        String[] hiddenWord = new String[wordArray.length];

        boolean wordPicked = false;
        int count = 0;
        int tries = 7;

        for (int i = 0; i < wordArray.length; i++) {
            hiddenWord[i] = "_";
        }


        System.out.println("Input your choice of one character ONLY: ");

        while (!wordPicked) {
            for (int i = 0; i < hiddenWord.length; i++) {
                System.out.print(hiddenWord[i] + " ");
            }

            System.out.println();
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            if (userInput.length() > 1) {
                System.out.println("You absolute wet towel, can't you follow simple instructions?\n you'll hang for that.");
                System.out.println("___\n  |\n  |\n  O \n (|)" + " \n /|");
                String wetWipe = "You wetwipe";
                return wetWipe;
            }

            for (int i = 0; i < wordArray.length; i++) {
                if (userInput.equals(wordArray[i])) {
                    hiddenWord[i] = userInput;
                    count++;
                }
            }

            if(!pickedWord.contains(userInput)){
                System.out.println("Wrong letter!");
                tries--;
                System.out.println("Tentativas: "+ tries);
            }

            if(tries == 0) {
                return "You lost! Congrats!";
            }

            if(count == hiddenWord.length) {
                System.out.println("NICE! You won!");
                wordPicked = true;
            }

        }
        return pickedWord;
    }
}
