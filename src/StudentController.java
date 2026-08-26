public class StudentController {

    private String studentName;
    private int studentAge;
    private boolean hasStudent = false; 

    public void controller() {
        System.out.println("Controlador de estudiantes activo.");
    }

    public void registerStudent(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
        this.hasStudent = true;
        System.out.println("Estudiante " + name + " guardado con éxito.");
    }

    public void showStudent() {
        if (hasStudent) {
            System.out.println("Nombre: " + studentName);
            System.out.println("Edad: " + studentAge + " años");
        } else {
            System.out.println("No hay ningún estudiante registrado todavía.");
        }
    }

    public void clearStudent() {
        this.studentName = "";
        this.studentAge = 0;
        this.hasStudent = false;
        System.out.println("Datos del estudiante eliminados.");
    }
}
