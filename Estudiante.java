public class Estudiante {
    // Atributos
    private int codigo;
    private String nombre;
    private Double nota;

    // Variable Static: compartida por todos los objetos
    private static int totalEstudiantes = 0;

    // Constructor vacío
    public Estudiante(){}

    // Constructor con parametros
    public Estudiante(int codigo, String nombre, Double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
        totalEstudiantes++;
    }

    // Getter y Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        // validacion
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // validacion
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        // validacion
        this.nota = nota;
    }

    // Metodos
    public void mostrarInfo(){
        System.out.println(
            "Estudiante: " + nombre + "Nota: " + nota);
    }

    // Metodo Static
    public static int getTotalEstudiante(){
        return totalEstudiantes;
    }
}