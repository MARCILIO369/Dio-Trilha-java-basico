import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    	Scanner sc = new Scanner(System.in);
    	int numero = 0;
    	String nome = "";
    	String agencia;
    	Double saldo = 0.0;
    	
    	System.out.println("Digite o numero conta :");
        numero = sc.nextInt(); 
        
        System.out.println("Digite a agencia :");
        agencia = sc.next();
        
        System.out.println("Digite o nome  :");
        nome = sc.next();
        
        System.out.println("Digite o seu saldo   :");
        saldo = sc.nextDouble();
        
        System.out.println("Olá "+ nome +"!, obrigado por Criar uma conta em nosso banco"  );
        System.out.println("sua agencia: " + agencia + " e conta " + numero + ", seu saldo hoje é : " + saldo );

        
        
    }
}
