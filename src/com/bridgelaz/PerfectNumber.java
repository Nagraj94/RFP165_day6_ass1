package com.bridgelaz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long n,sum = 0;
        System.out.print("enter number to find perfect number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        int i = 1;

        while (i<=n/2)
        {
            if (n%i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum == n)
        {
            System.out.println(n + " is perfect number");
        }
        else
        {
            System.out.println(n + " is not perfect number");
        }
    }
}
