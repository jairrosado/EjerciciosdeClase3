public class MaximoMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {33, 83, 12},
                {71, 24, 91},
                {54, 64,86}
        };
        int maximo = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
        System.out.println("El número máximo en la matriz es: " + maximo);
    }
}
