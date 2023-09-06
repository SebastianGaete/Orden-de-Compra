import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    Date new_date = new Date();
    SimpleDateFormat fecha_format = new SimpleDateFormat("EEEE dd/MM/yyyy H:m");
    String fecha_actual = fecha_format.format(new_date);


    private Integer identificador = 0;
    private String descripcion;
    private String fecha = fecha_actual + " Hrs.";
    private Cliente persona;
    private Producto[] producto = new Producto[4];
    private int indiceProducto;

    private static int id;

    OrdenCompra(String descripcion) {
        this.identificador = id++;
        this.descripcion = descripcion;
    }


    public Integer getIdentificador() {
        return ++identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getPersona() {
        return persona;
    }

    public void setPersona(Cliente persona) {
        this.persona = persona;
    }

    public Producto[] getProducto() {
        return this.producto;
    }

    // Método para agregar productos.
    public void addProductos(Producto productos){
        if (indiceProducto < producto.length){
            this.producto[indiceProducto++] = productos;
        }

    }

    public int granTotal(Producto[] productos){
        int suma = 0;
        for ( int i = 0; i < productos.length; i++ ){
            suma += productos[i].getPrecio();
        }
        return suma;
    }


}
