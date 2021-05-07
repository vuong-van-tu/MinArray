package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int array[];
        int size;
        do {
            System.out.print("Enter a size : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("Enter element "+(i+1)+" : ");
            array[i]= sc.nextInt();
            i++;
        }
        System.out.print("Mảng vừa nhập là : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j]<min){
                min=array[j];
            }
        }
        System.out.println("");
        System.out.print("Min= "+min);
    }
}
