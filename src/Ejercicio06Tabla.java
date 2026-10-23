import java.util.Scanner;

public class Ejercicio06Tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De cuál número quieres saber su tabla de multiplicar?: ");
        int numero = sc.nextInt();

        System.out.println("--- Tabla del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i; // Calculamos sin alterar el 'numero' original
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close();
    }
}
