import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextDouble();

        System.out.println("El cuadrado del numero " + numero + " es "
                + Math.pow(numero, 2));

        System.out.println("El cubo del numero " + numero + " es "
                + Math.pow(numero, 3));
    }
}