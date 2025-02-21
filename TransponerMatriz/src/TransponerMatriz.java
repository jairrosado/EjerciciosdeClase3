public class TransponerMatriz {
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        // Transponer la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transpuesta = transponerMatriz(matriz);

        // Imprimir la matriz transpuesta
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
