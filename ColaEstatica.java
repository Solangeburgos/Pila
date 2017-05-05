package TDApilacolalista;

		
	public class ColaEstatica <T>implements Cola<T> {
		
		private T[] cola = null;
		private  int  primero;
	    private  int  ultimo;

	    static final int TAM_POR_DEFECTO =5;
	    
	    public ColaEstatica() {
	    	   this.cola =(T[]) new Object[TAM_POR_DEFECTO];
	    	   primero = ultimo = -1;
	    }

	    public boolean esVacia() {
	    	return primero == -1 || primero > ultimo;
	    }
	    
	    public void vaciar() {
	    	primero = ultimo = -1;
	    }
	 
	    public void desencolar(){
	 	   primero++;
	    }
	    
	    private void duplicarVector(){
	  	  T aux[]=(T[]) new Object[cola.length*2];
	  	  for(int i=0;i<cola.length;i++)
	  	  	aux[i]=cola[i];
	    }
	    
	    public void encolar(T x)
	    { 
	    	if(ultimo + 1 == cola.length) duplicarVector();
	    	if(this.esVacia()) primero++;
	    	cola[++ultimo]= x;
	    }

	    public T verPrimero(){
	 	   if(!this.esVacia())
	 		   return cola[primero];
	 	   else
	 		   return null;
	    }

	    public T verUltimo(){
	 	   if(!this.esVacia())
	 		   return cola[ultimo];
	 	   else
	 		   return null;
	    }
	    
	    public static void main(String[] args){

	 	   ColaEstatica<Integer> c1= new <Integer> ColaEstatica() ;
	 	   
	 	   c1.encolar(4);
	 	   System.out.println(c1.verPrimero());
	 	   c1.encolar(6);
	 	   c1.encolar(8);
	 	   c1.encolar(1);
	 	   System.out.println(c1.verPrimero());
	 	   c1.desencolar();
	 	   System.out.println(c1.verPrimero());
	 	   System.out.println(c1.esVacia());
	 	  c1.desencolar();
	 	 c1.desencolar();
	 	c1.desencolar();
	 	 
	 	System.out.println(c1.esVacia());
	 	   
	 	   
	    }
	 	   
	}