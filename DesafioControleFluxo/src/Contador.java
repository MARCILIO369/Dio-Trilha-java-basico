import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e ) {
			System.out.println("Dados Invalido !");
			e.printStackTrace();

		}	
		
       sc.close();

	}


	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			
        int contagem = parametroDois - parametroUm;

        if( parametroDois < parametroUm){
            throw new ParametrosInvalidosException(parametroUm, parametroDois);

        } else{

            for(int x = parametroUm ; x <= parametroDois; x++){

                System.out.println(x);
                
            }
            
        }

    }



}
        





    