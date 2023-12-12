package aplicacion;

import dominio.Concesionario;
import dominio.Vehiculo;
import dominio.VehiculoTurismo;
import interfaz.Interfaz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main
{
    public static void main(String[]args) throws IOException, ClassNotFoundException
    {
        Interfaz interfaz = new Interfaz();
        interfaz.leer();
        interfaz.mostrarMenu();
    }
}