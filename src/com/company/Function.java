package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
    public int checkValidation() {
        int n;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                n = Integer.parseInt(sc.next());

                if (n < 0) {
                    System.out.println("Number must bigger than 0");
                } else {
                    break;
                }
            }
            catch(NumberFormatException ex){
                System.out.println("Invalid input !!!");
            }
        }

        return n;
    }

    public int[] createArray(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[n];

        for (int i = 0; i<n; i++){
            while (true){
                try {
                    System.out.println("Enter number " + (i+1) + ": ");
                    arr[i] = Integer.parseInt(sc.next());
                    break;
                }
                catch (NumberFormatException ex){
                    System.out.println("Invalid input !!!");
                }
            }
        }
        System.out.println("The array: " + Arrays.toString(arr));
        return  arr;
    }

    public void sortArray(int[] arr){
        if (arr == null){
            System.out.println("Empty array !!!");
        }

        for (int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j ++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public void Search(int[] arr, int n){
        int first, last, middle, search;
        System.out.println("Enter search number: ");
        search = checkValidation();

        first = 0;
        last = n - 1;
        middle = (first + last)/2;

        while (first <= last){
            if (arr[middle] < search){
                first = middle + 1;
            }
            else if (arr[middle] == search){
                System.out.println("Found " + search + " at index: " + middle);
                break;
            }
            else {
                last = middle - 1;
            }

            middle = (first + last)/2;
        }
        if (first > last){
            System.out.println(search + " is not present in the array. ");
        }
    }
}
