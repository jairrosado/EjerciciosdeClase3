public class ContarParesMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {22, 12, 39},
                {46, 55, 67},
                {72, 80, 91}
        };

        int contadorPares = 0;

        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
            }
        }

        System.out.println("La cantidad de números pares en la matriz es: " + contadorPares);
    }
}
