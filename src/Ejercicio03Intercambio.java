public class Ejercicio03Intercambio {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int auxiliar = a;
        System.out.println("El valor antes de mezclar de a: " + a);
        System.out.println("El valor antes de mezclar  de b: " + b);
        a = b;
        b = auxiliar;
        System.out.println("El valor despues de mezclar de a: " + a);
        System.out.println("El valor despues de mezclar de b: " + b);
    }
}
