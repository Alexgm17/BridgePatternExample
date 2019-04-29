package bridge;

/**
 * Created by Alexgm on 11/03/2019.
 */
//Clase abstracta Vehiculo, con la propiedad color de la interfaz color
public abstract class Vehiculo {

    protected Color color;

    public Vehiculo(Color color){
        this.color = color;
    }
//Metodo fabricar
    public abstract void fabricar();
}
