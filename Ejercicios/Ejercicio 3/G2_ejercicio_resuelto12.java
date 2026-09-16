class Operaciones {
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
}

public class Main {
    public static void main(String[] args) {
        double salario_bruto, salario_neto, retencion;

        salario_bruto = Operaciones.multiplicar(48, 5000);
        retencion = Operaciones.multiplicar(salario_bruto, 0.125);
        salario_neto = Operaciones.restar(salario_bruto, retencion);

        System.out.println("El salario bruto semanal es: $" + salario_bruto);
        System.out.println("El porcentaje de retencion en la fuente es: $" + retencion);
        System.out.println("El salario neto semanal es: $" + salario_neto);
    }
}