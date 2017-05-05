
package TDApilacolalista;

public interface Pila<T> {
	
	public boolean esVacia();
	public void apilar(T x);
	public void desapilar();
	public T vercima();
	public void vaciar();
}