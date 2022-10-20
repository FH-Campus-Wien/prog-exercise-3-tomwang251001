package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

public static void oneMonthCalendar(int count, int day) {

    int row = day - 1;

        System.out.print(" ");
        for (int x = 0; x < day*3-3; x++)
            System.out.print(" ");

    int i = 1;
    while (i <= count) {
        while (row < 7 && i <= count) {
            if (i >= 9 || row == 6)
                System.out.print(i + " ");
            else
                System.out.print(i + "  ");
            row++;
            i++;
        }
        System.out.println();
        if (i < 10)
            System.out.print(" ");
        row = 0;
    }

}




// Implement all methods as public static

    public static void main(String[] args) {
       oneMonthCalendar(30, 5); // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}