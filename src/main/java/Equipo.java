import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equipo {

        Scanner entrada = new Scanner(System.in);
        private String nombre;
        private List<Jugador> jugEnEquipo;
        public Equipo(String nombre){
            this.nombre=nombre;
            this.jugEnEquipo = new ArrayList<Jugador>();
        }
        public void llenarEquipo(){
            this.jugEnEquipo.add(new Jugador(entrada.next(), entrada.nextInt()));
        }
    public void mostrarJugadore(List<Jugador> jugadores){
        for(Jugador jugador : jugadores){
            //String datos="nombre: "+Jugador.getNombre()+", marca: "+Jugador.getEdad();
           // System.out.println(datos);
        }
}
