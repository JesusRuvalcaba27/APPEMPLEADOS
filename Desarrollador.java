public class Desarrollador extends Empleado {
    String lenguajeProgramacion;

    public Desarrollador(String nombre, double sueldo, String lenguajeProgramacion) {
        super(nombre, "Desarrollador", sueldo);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Sobrescribe el método para agregar información adicional
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje de Programación: " + lenguajeProgramacion);
        System.out.println("----------------------");
    }
}
