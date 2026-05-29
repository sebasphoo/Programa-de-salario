public class main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Sebastian", 2000000);

        System.out.println("Nombre del empleado: " + empleado1.nombre);
        System.out.println("Salario mensual: $" + empleado1.getSalario());
        System.out.println("Salario anual: $" + empleado1.calcularSalarioAnual());
    }
}
class Empleado {

    String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }
}
