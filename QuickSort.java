import java.util.*;

public class QuickSort {
    public static int partition(int[] a, int low, int high) {
        int pivot = a[low];  
        int i = low + 1;     
        int j = high;

        while (i <= j) {
            while (i <= j && a[i] <= pivot) {
                i = i + 1;
            }
            while (a[j] >= pivot && j >= low) {
                j = j - 1;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, low, j);
        return j;  
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int j = partition(a, low, high);  
            quicksort(a, low, j - 1);  
            quicksort(a, j + 1, high); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
