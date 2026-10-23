    import java.util.Scanner;

    public class Ejercicio05Clasificacion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Clasificación de edades");
            System.out.print("¿Qué edad tienes? ");
            int edad = sc.nextInt();

            if (edad < 0) {
                System.out.println("Error: la edad no puede ser negativa.");
            } else if (edad < 13) {
                System.out.println("Tienes " + edad + " años: Niño");
            } else if (edad < 18) {
                System.out.println("Tienes " + edad + " años: Adolescente");
            } else if (edad < 65) {
                System.out.println("Tienes " + edad + " años: Adulto");
            } else {
                System.out.println("Tienes " + edad + " años: Adulto mayor");
            }

            sc.close();
        }
    }