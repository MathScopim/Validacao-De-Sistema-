import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        */
        selecaoCandidatos();
    }
    static void selecaoCandidatos() {
        String [] candidatos= {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio","Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPrtendido = valorPretendido();


            System.out.println("O candidato " + candidato + " Solicitou este valor de  salário " + salarioPrtendido);
            if(salarioBase >= salarioPrtendido) {
                System.out.println("O candidato  " + candidato + "Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
       return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        }else if(salarioBase == salarioPretendido)
        System.out.println("ligar para candidato com contra proposta");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }


    }
}
