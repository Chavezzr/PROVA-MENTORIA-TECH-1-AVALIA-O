import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.printf("Temperatura em Celsius: %.1f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.1f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}
