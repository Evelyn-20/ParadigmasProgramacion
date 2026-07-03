public class MainVehiculo {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2018, 85000);
        Vehiculo v2 = new Vehiculo("Hyundai", "Tucson", 2022, 25000);

        v1.mostrarInformacion();
        System.out.println();

        v2.mostrarInformacion();
        System.out.println();

        v1.avanzar(350);

        System.out.println("Despues de avanzar:");
        v1.mostrarInformacion();

        System.out.println("Antiguedad: " + v1.calcularAntiguedad(2026) + " anios");
    }
}