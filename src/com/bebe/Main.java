package com.bebe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> userArray = new ArrayList<Object>(100);
        int userFirstSizeArray;
        int userSecondSizeArray;

        Scanner appScanner = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        userFirstSizeArray = appScanner.nextInt();

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < userFirstSizeArray; i++) {
            int toArray = appScanner.nextInt();
            userArray.add(toArray);
        }

        System.out.println("Enter the size of the second array:");
        userSecondSizeArray = appScanner.nextInt();

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < userSecondSizeArray; i++) {
            int toArray = appScanner.nextInt();
            userArray.add(toArray);
        }
        System.out.println("Merged array: "+ userArray);
    }
}
