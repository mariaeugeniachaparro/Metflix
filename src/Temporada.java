import java.util.ArrayList;
import java.util.List;


public class Temporada {
    public int numero;
    public String nombre; //esto es el nombre de la temporada
    public List<Episodio>episodios = new ArrayList <>();

    //declaramos el metodo 
    public Episodio buscarEpisodio (int numeroEpisodio){
        for (Episodio episodio:this.episodios){
            if (episodio.numero == numeroEpisodio)
                return episodio;
    }
        return null;
    }
}


 