package javaproblems;

import java.util.Scanner;

/* Hacker Rank String Reverse problem */

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String reversedString = "";
        String normalString = scan.nextLine();


        for (int i = normalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + normalString.charAt(i);
        }

        if(normalString.equals(reversedString)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}