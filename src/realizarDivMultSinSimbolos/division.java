package realizarDivMultSinSimbolos;

import java.util.Scanner;

public class division {

    public int n;

    public division(){

        // Permite recivir numeros por consola
        Scanner teclado = new Scanner(System.in);

        // Recivir numeros por consola
        int dividendo = teclado.nextInt();
        int divisor = teclado.nextInt();
        int residuo = dividendo;

        n = 0;
        while (residuo > divisor) {
            residuo = residuo - divisor;
            n++;
        }
    }
}
