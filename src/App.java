import logica.Bulbasur;
import logica.Charmander;
import logica.Pikachu;
import logica.Squirtle;

public class App {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();

        bulbasur.atacarAraniazo();
        bulbasur.atacarDrenaje();

        pikachu.atacarAraniazo();
        pikachu.atacarInpactrueno();
    }
}
