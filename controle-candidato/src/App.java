import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
       // analizandoCandidato(1500.00);
       //selecaoCandidato();
       imprimirSelecionados();

    }

    static void imprimirSelecionados(){
        String[] candidato = {"Maria", "Jose", "Mercia", "Jennifer"};

        for(int indice=0; indice < candidato.length; indice++){

            System.out.println("O candidato de numero " + indice + " é "+ candidato[indice]);
        }
        
        System.out.println("Forma breviada de imprimir ");
        
        for( String x : candidato) {

        System.out.println( "O candidato selecionado foi : " + x );
        }
    }

    static void selecaoCandidato(){

        String [] candidatos = {"Aryana", "Marcia", "Marcilio", "Jennifer"};

        // variavel 
        int  candidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase  = 2000.00;
        while(candidatoSelecionados < 5 && candidatosAtual < candidatos.length ){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if( salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi selecionado para vaga");
                candidatoSelecionados++;
            }

            candidatosAtual++;
        } 
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analizandoCandidato(double salarioPretendido){
         double salarioBase = 2000.00;
         if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO !");

         }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA !");

        }else{
            System.out.println("LAGUARDANDO  O RESULTADO DOS DEMAIS CANDIDATO !");

        }

    }

    }

