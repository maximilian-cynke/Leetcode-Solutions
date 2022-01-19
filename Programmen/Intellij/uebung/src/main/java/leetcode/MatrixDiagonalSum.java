package leetcode;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3,5},
                {4,5,6,8},
                {7,8,9,6},
                {1,6,3,5}
        };

        System.out.println(diagonalSum(mat));

        int[][] mat2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println(diagonalSum(mat2));

    }

    public static int diagonalSum(int[][] mat) {

        int solution = 0;
        int matLen = mat.length;
        int matEven = matLen % 2;
        int counter = 0;

        if(matEven == 0){
            for (int i = 0; i < matLen; i++) {
                solution = solution + mat[counter][i];
                counter++;
            }
            counter = 0;

            for (int i = matLen - 1; i >= 0 ; i--) {
                solution = solution + mat[counter][i];
                counter++;
            }


        } else {
            for (int i = 0; i < matLen; i++) {
                solution = solution + mat[counter][i];
                counter++;
            }
            counter = 0;

            for (int i = matLen - 1; i >= 0 ; i--) {
                solution = solution + mat[counter][i];
                counter++;
            }

            int half = matLen / 2;
            solution = solution - mat[half][half];

        }


        return solution;
    }


}
