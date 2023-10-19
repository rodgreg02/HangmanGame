import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        String word = getRandomWord();
        char[] charArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
        }
        render(charArray);

    }
    //Used to pick a random word from the pre defined array of words
    public static String getRandomWord(){
        String[] words = {"comunicar","roto","maravilha","milagroso","olhar","cadeira","lugares","escada","janela","cabelo"};
        Random random = new Random();
        return words[random.nextInt(0,9)];
    }

    public static char[] render(char[] wordArray, char charOfPlayer){
        char[] hiddenWord = new char[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            hiddenWord[i] = '_';
        }

        for (int i = 0; i < hiddenWord.length; i++) {
            System.out.print(hiddenWord[i] + " ");
            System.out.println("O fábio tem orelhas");
        }
        return null;
    }
}
