package ru.vsu.cs.samsonova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int h = readLengthSide();
        if (h >= 5 && h % 2 == 1) {
            printFigure(h);
        } else {
            System.out.println("Error was made in the specified shape parameters");
        }
    }

    private static int readLengthSide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the length of a side ");
        return scanner.nextInt();
    }

    public static void printFigure(int h) {
        for (int rowNumber = 0; rowNumber < h; rowNumber++) {
            if (rowNumber == 0 || rowNumber == h - 1) {
                System.out.print("*");
                for (int columnNumber = 1; columnNumber < h - 1; columnNumber++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                printRow(rowNumber, h);
            }
        }
    }


    private static void printRow(int rowNumber, int h) {
        System.out.print("|");
        for (int columnNumber = 1; columnNumber < h - 1; columnNumber++) {
            char sign = ' ';
            if (columnNumber == (h - 1) / 2 && rowNumber == (h - 1) / 2) {
                sign = '*';
            } else if (columnNumber == rowNumber) {
                sign = '\\';
            } else if (columnNumber + rowNumber == h - 1) {
                sign = '/';
            }
            System.out.print(sign);
        }

        System.out.println("|");
    }
}

