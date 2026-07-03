public class Estudiante {

    private String nombre;
    private String carnet;
    private int nota1, nota2, nota3;

    public Estudiante(String nombre, String carnet, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    // Métodos
    public double calcularPromedio() {
        return (getNota1() + getNota2() + getNota3()) / 3.0;
    }

    public String obtenerEstado() {
        double promedio = calcularPromedio();
        return (promedio >= 70) ? "Aprobado" : "Reprobado";
    }

    public String obtenerInformacion() {
        return "Nombre: " + getNombre() +
               ", Carnet: " + getCarnet() +
               ", Nota1: " + getNota1() +
               ", Nota2: " + getNota2() +
               ", Nota3: " + getNota3();
    }
}