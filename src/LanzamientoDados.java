import java.util.Random;
import java.util.Scanner;

public class LanzamientoDados {
    /*Ejercicio 4: Simulación de Lanzamiento de Dados*/

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("¡Vamos a tirar dos dados!");
            System.out.println("Adivina la suma de los dos dados (2-12):");

            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            int userGuess = scanner.nextInt();

            System.out.println("Los dados son: " + die1 + " y " + die2 + ". La suma es: " + sum);

            if (userGuess == sum) {
                System.out.println("¡Correcto! Adivinaste la suma.");
            } else {
                System.out.println("Incorrecto. La suma era " + sum);
            }

            scanner.close();
        }
    }
