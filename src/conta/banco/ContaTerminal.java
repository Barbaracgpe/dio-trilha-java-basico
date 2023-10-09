package conta.banco;

//TODO: Conhecer e importar a classe scanner

//Exibir as mensagens para os nossos usuarios

//Obter pela scanner os valores digitados no terminal

//Exibir a mensagem conta criada

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = "067-8";

        System.out.println("Por favor, digite o número da Conta:");
        int numero = 1021;

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = "MÁRIO ANDRADE";

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = 237.48;

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                + " já está disponível para saque.");

        scanner.close();
    }
}
