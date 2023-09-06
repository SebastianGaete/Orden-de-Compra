public class EjemploOrdenesMain {
    public static void main(String[] args) {


        OrdenCompra orden1 = new OrdenCompra("Computadores tipo gaming ultima generación");
        orden1.setPersona(new Cliente("Sebastian", "Gaete"));

        Producto[] productos_orden1 = new Producto[4];
        for (int i = 0; i < productos_orden1.length; i++){
             orden1.addProductos(new Producto("HP", "Pavilon Gaming", 600000));
        }
        System.out.println("Número de orden: " + orden1.getIdentificador());
        System.out.println("Cliente: " + orden1.getPersona().getNombre() + " " + orden1.getPersona().getApellido() );
        System.out.println("Fecha de compra: " + orden1.getFecha());
        System.out.println("Productos comprados: ");

        for (Producto p : orden1.getProducto()){
            System.out.println(p.getFabricante() + " " + p.getNombre() + " " + "$"+ p.getPrecio());
        }
        System.out.println("Descripcion: " + orden1.getDescripcion());
        System.out.println("Precio total: $" + orden1.granTotal(orden1.getProducto()) );

        System.out.println();



        OrdenCompra orden2 = new OrdenCompra("Teléfono última generación touch");
        orden2.setPersona(new Cliente("Melanee", "Ramos"));

        Producto[] productos_orden2 = new Producto[4];
        for (int i = 0; i < productos_orden2.length; i++){
            orden2.addProductos(new Producto("Xiaomi", "POCXX4000", 300000));
        }
        System.out.println("Número de orden: " + orden2.getIdentificador());
        System.out.println("Cliente: " + orden2.getPersona().getNombre() + " " + orden2.getPersona().getApellido() );
        System.out.println("Fecha de compra: " + orden2.getFecha());
        System.out.println("Productos comprados: ");

        for (Producto p : orden2.getProducto()){
            System.out.println(p.getFabricante() + " " + p.getNombre() + " " + "$"+ p.getPrecio());
        }
        System.out.println("Descripcion: " + orden2.getDescripcion());
        System.out.println("Precio total: $" + orden2.granTotal(orden2.getProducto()) );


        System.out.println();



        OrdenCompra orden3 = new OrdenCompra("Cama de tres plazas super comoda");
        orden3.setPersona(new Cliente("Paula", "Fuentes"));

        Producto[] productos_orden3 = new Producto[4];
        for (int i = 0; i < productos_orden3.length; i++){
            orden3.addProductos(new Producto("Celta", "Flextion", 200000));
        }
        System.out.println("Número de orden: " + orden3.getIdentificador());
        System.out.println("Cliente: " + orden3.getPersona().getNombre() + " " + orden3.getPersona().getApellido() );
        System.out.println("Fecha de compra: " + orden3.getFecha());
        System.out.println("Productos comprados: ");

        for (Producto p : orden3.getProducto()){
            System.out.println(p.getFabricante() + " " + p.getNombre() + " " + "$"+ p.getPrecio());
        }
        System.out.println("Descripcion: " + orden3.getDescripcion());
        System.out.println("Precio total: $" + orden3.granTotal(orden3.getProducto()) );

    }
}
