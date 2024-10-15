import java.util.Locale;
import java.util.Scanner;

public class Exe1 {

    public static void exe1(String[] ) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in)


        double nota1 = sc.nextDouble()
        double nota2 = sc.nextDouble()

        double notaFinal = nota1 + nota2 ;
        System.out.printf("Nota Final =", notaFinal)

        sc.close();
    }
}
