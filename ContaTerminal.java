package ContaBanco.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o número da sua conta: ");
                int conta = scanner.nextInt();
            System.out.println("Digite o número da sua agencia: ");
                String agencia = scanner.next();
            System.out.println("Digite o seu nome: ");
                String nome = scanner.next();
            System.out.println("Digite o seu saldo: ");
                double saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ",com a conta corrento número " + conta + ".Seu saldo é de R$"+saldo+", e já encontra-se disponível para saque!");
    }
}
