import java.util.Scanner;

public class Ejercicio05Clasificacion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Clasificación de edades");
        System.out.print("¿Que edad tienes?: ");
        int edad = sc.nextInt();

        if (edad < 13){
            System.out.println("La edad " + edad +" entonces eres un niño");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("La edad que tienes es " + edad + " te clasifica en Adolescente ");
        } else if (edad >= 18 && edad < 65){
            System.out.println("La edad que tienes es "+edad +  " te clasifica en Adulto ");
        } else {
            System.out.println("La edad que tienes es "+edad +  " te clasifica en Adulto Mayor ");
        }
    }
}
