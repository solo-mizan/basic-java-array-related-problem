/*
 Write a Java program to find the second-largest element in an array.
 */

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 7, 3, 21};
        int secondLargest = array[0];
        int firstLargest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                firstLargest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstLargest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("\nSecond largest element: " + secondLargest);
    }
}
