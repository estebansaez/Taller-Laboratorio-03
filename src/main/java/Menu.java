import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public void desplegarMenu(){
        System.out.println("--------------------MENU--------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Mostrar Jugadores");
        System.out.println("2. Editar jugadores");
        System.out.println("3.Salir");
    }

    public void menuSecundario(){
        System.out.println("Elija accion a realizar:");
        System.out.println("1. Agregar nuevo Jugador");
        System.out.println("2. Eliminar jugador existente");
        System.out.println("3. Volver al menu anterior");
    }

    public int menu(){
        int opcion;
        Equipo equipo = new Equipo("Ufro FC");
        do{
            opcion= ingresar();
            switch (opcion) {
                case 1 -> equipo.mostrarJugadore();
                case 2 -> equipo.llenarEquipo();
                case 3 -> {
                    opcion = 3;
                    System.out.println("Programa Finalizado");
                }
                default -> mostrarError();
            }
        }while(opcion!=3);
        return opcion;
    }

    public static int ingresar() {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                mostrarError();
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }

    public static void mostrarError() {
        System.err.println("Opción inválida");
        System.err.println("Ingrese un número válido");
    }
}
