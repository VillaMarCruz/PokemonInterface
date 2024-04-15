package logica;

import interfaz.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo ");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco ");
    }

    @Override
    public void atacarInpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque inpactrueno ");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque puño trueno ");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y este es mi ataque rayo ");
    }

    @Override
    public void atacarRayoCaraga() {
        System.out.println("Hola soy Pikachu y este es mi ataque rayo caraga ");
    }
}
