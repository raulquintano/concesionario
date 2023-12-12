package dominio;

import java.util.Scanner;
import java.util.ArrayList;

public class Concesionario {

    float precioConcesionario;
    int opcionCatalogo;
    int plazas;
    float precioBase;
    Scanner lectorInt = new Scanner(System.in);
    ArrayList<Vehiculo> carrito = new ArrayList<>();


    public ArrayList<Vehiculo> getArrayList()
    {
        return carrito;
    }
    public void mostrarConcesionario()
    {
        System.out.println("--VEHICULOS DISPONIBLES--");
        System.out.println("");
        System.out.println("                                  --Precio Base--");
        System.out.println("1) Ford Pickup (2 plazas)           || 14.000$");
        System.out.println("2) Audi Deportivo (4 plazas)        || 29.000$");
        System.out.println("3) Mercedes Monovolumen (7 plazas)  || 45.000$");
        System.out.println("4) Mercedes SUV (5 plazas)          || 25.000$");
        System.out.println("5) Ford Furgoneta (3 plazas) (27m^3)|| 28.000$") ;
        precioConcesionario = 14000+29000+45000+25000+28000;
        System.out.println("Precio concesionario: "+precioConcesionario+"$");
        System.out.println("");
        System.out.println("(Seleccione el número del vehículo que desea)");
        opcionCatalogo = lectorInt.nextInt();
        if(opcionCatalogo==1)
        {
            VehiculoTurismo vehiculo = new VehiculoTurismo();
            vehiculo.setMarca("Ford");
            vehiculo.setModelo("Pickup");
            precioBase = 14000;
            plazas = 2;
            vehiculo.calcularPrecio(plazas,precioBase);
            System.out.println(vehiculo);
            System.out.println("Añadido correctamente");
            carrito.add(vehiculo);
            System.out.println("");
        }
        else if(opcionCatalogo==2)
        {
            VehiculoTurismo vehiculo = new VehiculoTurismo();
            vehiculo.setMarca("Audi");
            vehiculo.setModelo("Deportivo");
            precioBase = 29000;
            plazas = 4;
            vehiculo.calcularPrecio(plazas,precioBase);
            System.out.println(vehiculo);
            System.out.println("Añadido correctamente");
            carrito.add(vehiculo);
            System.out.println("");
        }
        else if(opcionCatalogo==3)
        {
            VehiculoTurismo vehiculo = new VehiculoTurismo();
            vehiculo.setMarca("Mercedes");
            vehiculo.setModelo("Monovolumen");
            precioBase = 45000;
            plazas = 7;
            vehiculo.calcularPrecio(plazas,precioBase);
            System.out.println(vehiculo);
            System.out.println("Añadido correctamente");
            carrito.add(vehiculo);
            System.out.println("");
        }
        else if(opcionCatalogo==4)
        {
            VehiculoTurismo vehiculo = new VehiculoTurismo();
            vehiculo.setMarca("Mercedes");
            vehiculo.setModelo("SUV");
            precioBase = 25000;
            plazas = 5;
            vehiculo.calcularPrecio(plazas,precioBase);
            System.out.println(vehiculo);
            System.out.println("Añadido correctamente");
            carrito.add(vehiculo);
            System.out.println("");
        }
        else if(opcionCatalogo==5)
        {
            VehiculoTurismo vehiculo = new VehiculoTurismo();
            Furgoneta furgoneta = new Furgoneta();

            vehiculo.setMarca("Ford");
            vehiculo.setModelo("Furgoneta");
            precioBase = 28000;
            furgoneta.setCapacidad(27);
            plazas = 3;
            furgoneta.precioArea(precioBase);
            vehiculo.precio=furgoneta.getCapacidad();
            System.out.println(vehiculo);
            System.out.println("Añadido correctamente");
            carrito.add(vehiculo);            
            System.out.println("");
        }
        
        else
        {
            System.out.println("?#¡ ---> Opcion no disponible!");
        }
    }

    public void mostrarCarrito()
    {
        for(Vehiculo n : carrito)
        {
            System.out.println(n);
            System.out.println("");
        }
       
    }
}   