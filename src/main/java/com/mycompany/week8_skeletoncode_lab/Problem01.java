/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        int sum = 0; // 1 time
        for(int i = 1; i < n; i++) { // n times
            if(i == 1 || i == 2) { // base case - 1 time
                sum = sum + i; // 1 time
            }
            else if (i % 2 != 0) { // all even numbers other than 2 are not prime - log(n) times
                int j = 2;
                while(i % j != 0) {
                    j = j + 1;
                    if(i % j == 0 && j != i) { // indicates that i is prime
                        break;
                    }
                    else if(i % j == 0 && j == i) { // indicates that i is not prime
                        sum = sum + i;
                    }
                }
            }
        }
        return sum; // 1 time
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    }
    
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int n;
        long total;
        System.out.println("Please input a positive integer: ");
        n = scnr.nextInt();
        if(n < 1) {
            while(n < 1) {
              System.out.println("Please input a positive integer: ");
              n = scnr.nextInt();
            }
        }
        total = getSumOfPrimes(n);
        System.out.println(total);
    }
    
}

/*

Runtime Complexity:

1 + n + 1 + log(n) + 1 = n + log(n) + 3 = O(n * log(n))

For nested loops, the complexity is the main loop's complexity 
multiplied by the nested loop's complexity.

The time complexity of this algorithm is O(n * log(n)).

Space Complexity:

n -> 1
sum -> 1
i -> 1
j -> 1

1 + 1 + 1 + 1 = 4

The space complexity of this algorithm is O(1).

*/
