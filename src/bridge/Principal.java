package bridge;

/**
 * Created by Alexgm on 11/03/2019.
 */
public class Principal {
//Se crea un contenedor con los diferentes vehiculos que vamos a crear, asignandoles el tipo y el color del que lo pintaremos
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Coche(new Blanco());
        vehiculos[1] = new Avion(new Amarillo());
        vehiculos[2] = new Coche(new Negro());
//Se usa un for para que la variable f recorra el contenedor y para cada uno haga una llamada al metodo fabricar
        for(Vehiculo f : vehiculos){
            f.fabricar();
        }

    }
}
