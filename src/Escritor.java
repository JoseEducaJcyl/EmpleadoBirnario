import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    //Metodo guardarEmeplado que se le pasa una lista de empleados y una cadena 
    //con la ruta y nombre del archivo , y crea el fichero binario 
    public void guardarEmpleado(List<Empleado> empleados, String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(empleados);
            System.out.println("Objeto Empleado serializado y guardado en empleados.gente");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}

