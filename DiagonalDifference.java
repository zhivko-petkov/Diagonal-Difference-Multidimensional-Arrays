package EXERCISE;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        inputMatrixNxN(sc, matrix, n);
        diagonalsSumInMatrix(matrix);

    }


    public static void inputMatrixNxN (Scanner sc, int[][] matrix, int size){
        for (int row = 0; row < size; row++) {
            String[] inputTokens = sc.nextLine().split(" ");
            for (int column = 0; column < size; column++) {
                matrix[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
    }

    public static void diagonalsSumInMatrix (int[][] matrix){
        int primaryDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == j)
                    primaryDiagonal+=matrix[i][j];

                if((i+j) == (matrix.length - 1))
                    secondDiagonal += matrix[i][j];
            }
        }
        System.out.println(Math.abs(primaryDiagonal - secondDiagonal));
    }

}
