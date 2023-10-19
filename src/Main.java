import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        String word = getRandomWord();
        char[] charArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {

          charArray[i]  = word.charAt(i);
        }

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
    public static String render(char[] wordArray, String pickedWord){
        char[] hiddenWord = new char[wordArray.length];
        boolean wordPicked = false;
        for (int i = 0; i < wordArray.length; i++) {
            hiddenWord[i] = '_';
        }


        while(!wordPicked) {
            for (int i = 0; i < hiddenWord.length; i++) {
                System.out.print(hiddenWord[i] + " ");
            }

            System.out.println("Input your choice of one character ONLY:");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            if(userInput.length() > 1){
                System.out.println("You absolute wet towel, can't you follow simple instructions?\n you'll hang for that.");
                System.out.println("___\n  |\n  |\n  O \n (|)" +" \n /|");
                String wetWipe = "You wetwipe";
                return wetWipe;
            }





            char pickedChar = userInput.charAt(0);

            for (int i = 0; i < wordArray.length; i++) {
                if (pickedChar == (wordArray[i])){
                    int indexOfLetter = i;
                    hiddenWord[i] = pickedChar;
                    continue;

                }
            }



        for (int i = 0; i < hiddenWord.length; i++) {
            System.out.print(hiddenWord[i] + " ");
            System.out.println("O fábio tem orelhas");

        }
        return pickedWord;}
}
