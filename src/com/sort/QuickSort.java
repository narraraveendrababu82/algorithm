package com.sort;

import java.util.Scanner;

public class QuickSort {

    public static void main(String args[]) {
        System.out.println("Main started....");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of array elements : ");
        int size = sc.nextInt();

        System.out.print("Enter array elements : ");
        int[] a = new int[size];
        for(int i=0; i<size; i++) {
            a[i] = sc.nextInt();
        }

        quickSort(a, 1, a.length-1);
        for(int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] a, int begin, int end) {
        if(begin<end) {
            int pivotPoint = pivotPoint(a, begin, end);
            quickSort(a, begin, pivotPoint-1);
            quickSort(a, pivotPoint+1, end);
        }
    }

    public static int pivotPoint(int[] a, int begin, int end) {
        int pivot = a[end];
        int i = begin-1, temp=0;
        for(int j=0; j<a.length; j++) {
            if(a[j] <= pivot) i++;

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;

        return i+1;
    }
}
