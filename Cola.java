package TDApilacolalista;

	public interface Cola <T> {
		
		public void    encolar(T x);
		public void    desencolar();
		public T	   verPrimero();
		public T	   verUltimo();
		public boolean esVacia();
		public void    vaciar();
		
	}
	
