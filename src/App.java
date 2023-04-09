import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        double celsius;
        double fahrenheit;

        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe a temperatura em Celsius:");
        celsius = teclado.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura convertida para fahrenheit é:" + fahrenheit);

    }
}