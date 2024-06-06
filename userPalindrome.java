import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class userPalindrome {
public static String isPalindrome(String str) {
    
    StringBuilder cleanedStr = new StringBuilder();
    for (char ch : str.toCharArray()) {
        if (Character.isLetterOrDigit(ch)) {
            cleanedStr.append(Character.toLowerCase(ch));
        }
    }

    int left = 0;
    int right = cleanedStr.length() - 1;

    while (left < right) {
        if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
            return "False";
        }
        left++;
        right--;
    }
      
    return "True";
    
    
}
public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    String user_word;
    System.out.print("Please enter a word: ");
    user_word = scanner.nextLine();
    System.out.println("Is the input a palindrome? " + isPalindrome(user_word));
    scanner.close();
        
        }
    }



           
      
      
      
      
      
      
      
      
      
      
     