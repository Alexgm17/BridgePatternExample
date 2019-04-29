package bridge;

/**
 * Created by Alexgm on 11/03/2019.
 */
public class Coche extends Vehiculo{
    //Clase Coche que extiende de la clase Vehiculo
    public Coche(Color color) {
        super(color);
    }
    //Implementa el metodo fabricar de Vehiculo
    @Override
    public void fabricar() {
        System.out.println("Fabricando coche....");
        color.pintar();
    }
}
