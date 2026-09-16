class Operaciones {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
    
}
public class Main {
    public static void main(String[] args) {
        double suma;
        double x;
        double y;
        suma = 0;
        x = 20;
        suma = Operaciones.sumar(suma, x);
        y = 40;
        x = Operaciones.sumar(x, Operaciones.potencia(y, 2));
        suma = Operaciones.sumar(
            suma,
            Operaciones.dividir(x, y)
        );
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}