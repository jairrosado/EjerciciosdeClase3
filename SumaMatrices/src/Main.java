public class Main{
    public static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };


        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Las matrices no tienen las mismas dimensiones.");
            return;
        }


        int[][] suma = new int[matriz1.length][matriz1[0].length];


        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }


        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
