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
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length; // runs 1 time
        int index = -1; // runs 1 time
        for(int i = 0; i < n; ++i) { // 1 + n + n
            if(arr[i] == x) { // runs n times: n + n
                index = i;
            }
        }
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         return index; // runs 1 time
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input;
        int key;
        int place;
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; ++i) {
            System.out.println("Enter an integer: ");
            input = scnr.nextInt();
            numbers[i] = input;
        }
        System.out.println("Ok, which integer are we searching for?: ");
        key = scnr.nextInt();
        place = search(numbers, key);
        if(place != -1)
            System.out.println("I found " + key + " at index " + place + ".");
        else
            System.out.println("I did not find " + key + ".");
        
    }
    
}

/*
Asymptotic Analysis

T(N) = 1 + 1 + 1 + n + n + n + n + 1 = 4 + 4(N)
T(N) = 4(N) + 4

Upper bound:
f(n) <= c * g(n) for n > n0
c * g(n) = 10 * n
g(n) = n
O(g(n)) = O(n)
c = 10
Example with 40:
f(n) = 4(40) + 4 = 160 + 4 = 164
c * g(n) = 10 * (40) = 400
164 < 400 / f(n) < c * g(n)
The algorithm's upper bound is O(n).

Lower bound:
f(n) >= c * g(n) for n > n0
g(n) = n
Omega(g(n)) = Omega(n)
c = 3
Example with 40:
f(n) = 4(40) + 4 = 160 + 4 = 164
c * g(n) = 3 * (40) = 120
164 > 120 / f(n) > c * g(n)
The algorithm's lower bound is Omega(n).

Theta bound:
c1 * g(n) <= f(n) <= c2 * g(n) for all large values of n
g(n) = n
c1 = 3
c2 = 5
Example with 100:
c1 * g(n) = 3 * (100) = 300
f(n) = 4(100) + 4 = 400 + 4 = 404
c2 * g(n) = 5 * (100) = 500
300 < 404 < 500 / c1 * g(n) < f(n) < c2 * g(n)
The algorithm's tight bound is Theta(n).


*/
