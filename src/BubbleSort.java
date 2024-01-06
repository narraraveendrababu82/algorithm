import java.util.Scanner;
import java.util.stream.IntStream;

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
        int n = a.length;
        IntStream.range(0, n-1)
                .flatMap(i -> IntStream.range(1, n-i))
                .forEach(j -> {
                    if(a[j-1] > a[j]) {
                        int temp = a[j];
                        a[j] = a[j-1];
                        a[j-1] = temp;
                    }
                });
    }

}
