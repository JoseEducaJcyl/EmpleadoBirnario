import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Lector {
    public void leerEmpleados(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<Empleado> empleados = (List<Empleado>) ois.readObject();
            for (Empleado empleado : empleados) {
                System.out.println(empleado.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }
    }
}
