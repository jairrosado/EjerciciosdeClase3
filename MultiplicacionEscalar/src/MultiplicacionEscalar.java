import java.util.Scanner;
public class MultiplicacionEscalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Matriz={
                {10,23},
                {20,30}

        };
        int[][] resultado = new int[Matriz.length][Matriz[0].length];

        int escalar;
        System.out.println("Ingrese el valor del escalar: ");
        escalar=sc.nextInt();
        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[i].length;j++){
                resultado[i][j]= Matriz[i][j]*escalar;
            }

        }
        System.out.println("Matriz resultante:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();



            }

    }
}