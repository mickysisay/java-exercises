package exercises;
import java.util.Scanner;
public class Searchalice {
    public static void main(String[] args){
    String aliceStr = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
    Scanner in = new Scanner(System.in);
    System.out.println("enter Word you wan to search:");
    String word = in.next().toLowerCase();
    System.out.println(aliceStr.toLowerCase().contains(word));
    }
}
