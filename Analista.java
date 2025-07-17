public class Analista extends Empleado {
    String areaEspecializacion;

    public Analista(String nombre, double sueldo, String areaEspecializacion) {
        super(nombre, "Analista", sueldo);
        this.areaEspecializacion = areaEspecializacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Área de Especialización: " + areaEspecializacion);
        System.out.println("----------------------");
    }
}