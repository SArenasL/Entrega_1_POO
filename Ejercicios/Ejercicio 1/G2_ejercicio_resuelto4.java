import java.util.Scanner;

class Edades {

    public static double calcular_edalber(double edjuan) {
        return 2 * edjuan / 3;
    }

    public static double calcular_edana(double edjuan) {
        return 4 * edjuan / 3;
    }

    public static double calcular_edmama(double edjuan, double edalber, double edana) {
        return edjuan + edalber + edana;
    }
}

class Main {
    public static void main(String[] args) {
        double edjuan, edalber, edana, edmama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuantos años tiene Juan? ");
        edjuan = scanner.nextDouble();

        edalber = Edades.calcular_edalber(edjuan);
        edana = Edades.calcular_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edalber, edana);

        System.out.println("la edad de la mama es: " + edmama);
        System.out.println("la edad de Juan es: " + edjuan);
        System.out.println("la edad de Alberto es: " + edalber);
        System.out.println("la edad de Ana es: " + edana);
    }
}