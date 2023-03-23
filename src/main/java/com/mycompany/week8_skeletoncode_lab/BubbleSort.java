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
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        // outer loop is executed n - 1 times, or n
        for (outer = size - 1; outer > 0; outer--) { // counting down
            // inner loop is executed n times
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if(a[inner] > a[inner + 1]) { // O(1)
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
                
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int hold;
        int[] sequence = new int[5];
        int capacity = sequence.length;
        for(int i = 0; i < sequence.length; ++i) {
            System.out.println("Enter an integer: ");
            hold = scnr.nextInt();
            sequence[i] = hold;
        }
        for(int j = 0; j < capacity; ++j) {
            System.out.print(sequence[j] + " ");
        }
        System.out.println("Now performing bubble sort...");
        bubbleSort(sequence, capacity);
        for(int k = 0; k < capacity; ++k) {
            System.out.print(sequence[k] + " ");
        }
        System.out.println("The algorithm has been sorted.");
    }
}

/*
Time Complexity:

n * n = O(n^2)

The time complexity of this algorithm is O(n^2).
_________________

Space Complexity:

a = n
size = 1
outer = 1
inner = 1
temp = 1

n + 1 + 1 + 1 + 1 = n + 4 = O(n)

The space complexity of this algorithm is O(n).

*/
