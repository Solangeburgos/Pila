package TDApilacolalista;
	

public class PilaDinamica<T>implements Pila<T>{
		
		private NodoSimple <T> cima;
		
		//clase interna
		
		public class NodoSimple <T> {
			private T dato;
			private NodoSimple<T> siguiente;
			public NodoSimple( T dato){
				this(dato,null);
			}
			
			public NodoSimple(){
				this(null,null);
			}
			
			public NodoSimple(T dato, NodoSimple<T> siguiente){
				this.dato=dato;
				this.setSiguiente(siguiente);
			}
			
			public NodoSimple<T> getSiguiente(){
				return siguiente;
			}
			
			public void setSiguiente(NodoSimple<T> siguiente){
				this.siguiente=siguiente;
			}
			
		}
		
		//fin clase interna
		
			public PilaDinamica(){
				cima = null;
			}
			
			public boolean esVacia(){
				return cima == null;
			}
			
			public void vaciar(){
				cima = null;
			}
			
			public void apilar (T x){
				NodoSimple nodo = new NodoSimple(x);
				
				if(cima!=null)
					nodo.siguiente=cima;
				cima=nodo;			
			}
			
			public void desapilar(){
				cima=cima.siguiente;
			}
			
			public T vercima(){
				return cima.dato;
			}
		
		
		
		

		public static void main(String[] args) {
			
			Pila p2 = new PilaDinamica();
			
			p2.apilar(5);
			System.out.println(p2.vercima());
			System.out.println(p2.esVacia());
			p2.desapilar();
			System.out.println(p2.esVacia());
			
			
			
			

		}

	}