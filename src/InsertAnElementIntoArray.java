/*
 Write a Java program to insert an element (specific position) into an array.
 */

import java.util.Scanner;
public class InsertAnElementIntoArray {

    // custom array insertion function
    static void insertIntoArr(int[] array, int value, int position){
    for (int i = array.length - 1; i >=position; i--){
        array[i] = array[i - 1];
    }
    array[position - 1] = value;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        // print initial array
        for (int x: arr){
            System.out.print(x + " ");
        }

        System.out.println("\nEnter the value to insert: ");
        int value = input.nextInt();
        System.out.println("Enter the position to insert: ");
        int position = input.nextInt();

        insertIntoArr(arr, value, position);

        // print the new array
        System.out.println();
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
