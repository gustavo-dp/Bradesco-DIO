package Candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("processo seletivo");

    }
    static void selecaoCandidatos(){

    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido)
            System.out.println("ligar candidato");
        else if (salarioBase==salarioPretendido) {
            System.out.println("ligar para candidato com contraproposta");
        }else
            System.out.println("aguardar candidatos");
    }

}
