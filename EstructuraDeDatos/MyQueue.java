public class MyQueue {
	public static final int DEFAULT_SIZE=30;
	private Caja Caja[];
	private int index;
	public MyQueue(){
		Caja=new Caja[DEFAULT_SIZE];
	}
	
	public boolean isEmpty(){
		return index==0;
	}

	public void enqueue(Caja obj) throws Exception{
		if(index == DEFAULT_SIZE){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.Caja[index]=obj;
		this.index++;
	}
	
	public Caja dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		Caja obj=this.Caja[0];
		for(int i =0; i<this.index-1; i++){
			Caja[i]=Caja[i+1];
		}
		this.index--;
		return obj;
	}
	
	public Caja peek() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
			return this.Caja[0];
	}
	
	

}