import java.util.ArrayList;
import java.util.List;

public class Main {
    //Metodo main que sirve para ejecutar el codigo 
    public static void main(String[] args) {
        //Declaramos una lista de empleados que almacene objetos 
        //de la clase Empleado 
        List<Empleado>  empleados = new ArrayList<>();
        empleados.add(new Empleado("emp1",1,1500.0));
        empleados.add(new Empleado("emp2",2,1600.0));
        empleados.add(new Empleado("emp3",3,1450.0));
        //Llamada a la clase Escritor y Lector y a sus metodos 
        Escritor escritor;
        Lector lector;
        escritor = new Escritor();
        lector = new Lector();
        escritor.guardarEmpleado(empleados,"empleados.lista");
        lector.leerEmpleados("empleados.lista");
    }
}
