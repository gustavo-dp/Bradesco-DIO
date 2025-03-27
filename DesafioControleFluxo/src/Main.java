import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = scan.nextInt();
        System.out.println("Digite um número");
        int num2 = scan.nextInt();
        try{
                 contar(num1,num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void contar(int first,int second) throws ParametrosInvalidosException{
        if (first > second) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        for(int x=first;x<=second;x++){
            System.out.println("imprimindo o número:"+x);
        }
    }

}