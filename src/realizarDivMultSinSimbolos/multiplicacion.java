package realizarDivMultSinSimbolos;

import java.util.Scanner;

public class multiplicacion {

    public int resultado;

    public multiplicacion (){

        Scanner tecla = new Scanner(System.in);

        int multiplicando = tecla.nextInt();
        int multipicador = tecla.nextInt();

        resultado = 0;
        for(int i = 0; i < multipicador; i++){

            resultado += multiplicando;

        }


    }


}
