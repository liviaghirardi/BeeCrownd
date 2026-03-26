import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        // Configura o Scanner para ler pontos decimais independentemente da região
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Leitura dos três valores reais
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Verificação da condição de existência do triângulo
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            // Se for triângulo, calcula o perímetro
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            // Se não for, calcula a área do trapézio
            double area = ((a + b) * c) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }
}
