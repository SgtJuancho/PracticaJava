import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("¿Como te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuantos años tienes? ");
        int edad = sc.nextInt();

        System.out.print("¿Cuanto mides? ");
        double altura = sc.nextDouble();
        System.out.println("Hola "+nombre+" el proximo año tendras "+ (edad+1)+" años y mides "+altura+" cm");
        sc.close();


    }
}
