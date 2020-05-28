package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	char[] arr = new char[50];



	getword();

    }

    private static void getword() {
        String word;
        Scanner scanner = new Scanner(System.in);
        word = scanner.next();

        char[] arr = word.toCharArray();

        isPalindrome(arr);


    }




    static void isPalindrome(char[] arr){
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[arr.length - i -1]){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            printOut("Not a Palindrome");
        } else {
            printOut("Is a palindrome");
        }

    }

    static void printOut(String string){
        System.out.print(string);
    }
}
