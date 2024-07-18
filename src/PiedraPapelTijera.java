import java.util.Random;
import java.util.Scanner;

/*
Ejercicio 1: Juego de Piedra, Papel o Tijeras
*/

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Piedra", "Papel", "Tijeras"};

        System.out.println("¡Juguemos Piedra, Papel o Tijeras!");
        System.out.println("Ingresa 0 para Piedra, 1 para Papel, o 2 para Tijeras:");

        int computer= random.nextInt(3);
        int user=teclado.nextInt();

        System.out.println("Computadora eligió: " + options[computer]);
        System.out.println("Tú elegiste: " + options[user]);

        if (user==computer){
            System.out.println("¡Es un empate!");
        }else if ((user == 0 && computer == 2) ||
                (user == 1 && computer == 0) ||
                (user == 2 && computer == 1)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        teclado.close();

    }
}
