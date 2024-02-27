/*
 Write a Java program to find duplicate values in an array of integer values.
 */

public class FindDuplicateInArray {
    static int[] findDuplicate(int[] array){
        int[] duplicate = new int[100];
        int index = 0;
        for (int k : array) {
            boolean flag = false;
            for (int j = 1; j < array.length; j++) {
                if (k == array[j]) {
                    duplicate[index++] = array[j];
                }
            }
        }

        return duplicate;
    }
    public static void main(String[] args) {
        int[] array = {3, 56, 64, 2, 5, 2, 6, 6};
       int[] dp = findDuplicate(array);
       for (int m: dp){
           System.out.println(m);
       }
    }
}
