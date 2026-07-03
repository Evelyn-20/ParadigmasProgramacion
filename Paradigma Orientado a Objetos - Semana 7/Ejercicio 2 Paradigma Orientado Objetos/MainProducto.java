public class MainProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto("P001", "Laptop HP", 5499.99, 2);
        Producto producto2 = new Producto("P002", "Mouse Inalambrico", 149.50, 5);

        producto1.mostrarDetalle();
        producto2.mostrarDetalle();

        System.out.println("Subtotal Producto 1: $" + producto1.calcularSubtotal());
        System.out.println("Subtotal Producto 2: $" + producto2.calcularSubtotal());

        double precioConDescuento = producto1.aplicarDescuento(15);
        System.out.println("\nProducto 1 con 15% de descuento: $" + precioConDescuento);
    }
}
