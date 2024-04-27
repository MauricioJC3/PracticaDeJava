package InsertarNumerosArrayMatriz;

import java.util.Scanner;

public class insertarNumerosDeArrayaMatriz {

    public insertarNumerosDeArrayaMatriz(){
        Scanner tec = new Scanner(System.in);
        int filas, columnas;
        int [] array;
        int [][] matriz;

        System.out.println("Ingrese el numero de filas: ");
        filas = tec.nextInt();

        System.out.println("Ingrese el numero de columnas: ");
        columnas = tec.nextInt();

        matriz = new int[filas][columnas];
        array = new int[filas*columnas];

        for (int i  = 0; i < array.length; i++){
            System.out.println("ingrese el elemento: " + (i+1) + ": ");
            array[i] = tec.nextInt();
        }

        int k = 0;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = array[k++];
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
