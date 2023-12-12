package interfaz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import dominio.Concesionario;
import dominio.Vehiculo;
import dominio.VehiculoTurismo;

public class Interfaz  {

    int opcion;
    boolean salir = true;
    ArrayList<Concesionario> c;
    Concesionario concesionario = new Concesionario();
    Scanner lectorInt = new Scanner(System.in);

    public void mostrarMenu()
    {
        System.out.println("1) Mostrar Concesionario");
            System.out.println("2) Carrito");
            System.out.println("3) Salir");
            opcion = lectorInt.nextInt();
            switch (opcion) 
            {
                case 1:
                    concesionario.mostrarConcesionario();
                    mostrarMenu();      
                    break;
                
                case 2:
                concesionario.mostrarCarrito();
                VehiculoTurismo vehiculoTurismo = new VehiculoTurismo();
                mostrarMenu();
                    break;
                case 3:
                System.out.println("Gracias por usar el programa :)");
                grabar();
                    salir = false;
                    break;
                
                default:
                System.out.println("ERROR");
                mostrarMenu();
                    break;

            }
    }

    public void leer()
    {
        File f=new File("concesionario.dat");
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
            c=(ArrayList<Concesionario>)ois.readObject();
            ois.close();
        } catch (Exception e) {
            c=new ArrayList<Concesionario>();
        }
    }

    public void grabar(){
        File f=new File("concesionario.dat");
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(concesionario);
            oos.close();
            System.out.println("Grabado correctamente");
        } catch (Exception e) {
            System.out.print("Error al grabar");
        }
    }

    
}
