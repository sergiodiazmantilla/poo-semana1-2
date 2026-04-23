public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(1001, "Ana García", 13.8);
        Estudiante e2 = new Estudiante(1002, "Sergio Diaz", 14.5);
        Estudiante e3 = new Estudiante(1003, "Rosa Merino", 16.5);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        System.out.println("Total Estudiantes: "+Estudiante.getTotalEstudiante());
    }
}