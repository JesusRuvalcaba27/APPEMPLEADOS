public class Empleado {
    String nombre;
    String puesto;
    double sueldo;

    public Empleado(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo: $" + sueldo);
        System.out.println("----------------------");
    }
}