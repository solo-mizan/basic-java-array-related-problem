import java.util.Scanner;

public class InterchangeRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Row size: ");
        int row = input.nextInt();
        System.out.print("\nEnter Column size: ");
        int col = input.nextInt();
        int[][] matrix = new int[row][col];

        System.out.print("\nEnter the matrix elements: ");

        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                matrix[r][c] = input.nextInt();
            }
        }
        // print initial matrix ==>
        System.out.print("\nThe given matrix elements are: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
