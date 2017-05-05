package TDApilacolalista;
	

public class ColaDinamica<T>implements Cola<T>{
		
		private NodoSimple <T> primero;
		private NodoSimple <T> ultimo;
		
		
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
		
			public ColaDinamica(){
				 primero = null;
				 ultimo = null;
			}
			
			public boolean esVacia(){
				return primero == null;
			}
			
			public void vaciar(){
				primero = null;
				ultimo = null;
				//todo recorrer la cola y eliminar uno a uno
			}
			
			public void encolar(T x){
				NodoSimple nodo = new NodoSimple(x); // crea un nodo
				
				if(esVacia()){
					primero=nodo;
					ultimo=nodo;
				}else{
					ultimo.siguiente=nodo;
					ultimo=ultimo.siguiente;
				}
				
				
						
			}
			
			public void desencolar(){
				
				NodoSimple aux;
				
				aux=primero;
				primero=primero.siguiente;
				aux.siguiente=null;
				aux=null;			
				
			}
			
			public T verPrimero(){
				return cima.dato;
			}
		
		
		
		

		public static void main(String[] args) {
			
			Cola c2 = new ColaDinamica();
			
			
			
			
			

		}

	}