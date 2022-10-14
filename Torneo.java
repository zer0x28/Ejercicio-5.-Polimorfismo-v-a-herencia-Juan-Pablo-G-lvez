import java.util.*;

public class Torneo {
    
    ArrayList <Jugador> jugadores;
    public Torneo (){
        this.jugadores = new ArrayList<Jugador>();
    }

    public void crearLibero (String nombre, String pais, int errores, int aces, int recibosEfectivos, int servicios){
        Libero Nlibero = new Libero(nombre, pais, errores, aces, recibosEfectivos, servicios);
        jugadores.add(Nlibero);
    }

    public void crearPasador (String nombre, String pais, int errores, int aces, int servicios, int pases, int fintas){
        Libero Npasador = new Libero(nombre, pais, errores, aces, servicios, pases, fintas);
        jugadores.add(Npasador);
    }

    public void crearOpuesto (String nombre, String pais, int errores, int aces, int bloqueosEfectivos, int bloqueosFallidos, int servicios, int ataques){
        Libero Nopuesto = new Libero(nombre, pais, errores, aces, servicios, bloqueosEfectivos, bloqueosFallidos,servicios, ataques);
        jugadores.add(Nopuesto);
    }

   public  toplibero (){
        for (Jugador j : jugadores){
            if ( j instanceof Libero){
                System.out.println(j);
            }
        }
   }

   public String inscritos (){
    for (Jugador j: jugadores){
        System.out.println(j.toString());
    }
    
    return j.toString;
   }


}
