import java.util.Random;
import java.util.Scanner;

/*
Ejercicio 5:Crea un programa que simule un juego de adivinanzas.
*/

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int intentos = 0;
        int numeroAleatorio = new Random().nextInt(100) + 1;  // random number between 1 and 100

        System.out.println("¡Hola! En este programa adivinarás un número del 1 al 100");
        System.out.println("Ingresa un número del 1 al 100");

        while (intentos < 5) {
            int numeroDeUsuario = teclado.nextInt();
            intentos++;

            if (numeroDeUsuario == numeroAleatorio) {
                System.out.println("¡Felicitaciones! Acertaste el número.");
                break;
            } else if (numeroDeUsuario < numeroAleatorio) {
                System.out.println("El número es mayor, ¡sigue intentando!");
            } else {
                System.out.println("El número es menor, ¡sigue intentando!");
            }

            if (intentos == 5) {
                System.out.println("Lo siento, has gastado tus intentos. El número era " + numeroAleatorio);
            }
        }

        teclado.close();
    }
}