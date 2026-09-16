import java.util.Scanner;

class Operaciones {
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
    public static double calcularLongitud(double radio) {
        return 2 * Math.PI * radio;
    }
}
public class Main {
    public static void main(String[] args) {

        double radio, area, longitud;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = entrada.nextDouble();

        area = Operaciones.calcularArea(radio);
        longitud = Operaciones.calcularLongitud(radio);

        System.out.println("El area de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}