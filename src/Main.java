import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double TASA_IVA= 0.19;
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuanto es el precio del producto? : ");
        double precio = scanner.nextDouble();

        double iva = precio*TASA_IVA;
        double total = precio+iva;

        System.out.printf("El subtotal del producto es: %.2f%n", precio);
        System.out.printf("El iva del producto es: %.2f%n", iva);
        System.out.printf("El precio total del producto es: %.2f%n", total);
        scanner.close();


    }
}
