package aplicacion;

import dominio.Concesionario;
import dominio.VehiculoTurismo;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        int opcion;
        boolean salir = true;
        Concesionario concesionario = new Concesionario();
        Scanner lectorInt = new Scanner(System.in);

        
        do{
            System.out.println("1) Mostrar Concesionario");
            System.out.println("2) Carrito");
            System.out.println("3) Salir");
            opcion = lectorInt.nextInt();
            switch (opcion) 
            {
                case 1:
                    concesionario.mostrarConcesionario();      
                    break;
                
                case 2:
                concesionario.mostrarCarrito();
                    break;
                case 3:
                System.out.println("Gracias por usar el programa :)");
                    salir = false;
                    break;
                
                default:
                System.out.println("ERROR");
                    break;

            }
        }while(opcion>0 && opcion < 3);
        
    }
}