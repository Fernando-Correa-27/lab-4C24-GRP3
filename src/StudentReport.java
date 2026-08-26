public class StudentReport {
    private String studentName;
    private double grade;

    public StudentReport(String studentName, double grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    public void printReport() {
        System.out.println("Estudiante: " + studentName + " | Nota: " + grade);
    }
}
