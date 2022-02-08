package com.company;
interface Square{
    int square(int x);
}

public class FunctionalInterfaceExample {
    public static void main(String args[]) {
        Square square = (int x) -> x * x;
        int answer = square.square(5);
        System.out.println(answer);
    }
}