/*
 Write a Java program to copy an array by iterating the array.
*/

public class ArrayCopy {
    public static void main(String[] args) {
       // int[] arr = new int[5];
        int[] arr = {4, 6, 7, 7, 3};
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
