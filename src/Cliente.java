public class Cliente {

    private String nombre;
    private String apellido;

    Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}