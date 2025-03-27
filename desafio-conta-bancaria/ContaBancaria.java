import java.util.Scanner;
public class ContaBancaria{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite sua agência");
    int agencia = scanner.nextInt();

    System.out.println("Digite seu número de conta");
    int conta = scanner.nextInt();

    System.err.println("Digite seu saldo");
    Double saldo = scanner.nextDouble();

    System.err.println("Olá"+nome+", obrigado por criar um conta em nosso banco, sua Agência é"+agencia+", conta"+conta+"e seu saldo"+saldo+"já está disponível para saque");

    }
    
}