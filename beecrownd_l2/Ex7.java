import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Lendo os 3 valores em um array para facilitar a ordenação
        Double[] lados = new Double[3];
        lados[0] = sc.nextDouble();
        lados[1] = sc.nextDouble();
        lados[2] = sc.nextDouble();

        // Ordenando em ordem decrescente
        Arrays.sort(lados, Collections.reverseOrder());

        double A = lados[0];
        double B = lados[1];
        double C = lados[2];

        // 1. Verificação de existência
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // 2. Classificação por ângulos (usa-se else if pois são exclusivos)
            if (A * A == (B * B + C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > (B * B + C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // 3. Classificação por lados (usa-se if separados pois pode ser acumulativo)
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }

}
