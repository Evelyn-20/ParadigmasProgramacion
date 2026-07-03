public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;

    public Vehiculo(String marca, String modelo, int anio, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public void avanzar(double kilometros) {
        if (kilometros > 0) {
            kilometraje += kilometros;
        }
    }

    public int calcularAntiguedad(int anioActual) {
        return anioActual - anio;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("anio: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
    }
}