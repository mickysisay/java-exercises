package org.launchcode.java.studios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Charactercount {
 public static void main(String[] args){
     HashMap<Character , Integer > characters = new HashMap<Character, Integer>();
     String all="";
     try {
         //tries to load txt form file
         String strCurrentLine;
         File f = new File(System.getProperty("user.dir")+"\\src\\org\\launchcode\\java\\studios\\chars.txt");
         BufferedReader reader = new BufferedReader(new FileReader(f));
         while ((strCurrentLine = reader.readLine()) != null) {
            all+=strCurrentLine;

         }
     }catch(Exception e){
         System.out.println("sorry file not found");
     }
     String allWords;
     //if file can't be reached ask user for input
     if(all.isEmpty()){
         Scanner in = new Scanner(System.in);
         System.out.println("enter the word:");
          allWords = in.nextLine().toLowerCase();
     }else{
         allWords=all;
     }

     char[] charsInString = allWords.toCharArray();
     //System.out.println(charsInString);
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
