
package TDApilacolalista;


public class PilaEstatica <T>implements Pila<T>{
	
	private T[] pila = null;
	private int cima;
	
		static final int TAM_POR_DEFECTO = 5;
		
		public PilaEstatica(){
			this.pila = (T[]) new Object[TAM_POR_DEFECTO];
			cima = -1;
		}
		
		public boolean esVacia(){
			return cima ==-1;
		}
		
		public void vaciar(){
			cima=-1;
		}
		
		public void desapilar(){
			cima--;			
		}
		
		public T vercima(){
			if(!this.esVacia())
				return pila[cima];
			else
				return null;			
		}
		
		private void duplicarVector(){
			T aux[]=(T[]) new Object[pila.length*2];
				for(int i=0;i<pila.length;i++)
					aux[i]=pila[i];
		}
		
		public void apilar(T x){
			if(cima +1==pila.length)
				duplicarVector();
				pila[++cima]=x;			
		}
	

	public static void main(String[] args) {
	//	PilaEstatica<String> p1=<String> new PilaEstatica();
		PilaEstatica<Integer> p1 = new <Integer> PilaEstatica();
		p1.apilar(2);
		System.out.println(p1.vercima());
		System.out.println(p1.esVacia());
		p1.apilar(5);
		p1.apilar(7);
		System.out.println(p1.vercima());
		p1.desapilar();
		System.out.println(p1.vercima());
		p1.desapilar();
		p1.desapilar();
		System.out.println(p1.esVacia());
		
	}

	

}