public class ComponenteAlmacenamiento extends Producto{
    private int capacidad;
    private String tecnologia;

    public ComponenteAlmacenamiento(String nombre, String descripcion, int codigo, Double precioBase, int cantidad, int capacidad, String tecnologia) {
        super(nombre, descripcion, codigo, precioBase, cantidad);
        this.capacidad = capacidad;
        this.tecnologia = tecnologia;
    }
}
