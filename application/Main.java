package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Digite o número da conta: ");
        int numConta = sc.nextInt();
        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Tem deposit incial (S/N)?");
        char resposta = sc.next().charAt(0);
        if (resposta == 's'){
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numConta, titular, depositoInicial);
        }
        else{
            conta = new Conta(numConta, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para sacar: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}
