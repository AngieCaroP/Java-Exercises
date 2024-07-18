public class Temperatura {
    public static void main(String[] args) {

        //Ejercicio 6:convertidos de °C a °F

        System.out.println("¡Hola! este es un programa que convierte de °C a °F");
        System.out.println("Ingresa la temperatura  en °C que deseas convertir a °F");
        double temperaturaEnCentigrados=30.4;

        double fahrenheit=(temperaturaEnCentigrados*1.8)+32;
        System.out.println("La conversion de "+ temperaturaEnCentigrados + "°C es de; " +fahrenheit + "°F");
        int conversion = (int) fahrenheit;
        System.out.println("la conversion de " +fahrenheit + "°F a numero entero es de " + conversion + "°F");
    }
}