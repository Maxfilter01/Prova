import java.util.Scanner;
public class provaUm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para calcular estimativa de consumo de combustível");

        System.out.println("Por favor, Digite a placa do veículo: ");
        String placaDoVeiculo = scanner.nextLine();

        System.out.println("Por favor, digite o valor do litro de combustível: ");
        double valorDoLitro = scanner.nextDouble();

        System.out.println("Por favor, Digite a quantidade de quilômetros rodados a 60KM/H: ");
        double kmH60 = scanner.nextDouble();

        System.out.println("Por favor, Digite a quantidade de quilômetros rodados a 80KM/H: ");
        double kmH80 = scanner.nextDouble();

        System.out.println("Por favor, Digite a quantidade de quilômetros rodados a 100KM/H: ");
        double kmH100 = scanner.nextDouble();

        System.out.println("Por favor, Digite a quantidade de quilômetros rodados a 120KM/H: ");
        double kmH120 = scanner.nextDouble();

        System.out.println("Por favor, Digite a quantidade de quilômetros rodados a 140KM/H: ");
        double kmH140 = scanner.nextDouble();

        scanner.close();

        double combustivelkmH60 = kmH60/30.7;
        double combustivelkmH80 = kmH80/26.8;
        double combustivelkmH100 = kmH100/22.4;
        double combustivelkmH120 = kmH120/18.1;
        double combustivelkmH140 = kmH140/14.5;

        double totalDeCombustivel = combustivelkmH60 + combustivelkmH80 + combustivelkmH100 + combustivelkmH120 + combustivelkmH140;
        double kmTotal = kmH60 + kmH80 + kmH100 + kmH120 + kmH140;
        double mediaPonderada = (kmH60 * 60 + kmH80 * 80 + kmH100 * 100 + kmH120 + 120 + kmH140)/kmTotal;
        double custoTotal = totalDeCombustivel * valorDoLitro;

        System.out.println("Estimativa de custo para a viagem: ");
        System.out.println("Placa do Veículo: " + placaDoVeiculo);
        System.out.printf("Consumo total de combustível: %.4f " ,totalDeCombustivel);
        System.out.printf("\nCusto total da viagem: R$%.2f", custoTotal);
        System.out.printf("\nVelocidade média ponderada: %.4f", mediaPonderada);

        

    }
}