public class PilaCont {
	private Caja pila[];
	private int tope;
	
	public PilaCont(){ 
		pila = new Caja[30];
		tope = -1;
	} 
	
	public boolean isEmpty(){
		return tope == -1;
	}
	
	public void push(Caja caja){
		if(tope+1 < pila.length)
			pila[++tope] = caja;
	}

	public Caja pop(){
		if(isEmpty())
			return new Caja("nullpop",0);
		return 
			pila[tope--];
	}


	public Caja peek(){
		if(isEmpty())
		return new Caja("nullpeek",0);
		return pila[tope];
	}


}
	