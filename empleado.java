public class Empleado {
    String nombre;
    String puesto;
    double sueldo;

    // Constructor
    public Empleado(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Puesto: " + puesto);
    System.out.println("Sueldo: $" + sueldo);
    System.out.println("----------------------");
    }
}