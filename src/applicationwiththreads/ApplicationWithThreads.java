package applicationwiththreads;

/**
 *
 * @author wilver
 */
public class ApplicationWithThreads {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Wilver Martinez");
        cliente1.setProductos(new Integer[]{1,2,3,4,5,6});
        
        
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Steven Vargas");
        cliente2.setProductos(new Integer[]{1,2,3,4,5,6,8,9});
        
        long initialTime = System.currentTimeMillis();
        
        Cajera cajera1 = new Cajera("Josefa");
        cajera1.setCliente(cliente1);
        cajera1.setInitialTime(initialTime);
        //cajera1.cobrar();
        cajera1.start();
        
        Cajera cajera2 = new Cajera("Pablita");
        cajera2.setCliente(cliente2);
        cajera2.setInitialTime(initialTime);
        //cajera2.cobrar();
        cajera2.start();
        
        
    }
    
}
