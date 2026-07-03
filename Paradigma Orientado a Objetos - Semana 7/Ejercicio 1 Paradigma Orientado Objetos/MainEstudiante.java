public class MainEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Evelyn Masís", "123456", 80, 90, 85);
        Estudiante estudiante2 = new Estudiante("Juan Pérez", "654321", 70, 75, 60);

        System.out.println("Información del primer estudiante:");
        System.out.println(estudiante1.obtenerInformacion());

        System.out.println("\nInformación del segundo estudiante:");
        System.out.println(estudiante2.obtenerInformacion());

        System.out.println("\n------------------------------------------------------------\n");

        System.out.printf("Promedio del primer estudiante: %.2f%n", estudiante1.calcularPromedio());
        System.out.printf("Promedio del segundo estudiante: %.2f%n", estudiante2.calcularPromedio());

        System.out.println("\n------------------------------------------------------------\n");

        System.out.println("Estado del primer estudiante: " + estudiante1.obtenerEstado());
        System.out.println("Estado del segundo estudiante: " + estudiante2.obtenerEstado());
    }
}