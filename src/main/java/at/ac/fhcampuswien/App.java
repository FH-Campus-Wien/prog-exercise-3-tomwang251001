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


public static long[] lcg(long seed) {

    long[] numbers = new long[10];

    long x;
    long m = (long) Math.pow(2, 31);
    long a = 1103515245;
    int c = 12345;

    for (int i = 0; i < numbers.length; i++) {
        if (i == 0)
            x = seed;
        else {
            x = numbers[i - 1];
        }
        numbers[i] = (a*x+c) % m;
    }
    return numbers;
}


public static int randomNumberBetweenOneAndHundred() {

Random r = new Random();

int low = 1;
int high = 100;

    return r.nextInt(high-low)+low;
}


public static void guessingGame(int numberToGuess) {

    Scanner scan = new Scanner(System.in);

    int e = 0;

for (int x = 1; x <= 10; x++) {
    System.out.print("Guess number " + x + ": ");
    int value = scan.nextInt();
    e = value;
    if (value < numberToGuess & x < 10)
        System.out.println("The number AI picked is higher than your guess.");
    else if (value > numberToGuess & x < 10)
        System.out.println("The number AI picked is lower than your guess.");
    else {
        if (value == numberToGuess) {
            System.out.println("You won wisenheimer!");
            break;
        }
    }
}
if (e < numberToGuess | e > numberToGuess)
    System.out.println("You lost! Have you ever heard of divide & conquer?");

}


public static boolean swapArrays(int[] array1, int[] array2) {

    if (array1.length == array2.length) {

        for (int count = 0; count < array1.length; count++) {
            int i = array1[count];
            array1[count] = array2[count];
            array2[count] = i;
        }
        return true;
    }
    return false;
}


public static String camelCase(String input) {

    char[] text = input.toCharArray();

    if (text[0] >= 97 & text[0] <= 122)
        text[0] -= 32;

    for (int i = 0; i < text.length; i++)
        if (i >= 1 && text[i-1] == 32 && text[i] >= 97 && text[i] <= 122)
            text[i] -= 32;

    for (int i = 0; i < text.length; i++)
        if (i >= 1 && text[i-1] != 32 && text[i] >= 65 && text[i] <= 90)
            text[i] += 32;

    for (int i = 0; i < text.length; i++)
        if (text[i] >= 0 && text[i] <= 64 || text[i] >= 91 && text[i] <= 96 || text[i] >= 123 && text[i] <= 127)
            text[i] = 32;

    String output = String.valueOf(text).replaceAll(" ","");
    return output;

}

// Implement all methods as public static

    public static void main(String[] args) {
       oneMonthCalendar(30, 5); // test your method implementations here
       lcg(50); // make method calls
        // print their results
        // etc.
    }
}