package dominio;

import java.io.FileOutputStream;
import java.io.Serializable;

public class VehiculoTurismo extends Vehiculo implements Serializable{

    public VehiculoTurismo(String marca, String modelo, double precio)
    {
        super(marca, modelo, precio);
    }
    public VehiculoTurismo()
    {
        
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public double getPrecio()
    {
        return precio;
    }
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    public double calcularPrecio(int plazas, float precioBase)
    {
        if(plazas <= 5)
        {
            precio = precioBase;
        }
        if(plazas > 5)
        {
            precio = precioBase + (precioBase*0.1*(plazas-5));
        }
        return precio;
    }

    public String toString()
    {
        return "Marca: "+ getMarca() + "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio()+"$"; 
    }

}