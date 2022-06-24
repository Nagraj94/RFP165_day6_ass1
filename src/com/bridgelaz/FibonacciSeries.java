package com.bridgelaz;

import java.util.Scanner;

public class FibonacciSeries {
    static int fib(int n)
    {
        if (n<=1)
        {
            return n;
        }
         else
         {
             return fib(n-1) + fib(n-2);
         }

    }
    public static void main(String[] args) {
        System.out.print("enter number to find fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
