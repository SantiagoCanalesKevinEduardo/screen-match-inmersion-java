import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double prueba=4.5;
        System.out.println(prueba);
        String sinopsis= """
                Esta es una pelicula de ciencia ficcion
                """;

        //strip elimina los espacios en blanco al inicio y al final de la cadena de texto
        System.out.println(sinopsis.strip());
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.US);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un la nota que le darías a matrix: ");
            double numero = scanner.nextDouble();
        }
    }
}