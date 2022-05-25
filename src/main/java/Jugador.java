import java.util.Scanner;

public class Jugador {

        String nombre;
        int edad;
        Scanner entrada= new Scanner(System.in);

        public Jugador(String nombre, int edad){
                this.nombre= nombre;
                this.edad = edad;
        }
        public void defJugador(){
                nombre=entrada.next();
                edad= entrada.nextInt();
        }

        public String getNombre() {
                return nombre;
        }
}
