import java.util.Random;
import java.util.Scanner;

public class SecuenciaDeNumeros {
    public static void main(String[] args) {
        /*Ejercicio 2: Adivinar la Secuencia de Números*/

        Scanner teclado = new Scanner(System.in);
        Random numero = new Random();

        int [] secuencia = new int[5];

        for (int i = 0; i < secuencia.length; i++) {
            secuencia [i] = numero.nextInt(10) +1;

            System.out.print("Secuencia generada: ");

            for (int num:secuencia){
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Adivina el siguiente número en la secuencia:");
            int userGuess = teclado.nextInt();
            int nextNumber = numero.nextInt(10) + 1;

            if (userGuess == nextNumber) {
                System.out.println("¡Correcto! El siguiente número era " + nextNumber);
            } else {
                System.out.println("Incorrecto. El siguiente número era " + nextNumber);
            }
        }

    }
}
