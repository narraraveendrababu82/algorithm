package com.sort;

import java.util.Scanner;

public class MergeSort {

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

        mergeSort(a, size);
        for(int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] a, int n) {
        if(n<2) return;

        int m = n/2;
        int[] l = new int[m];
        int[] r = new int[n-m];

        System.arraycopy(a, 0, l, 0, m);
        System.arraycopy(a, m+1, r, 0, n-m);

        mergeSort(l, m);
        mergeSort(r, n-m);

        merge(a, l, r, m, n-m);

    }

    public static void merge(int[] a, int[] l, int[] r, int m, int n) {

        int i=0, j=0, k=0;
        while (i<m && j<n) {
            if(l[i] < r[j]) a[k++] = l[i++];
            else a[k++] = r[j++];
        }

        while(i<m) a[k++] = l[i++];
        while(j<n) a[k++] = r[j++];

    }

}
