package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        getWord();


    }

    private static void getWord() {
        String word;
        Scanner scanner = new Scanner(System.in);
        word = scanner.next();

        printOut(String.valueOf(isPalindrome(word, 0,word.length() -1)));

    }


    static boolean isPalindrome(String s, int i, int j){
        boolean flag = false;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                flag = true;
            } else{
               return isPalindrome(s, ++i, j) || isPalindrome(s,i, --j);
            }
        }
        return flag;
    }

    static void printOut(String string){
        System.out.print(string);
    }
}
