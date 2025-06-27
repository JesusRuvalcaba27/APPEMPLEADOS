public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Antonio", "Desarrollador", 12000);
        Empleado empleado2 = new Empleado("Ana", "Diseñadora", 11000);
        Empleado empleado3 = new Empleado("Luis", "Analista", 9500);

        System.out.println("Lista de empleados:\n");

        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
    }
}