import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Wisielec {
    private String word;
    private ArrayList<String> passwordList;
    private char[] hiddenWord;
    private char[] wordInTable;
    private int liczbaProb;

    public void enterWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, set your word: ");
        String enterdWord = scanner.nextLine();
        // ustawienie wyrazu wprowadzonego przez gracza
        setWord(enterdWord);
        // inicjacja ukrytego hasła na podstawie wprowadzonego wyrazu
        initializeHiddenWord();
        scanner.close();
    }

    public void setWord(String newWord){
        this.word = newWord.toLowerCase();
    }
}
