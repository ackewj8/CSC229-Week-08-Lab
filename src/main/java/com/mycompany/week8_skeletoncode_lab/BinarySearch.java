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
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE; // 1 time

        while (low <= high) {
            int mid = low + ((high - low) / 2); // log(n) times
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) { // indicates that the key has been found
                index = mid;
                break;
            }
        }
        return index; // 1 time
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] sort = new int[8];
        int size = sort.length;
        int place;
        for(int i = 0; i < size; ++i) {
            sort[i] = i;
            System.out.println(sort[i]);
        }
        int lowest = 0;
        int highest = 7;
        System.out.println("What number should I search for?: ");
        int target = scnr.nextInt();
        place = runBinarySearchIteratively(sort, target, lowest, highest);
        if(place > 8 || place < 0) {
            System.out.println("I did not find " + target + ".");
        }
        else {
            System.out.println("I found " + target + " at index " + place + ".");
        }
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 

}

/*
Time Complexity

log(n) + 1 + 1 = log(n) + 2 = O(log(n))

Time complexity is O(log(n)).
________________

Space Complexity

sortedArray = n
key = 1
low = 1
high = 1
index = 1

1 + 1 + 1 + 1 + n = 4 + n = O(n)

Space complexity is O(n).

*/
