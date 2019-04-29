package bridge;

/**
 * Created by Alexgm on 11/03/2019.
 */
public class Avion extends Vehiculo{
//Clase Avion que extiende de la clase Vehiculo
    public Avion(Color color) {
        super(color);
    }
//Implementa el metodo fabricar de Vehiculo
    @Override
    public void fabricar() {
        System.out.println("Fabricando avion....");
        color.pintar();
    }
}
