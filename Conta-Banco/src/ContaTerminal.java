import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);

        System.out.println("SEJA BEM VINDO AO BANCO!");

        System.out.println("Digite o numero da sua conta!");
        int conta = scanner.nextInt();

        System.out.println("Digite a Agência!");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome!");
        String nome = scanner.next();

        System.out.println("Digite seu saldo!");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
