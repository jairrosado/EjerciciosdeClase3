
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {19,24,32},
                {18,54,62},
                {18,2,42}

        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}