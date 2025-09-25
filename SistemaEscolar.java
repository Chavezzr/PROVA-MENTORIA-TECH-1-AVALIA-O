import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "º Bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias semestrais
        double mediaSemestre1 = 0;
        double mediaSemestre2 = 0;

        for (int i = 0; i < 4; i++) {
            mediaSemestre1 += notas[i];
        }
        mediaSemestre1 /= 4;

        for (int i = 4; i < 8; i++) {
            mediaSemestre2 += notas[i];
        }
        mediaSemestre2 /= 4;

        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Saída formatada
        System.out.println();

        // Exibe 1º ao 4º bimestre
        for (int i = 0; i < 4; i++) {
            System.out.printf("%dº Bimestre: %.1f%n", i + 1, notas[i]);
        }
        System.out.printf("1º Semestre: %.1f%n%n", mediaSemestre1);

        // Exibe 5º ao 8º bimestre
        for (int i = 4; i < 8; i++) {
            System.out.printf("%dº Bimestre: %.1f%n", i + 1, notas[i]);
        }
        System.out.printf("2º Semestre: %.1f%n%n", mediaSemestre2);

        // Exibe média final
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
