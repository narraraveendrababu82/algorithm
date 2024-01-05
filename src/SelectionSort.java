import java.util.Scanner;

public class SelectionSort {

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

        selectionSort(a);
        for(int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] a) {
        int temp=0; // 9 4 1 6 2
        for(int i=0; i<a.length-1; i++) { //9
            int minId = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[j] < a[minId]) minId = j;
            }
            temp = a[minId];
            a[minId] = a[i];
            a[i] = temp;
        }
    }
}
