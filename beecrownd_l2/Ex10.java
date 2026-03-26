import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario > 4500.00) {
                // Calcula 28% sobre o que passa de 4500
                imposto += (salario - 4500.00) * 0.28;
                // Adiciona o máximo das faixas anteriores
                imposto += (1500.00 * 0.18); // Faixa de 3000 a 4500
                imposto += (1000.00 * 0.08); // Faixa de 2000 a 3000
            }
            else if (salario > 3000.00) {
                // Calcula 18% sobre o que passa de 3000
                imposto += (salario - 3000.00) * 0.18;
                // Adiciona o máximo da faixa anterior
                imposto += (1000.00 * 0.08); // Faixa de 2000 a 3000
            }
            else {
                // Calcula 8% sobre o que passa de 2000
                imposto += (salario - 2000.00) * 0.08;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }

}
