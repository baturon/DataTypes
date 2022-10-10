package com.company;

public class DataTypes {
    public static void main(String[] args) {
        boolean b =Boolean.TRUE;
        byte c = 100;
        System.out.printf("boolean: min=%b, max=%b, range=%d%n", Boolean.FALSE, Boolean.TRUE, 1);
        System.out.printf("boolean: min=%d max=%d, range=%d%n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES);
        System.out.printf("short: min=%d max=%d, range=%d%n", Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
        System.out.printf("int: min=%d max=%d, range=%d%n", Integer.MIN_VALUE, Integer.MAX_VALUE, Short.BYTES);
        System.out.printf("long: min=%d max=%d, range=%d%n", Long.MIN_VALUE, Long.MAX_VALUE, Long.BYTES);
        System.out.printf("float: min=%f max=%e, range=%d%n", Float.MIN_VALUE, Float.MAX_VALUE, Float.BYTES);
        System.out.printf("double min=%f,max=%e, range=%d%n", Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES);
        /*
        It's a good weather today.
        I'm 30 years old
        The world population is 7 billion
        The 5 times (multiplication) table
        5 apples, 3 peaches and 2 cherries
        The interest on deposit is 5%
        Today is the 1th day of week
        The first letter of my name is A
        The cycle is running 10 times
        The weight of apples is 1.2 kilos
        My name is Alex
        This year has 365 days
        There are 7 rainbow colors
        The BATE won this match:
        The first digit in the number is greater than the second:
        The library consists of 1005 books
        My height is 175 centimeters
         */
        boolean weather=true;
        int age=30;
        long population=7_500_000_000l;
        byte number=5;
        byte apples=5, peaches=3, cherries=2;
        float interes=0.5F;
        int day=1;
        char firstLetter='A';
        int count=10;
        double mass=1.2;







    }
}
