import java.util.Scanner;

class Carro {
    int anoCarro;

    Carro(int anoCarro) {
        this.anoCarro = anoCarro;
    }
}

class CalcularDesconto {
    static double descontoCalculado(int anoCarro) {
        if (anoCarro <= 2000) {
            return 0.12; // Desconto referente a 12%
        } else {
            return 0.07; // Desconto referente a 7% 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCarros2000 = 0;
        int totalGeralCarros = 0;

        do {
            System.out.println("Digite o ano do carro:");
            int anoCarro = scanner.nextInt();
            Carro carro = new Carro(anoCarro);

            double descontoValor = CalcularDesconto.descontoCalculado(anoCarro);
            double precoCarroOriginal = 10000; // Preço fictício
            double valorDesconto = precoCarroOriginal * descontoValor;
            double precoCarroFinal = precoCarroOriginal - valorDesconto;

            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: " + precoCarroFinal);

            if (anoCarro <= 2000) {
                totalCarros2000++;
            }
            totalGeralCarros++;

            System.out.println("Deseja continuar? (S/N)");
        } while (scanner.next().equalsIgnoreCase("S"));

        System.out.println("Total de carros até 2000: " + totalCarros2000);
        System.out.println("Total de carros: " + totalGeralCarros);
    }
}
