import java.util.Random;
import java.util.Scanner;

public class CuestionarioMatematico {
    public static void main(String[] args) {
        /*Ejercicio 3: Cuestionario Matemático*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;
        int totalQuestions = 5;

        System.out.println("¡Bienvenido al cuestionario matemático!");

        for (int i = 0; i < totalQuestions; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int operation = random.nextInt(3);

            int correctAnswer;
            String question;
            if (operation == 0) {
                correctAnswer = num1 + num2;
                question = num1 + " + " + num2 + " = ?";
            } else if (operation == 1) {
                correctAnswer = num1 - num2;
                question = num1 + " - " + num2 + " = ?";
            } else {
                correctAnswer = num1 * num2;
                question = num1 + " * " + num2 + " = ?";
            }

            System.out.println("Pregunta " + (i + 1) + ": " + question);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("¡Correcto!");
                correctAnswers++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era " + correctAnswer);
            }
        }

        System.out.println("Has respondido correctamente a " + correctAnswers + " de " + totalQuestions + " preguntas.");
        scanner.close();
    }
}