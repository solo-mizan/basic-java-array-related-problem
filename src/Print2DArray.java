/*
 Initialize and print all elements of a 2D array.
 */

public class Print2DArray {
    public static void main(String[] args) {
        int[][] _2DArray = {{3, 7, 4}, {46, 2, 64}};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(_2DArray[i][j]);
            }
            System.out.println();
        }
    }
}
