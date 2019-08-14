package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Function f = new Function();
        int n;
        int[] arr;

            System.out.println("Enter number of element: ");
            n = f.checkValidation();
            arr = f.createArray(n);
            f.Search(arr,n);
    }
}
