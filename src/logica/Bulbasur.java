package logica;

import interfaz.IPlanta;

public class Bulbasur extends Pokemon implements IPlanta {

    public Bulbasur() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y este es mi ataque arañazo ");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Bulbasur y este es mi ataque mordisco ");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasur y este es mi ataque paralizar ");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque dreanaje ");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasur y este es mi ataque hoja afilada ");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasur y este es mi ataque latigo cepa ");
    }
}
