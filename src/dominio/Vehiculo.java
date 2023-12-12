package dominio;
import java.io.Serializable;

public abstract class Vehiculo {
    String marca;
    String modelo;
    double precio;

   public Vehiculo(String marca, String modelo, double precio)
   {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
   }
   public Vehiculo()
   {

   }
   

}