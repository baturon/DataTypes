package com.company;

public class Digits {
    public static void main(String[] args) {
        //Дано трехзначное число. Вывести число, полученное при прочтении
        // исходного числа справа налево.

        int a=123;
        int hundreds=a/100;
        int tens=a/10%10;
        int ones=a%10;
        System.out.printf("hundreds:%d,tens:%d,ones:%d", hundreds,tens,ones);
        int b=ones*100+tens*10+hundreds;
        System.out.println(b);
    }
}

