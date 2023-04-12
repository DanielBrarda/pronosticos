package pronosticosDeportivos;
import java.util.Scanner;
public class pronosticos {

	public static void main(String[] args) {
	
// ACA VAN LOS ATRIBUTOS
        Scanner scanner = new Scanner(System.in);
        String equipo1, equipo2;
        int golesEquipo1 = 0, golesEquipo2 = 0;
        double pronosticoJugador1 = 0, pronosticoJugador2 = 0;
        int ganador = 0;  
        // 0 si es EMPATE, 1 si GANA equipo1, 2 si GANA equipo2
		        
// ACA SE PIDEN LOS NOMBRES DE LOS EQUIPOS
        System.out.print("Coloca el nombre del EQUIPO 1: ");
        equipo1 = scanner.nextLine();
        System.out.print("Ahora el nombre del EQUIPO 2: ");
        equipo2 = scanner.nextLine();
		        
// ACA SE PIDEN LOS GOLES DE CADA EQUIPO
        System.out.print("Cuantos goles hizo " + equipo1 + ": ");
        golesEquipo1 = scanner.nextInt();
        System.out.print("Cuantos goles hizo " + equipo2 + ": ");
        golesEquipo2 = scanner.nextInt();
		        
// ACA SABEMOS QUIEN GANA
        if (golesEquipo1 > golesEquipo2) {
           ganador = 1;
        } else if (golesEquipo1 < golesEquipo2) {
           ganador = 2;
        }
		        
// ACA SE PIDEN LAS APUESTAS DE LOS JUGADORES 1 Y 2
        System.out.print("Para el jugador 1, quien gana el partido: ");
        pronosticoJugador1 = scanner.nextDouble();
        System.out.print("Para el jugador 2 quien es el ganador: ");
        pronosticoJugador2 = scanner.nextDouble();
		        
// ACA HACEMOS EL CALCULO DEL RESULTADO DE LAS APUESTAS
        if (ganador == 0) {
           System.out.println("El partido terminó en empate.");
           System.out.println("El jugador 1 gana 1 punto");
           System.out.println("El jugador 2 gana 1 punto");
        } else if (ganador == 1) {
           System.out.println("El ganador es " + equipo1);
           System.out.println("El jugador 1 gana 1 punto");
           System.out.println("El jugador 2 no obtiene punto");
        } else if (ganador == 2) {
           System.out.println("El ganador es " + equipo2);
           System.out.println("El jugador 2 gana 1 punto");
           System.out.println("El jugador 1 no obtiene punto");
        }
		        
        scanner.close();
	    }
}
