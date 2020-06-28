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

        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j++;
                return true;
            } else{
                return false;
            }

        }


        printOut(s + String.valueOf(i) + String.valueOf(j));

        return false;

    }

    static void printOut(String string){
        System.out.print(string);
    }
}
