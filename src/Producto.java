public class Producto {
    public String nombre;
    public String descripcion;
    public int codigo;
    public Double precioBase;
    public int cantidad;

    public Producto(String nombre, String descripcion, int codigo, Double precioBase, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }
}
