package com.company;

public class BitWise {
    public static void main(String[] args) {
        byte a = 0b1100;
        byte b = 0b1010;
        //byte c=(byte) (a&b);
        byte c= (byte) (a&b);
        String s = String.format("%4s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println(s);

    }
}
