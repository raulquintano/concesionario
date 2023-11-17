package dominio;
import java.lang.Math;

public class Furgoneta extends Vehiculo 
{
    public Furgoneta(String marca, String modelo, double precio)
    {
        super(marca, modelo, precio);
    }
    double capacidad;
    double precioCapacidad;   
    public Furgoneta()
    {

    }

    public double getCapacidad()
    {
        return capacidad;
    }
    public void setCapacidad(double capacidad)
    {   
        this.capacidad = capacidad;
    }

    public double getprecioCapacidad()
    {
        return precioCapacidad;
    }
    public void setPrecioCapacidad(double precioCapacidad)
    {   
        this.precioCapacidad = precioCapacidad;
    }

    public void precioArea(float precioBase)
    {
        precioCapacidad = precioBase*(Math.cbrt(getCapacidad())/2);
        setCapacidad(precioCapacidad);
        
    }
    
}