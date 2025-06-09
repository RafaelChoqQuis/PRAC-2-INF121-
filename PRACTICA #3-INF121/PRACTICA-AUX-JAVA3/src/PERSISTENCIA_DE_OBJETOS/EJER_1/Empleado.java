package PERSISTENCIA_DE_OBJETOS.EJER_1;
// a) Clase Empleado que representa al objeto a guardar
import java.io.Serializable;
public class Empleado implements Serializable {
    String nombre;
    int edad;
    float salario;
    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
