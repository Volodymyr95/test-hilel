package org.company;

import java.util.Random;

public class MainHW10 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        Random random = new Random();
        String stringArr1 = " ";
        String stringArr2 = " ";

        for (int i = 0; i < 10; i++) {
            stringArr1 += " " + (arr1[i] = random.nextInt(10));
            stringArr2 += " " + (arr2[i] = random.nextInt(10));
        }
        System.out.println(stringArr1);
        System.out.println(stringArr2);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 1; j < arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
