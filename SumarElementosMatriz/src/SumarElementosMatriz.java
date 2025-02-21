public class SumarElementosMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {28, 42, 43},
                {47, 56, 36},
                {73, 58, 99}
        };

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }
}
