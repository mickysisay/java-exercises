package org.launchcode.java.studios;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Charactercount {
 public static void main(String[] args){
     HashMap<Character , Integer > characters = new HashMap<Character, Integer>();
     Scanner in = new Scanner(System.in);
     System.out.println("enter the word:");
     String allWords = in.nextLine().toLowerCase();
     char[] charsInString = allWords.toCharArray();
     System.out.println(charsInString);
     for(char letters : charsInString){
       if(Character.isLetter(letters)){
         if(characters.containsKey(letters)){
             characters.put(letters , characters.get(letters)+1);
         }else{
             characters.put(letters , 1);
         }
       }
     }
     for(Map.Entry<Character,Integer> allLetters : characters.entrySet()){
         System.out.println(allLetters.getKey()+" : "+allLetters.getValue());
     }

 }
}
