package javaproblems;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/* Hacker Rank Primitive Data Types*/

public class DataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }

        findDay(8,05,2015);


    }
    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.MONTH, month);
        System.out.println(month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR,year);

        String weekDay = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

        return weekDay;

    }



}
