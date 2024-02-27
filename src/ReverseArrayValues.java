/*
Write a Java program to reverse an array of integer values.
 */

public class ReverseArrayValues {
    static void reverseArr(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Initial array: ");
        for (int i: arr){
            System.out.print(i + " ");
        }
        reverseArr(arr);
        System.out.println("\nReversed array: ");
        for (int m: arr){
            System.out.print(m + " ");
        }
    }
}
