import java.util.Scanner;

public class BubbleSort {

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

        bubbleSort(a);
        for(int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        int temp=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

}
