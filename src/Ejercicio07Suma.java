import java.util.Scanner;

public class Ejercicio07Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedimos el valor de n (el número límite hasta donde queremos sumar)
        System.out.println("Ingrese el valor de n: ");
        int n = sc.nextInt();

        // 2. Declaramos la variable 'suma' (el acumulador) en 0 ANTES del ciclo
        int suma = 0;

        // 3. Creamos el ciclo que va desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            suma = suma + i; // O también puedes escribir: suma += i;
        }

        // 4. Mostramos el resultado final fuera del ciclo
        System.out.println("La suma de 1 hasta " + n + " es: " + suma);

        sc.close();
    }
}
