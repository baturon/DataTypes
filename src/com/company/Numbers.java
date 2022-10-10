package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Введите целое  число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0)
            System.out.println("zero");

        else if (a == 1) {
            System.out.println("one");
        } else
            System.out.println("I don't know");

    }
}
