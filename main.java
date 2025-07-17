public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada subclase
        Desarrollador dev = new Desarrollador("Antonio", 12000, "Java");
        Diseñador dis = new Diseñador("Ana", 11000, "Adobe Photoshop");
        Analista analista = new Analista("Luis", 9500, "Mercado Financiero");

        System.out.println("Lista de empleados con información detallada:\n");

        dev.mostrarInformacion();
        dis.mostrarInformacion();
        analista.mostrarInformacion();
    }
}