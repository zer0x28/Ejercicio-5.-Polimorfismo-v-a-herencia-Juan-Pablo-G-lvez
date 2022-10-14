

public class Pasador extends Jugador {
    
    private int pases;
    private int fintas;

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getFintas() {
        return fintas;
    }

    public void setFintas(int fintas) {
        this.fintas = fintas;
    }

    public Pasador(String nombre, String pais, int errores, int aces, int servicios, int pases, int fintas) {
        super(nombre, pais, errores, aces, servicios);
        this.pases = pases;
        this.fintas = fintas;
    }

    public Pasador (){
        super();
        pases = 0;
        fintas = 0;
    }

    public double calcculoPasador (){

        double calcculoPasador = 0;

       calcculoPasador = ((pases+fintas-errores)*100/(pases+fintas+errores))+aces*100/servicios;

        return calcculoPasador;
    }

  




}
