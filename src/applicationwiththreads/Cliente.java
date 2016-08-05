package applicationwiththreads;

/**
 *
 * @author wilver
 */
public class Cliente {
    
    private String nombre;
    private Integer[] productos;

    public Cliente() {
    }

    public Cliente(String nombre, Integer[] productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getProductos() {
        return productos;
    }

    public void setProductos(Integer[] productos) {
        this.productos = productos;
    }
    
}
