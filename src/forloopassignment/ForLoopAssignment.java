/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopassignment;

/**
 *
 * @author carateresa
 */
public class ForLoopAssignment {

    //<editor-fold defaultstate="collapsed" desc="Question 1">
    private static void printStar() {
        System.out.println("Print Star");
        System.out.println("-----------");
        for (int loopCounter = 0; loopCounter < 7; loopCounter++) {
            System.out.print("*");
        }
        System.out.println("");
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 2">
    public static void printAlphaNumNine(String alphanum) {
        System.out.println("AlphaNum");
        System.out.println("----------");
        for (int alphaNumNine = 0; alphaNumNine < 9; alphaNumNine++) {
            System.out.print(alphanum);
        }
        System.out.println("");
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 3">
    private static void printRepeatAlphaNum(String alphanum, int repeat) {
//        System.out.println("Repeat AlphaNum (" + alphanum + "," + repeat + ")");
        System.out.printf("Repeat AlphaNum (%s,%2d)\n", alphanum, repeat);
        System.out.println("---------------------");
        for (int loopCounter = 0; loopCounter < repeat; loopCounter++) {
            System.out.print("T");
        }
        System.out.println("");

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 4">
    private static void printStarGrid(int rows, int columns) {
        System.out.printf("Star Grid (%s,%2d)\n", rows, columns);
        System.out.println("---------------------");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 5">
    private static void printDescending(int rows, int columns) {
        System.out.println("Descending");
        System.out.println("---------------------");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns - row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 6 (werk)">
    private static void printDescendingValue(int rows, int columns) {
        System.out.println("Descending Value");
        System.out.println("---------------------");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns - row; col++) {
                System.out.print("*");
//
            }
            System.out.println("");
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 7">
    private static void countDown(int startValue) {
        System.out.println("Countdown");
        System.out.println("---------------------");
        for (int countDown = 1; countDown <= 10; countDown++) {
            System.out.println(countDown);

        }
        System.out.println("...Liftoff!");
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 8">
    public static void printSum(int startValue, int endValue) {
        int sum = 0;
        for (int i = startValue; i <= endValue; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 9">
    public static void zigZagZug() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            if ((i % 2) == 0) {
                System.out.print("Zig");
            } else if ((i % 3) == 0) {
                System.out.println("Zag");

            } else if ((i % 4) == 0) {
                System.out.println("Zug");

            }
            System.out.println("");
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Question 10">
public static void printTimesTableFormatted(int rows, int columns) {
    for (int row=0; row <=3; row++){
        for (int col = 0; col <=5; col++){
            int product = row * col;
            System.out.print(product + "");
        }
        System.out.println("");
    }
}
//</editor-fold>
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printStar();
        printAlphaNumNine("B");
        printRepeatAlphaNum("T", 6);
        printStarGrid(3, 9);
        printDescending(7, 7);
//        printDescendingValue(1);
        countDown(1);
        printSum(20, 25);
        zigZagZug();
        printTimesTableFormatted(4,5);

    }

}
