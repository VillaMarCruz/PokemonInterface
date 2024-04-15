package logica;

import interfaz.IAgua;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo ");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco ");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba ");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola agua ");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque borbuja ");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidro pulso ");
    }
}
