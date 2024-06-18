package Desafio;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial e a quantidade de transações
        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        // Processa cada transação
        for (int i = 0; i < quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Atualiza o saldo com base no tipo de transação
            if (Character.toUpperCase(tipoTransacao) == 'D') {
                saldo += valorTransacao;
            } else if (Character.toUpperCase(tipoTransacao) == 'S') {
                saldo -= valorTransacao;
            }
        }

        // Exibe o saldo final
        System.out.printf("Saldo : %.1f\n", saldo);

        // Exibe a lista de transações formatada
        String transacoesFormatadas = transacoes.stream()
                .map(t -> String.format("%c de %.1f",
                        Character.toLowerCase(t.getTipo()),
                        t.getValor()))
                .collect(Collectors.joining("\n"));

        System.out.println("Transacoes:\n" + transacoesFormatadas);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}

