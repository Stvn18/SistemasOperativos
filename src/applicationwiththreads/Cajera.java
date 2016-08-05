package applicationwiththreads;

/**
 *
 * @author wilver
 */
public class Cajera  extends Thread {

    private String nombre;
    private Cliente cliente;
    private Long initialTime;

    public Cajera() {
    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Long initialTime) {
        this.initialTime = initialTime;
    }
    
    public void cobrar() {

        System.out.println("Cobrando la cajera: " + this.nombre + " al cliente: " + cliente.getNombre());

        System.out.println("Productos del cliente " + cliente.getNombre());

        for (Integer i : cliente.getProductos()) {
            
            System.out.println("Cobrando producto " + i + " ->Tiempo: " + (System.currentTimeMillis() - initialTime) / 1000 + " seg");
            
            this.esperarUnSegundo();
            
        }

        System.out.println("La cajera: " + this.nombre + " ha terminado de cobrar al cliente: " + cliente.getNombre());

    }

    private void esperarUnSegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public void run(){
        this.cobrar();
    }

}
