public class Main {

    public static void main(String[] args) throws Exception {
        Caja caja1;
     
        MyQueue unifila = new MyQueue();
        PilaCont contenedor1 = new PilaCont();
        PilaCont contenedor2 = new PilaCont();
        PilaCont contenedor3 = new PilaCont();

        for(int i = 11; i <21;i++){

            unifila.enqueue(new Caja("Fresa",i));

        }

        for(int i = 21; i <31;i++){

            unifila.enqueue(new Caja("Manzana",i));

        }

        for(int i = 31; i <41;i++){

            unifila.enqueue(new Caja("Membrillo",i));

        }
     
        
        while(!unifila.isEmpty())
        {

            if(unifila.peek().getFruta() ==  "Fresa")
            {
                contenedor1.push(unifila.dequeue());    
             }
                       
            if(unifila.peek().getFruta() ==  "Manzana")
            {
                contenedor2.push(unifila.dequeue());

            }

            if(unifila.peek().getFruta() ==  "Membrillo")
            { 
                contenedor3.push(unifila.dequeue());
 
            }
          

        }
       
        while(!contenedor1.isEmpty())
        {
            caja1 = contenedor1.pop();
            System.out.println("Contenedor 1(fresas): " +" Peso: "+ caja1.getPeso()+"kg -" +" fruta: "+ caja1.getFruta());
            
        }

        while(!contenedor2.isEmpty())
        {
            caja1 = contenedor2.pop();
            System.out.println("Contenedor 2(manzana): " +" Peso: "+ caja1.getPeso()+"kg -" +" fruta: "+ caja1.getFruta());
        }
        while(!contenedor3.isEmpty())
        {
            caja1 = contenedor3.pop();
            System.out.println("Contenedor 3(membrillo): " +" Peso: "+ caja1.getPeso()+"kg -" +" fruta: "+ caja1.getFruta());
        }
	
  
        
    }

	
    
}
