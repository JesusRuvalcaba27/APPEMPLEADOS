public class Diseñador extends Empleado {
    String herramientaDiseno;

    public Diseñador(String nombre, double sueldo, String herramientaDiseno) {
        super(nombre, "Diseñador", sueldo);
        this.herramientaDiseno = herramientaDiseno;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Herramienta de Diseño favorita: " + herramientaDiseno);
        System.out.println("----------------------");
    }
}