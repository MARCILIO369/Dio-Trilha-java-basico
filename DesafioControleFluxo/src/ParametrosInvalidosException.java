public class ParametrosInvalidosException extends Exception { 

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int numero1;
    int numero2;

    public ParametrosInvalidosException(int numero1, int numero2){
        super();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    @Override
    public String toString(){
        return " Valor do segundo : "+ numero2 + " menor que o primeiro  " + numero1+ "!";
    }

}
