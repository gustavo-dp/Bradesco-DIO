public class MinhaClasse{
    public static void main(String[] args) {
        System.out.print("Ola turma");
        String primeiroNome = "gustavo";
        String segundoNome = "Deda";
        String concatenado = concatena(primeiroNome, segundoNome);
        System.out.println(concatenado);
    }
    public static String concatena(String primeiro, String segundo){
        return primeiro.concat("").concat(segundo);
    } 
    }

    
