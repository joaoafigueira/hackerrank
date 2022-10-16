package javaproblems;

import java.util.Scanner;

/* Hacker Rank End of File */

public class EndOfFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 1;

        while (scan.hasNext()) {
            System.out.printf(count + " " + scan.nextLine());
            count++;
        }
        scan.close();

    }


}
