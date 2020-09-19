package Madeira.cs;

import java.sql.SQLOutput;
import java.util.Scanner;


        /*
        Author: Ellie Zhou
        Date: 9/15
        Lab3

         */

        public class Main {

            private static Object Scanner;

            public static void main(String[] args) {

                //Part 1

                String myString1 = "please type in your age";
                System.out.println(myString1);
                Scanner myScanner1 = new Scanner(System.in);
                int myScannedinput1 = myScanner1.nextInt();
                if (myScannedinput1 >= 35) {
                    System.out.println("You are allowed to drive, get a tattoo, and run for President of the United States.");
                } else if (myScannedinput1 >= 18) {
                    System.out.println("You are allowed to drive and get a tattoo.");
                } else if (myScannedinput1 >= 16) {
                    System.out.println("You are allowed to drive.");
                } else System.out.println("Congrats, you can do nothing.");

                //Part 2

                System.out.println("please type in your birthmonth");
                String myString2;
                Scanner myScannedinput2 = new Scanner(System.in);
                myString2 = myScannedinput2.nextLine();
                if (myString2.equals("January")) {
                    System.out.println("There are 31 days in January. You are a Capricorn or an Aquarius. " +
                            "You were born in winter");
                } else if (myString2.equals("February")) {
                    System.out.println("There are 28/29 days in February. You are an Aquarius or a Pisces. " +
                            "You were born in winter");
                } else if (myString2.equals("March")) {
                    System.out.println("There are 31 days in March. You are a Pisces or an Aries. " +
                            "You were born in spring");
                } else if (myString2.equals("April")) {
                    System.out.println("There are 30 days in April. You are an Aries or a Taurus. " +
                            "You were born in spring");
                } else if (myString2.equals("May")) {
                    System.out.println("There are 31 days in May. You are a Taurus or a Gemini. " +
                            "You were born in spring");
                } else if (myString2.equals("June")) {
                    System.out.println("There are 30 days in June. You are a Gemini or a Cancer. " +
                            "You were born in summer");
                } else if (myString2.equals("July")) {
                    System.out.println("There are 31 days in July. You are a Cancer or a Leo. " +
                            "You were born in summer");
                } else if (myString2.equals("August")) {
                    System.out.println("There are 31 days in August. You are a Leo or a Virgo. " +
                            "You were born in summer");
                } else if (myString2.equals("September")) {
                    System.out.println("There are 30 days in September. You are a Virgo a Libra. " +
                            "You were born in fall");
                } else if (myString2.equals("October")) {
                    System.out.println("There are 31 days in October. You are a Libra or a Scorpio. " +
                            "You were born in fall");
                } else if (myString2.equals("November")) {
                    System.out.println("There are 30 days in November. You are a Scorpio or a Sagittarius. " +
                            "You were born in fall");
                } else if (myString2.equals("December")) {
                    System.out.println("There are 31 days in December. You are a Sagittarius or a Capricorn. " +
                            "You were born in winter");
                }
                ;

                //Part 3
                System.out.println("Type in the year you were born(yyyy)");
                Scanner myScanner3 = new Scanner(System.in);
                int myScannedInput3 = myScanner3.nextInt();
                System.out.println("Type in the month you were born(mm)");
                Scanner myScanner4 = new Scanner(System.in);
                int myScannedInput4 = myScanner4.nextInt();
                System.out.println("Type in the date you were born(dd)");
                Scanner myScanner5 = new Scanner(System.in);
                int myScannedInput5 = myScanner5.nextInt();
                int year = 2020 * 365 - myScannedInput3 * 365;
                int month = 9 * 30 - myScannedInput4 * 30;
                int days = 19 - myScannedInput5;
                int myScannedInput6 = year + month + days;
                System.out.println("You've' been living for about " + myScannedInput6 + " days.");

            }
        }









                    // write your code here



