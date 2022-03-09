import java.util.Locale;
import java.util.Scanner;

public class CheckAllLetters{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
//        str = str.toLowerCase();
       boolean ans = isContainsAllLetter(str);
        System.out.println(ans);
    }

    public static boolean isContainsAllLetter(String str){
        int[] arr = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch - 'a' >= 0 && ch - 'a' < arr.length) arr[ch - 'a']++;
        }

        for(int i : arr){
            if(i == 0) return false;
        }

        return true;
    }
}

//time complexity = O(length of string) + O(26)
// space complexity = O(1)

//abcdefghijklmnopqrstuvwxyzjdbfbdsjfbjbfjeb