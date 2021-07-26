import java.util.ArrayList;
import java.util. List;
public class Metflix {

    //atributos
    public List <Pelicula> peliculas =new ArrayList <>();
    public List <Serie> series =new ArrayList <>();

    public void inicializarCatalogo(){

        Pelicula titanic;
        titanic = new Pelicula();
        titanic.nombre = "Titanic";
        titanic.añoLanzamiento= 1997;
        titanic.duracion = 210;
        Actor actor = new Actor();
        actor.nombre = " Leo di Caprio";
        titanic.actores.add (actor);
        this.peliculas. add (titanic);

        
        Pelicula batman = new Pelicula(); //otra forma de declarar e instanciar
        batman.nombre ="Batman, el caballero de la noche";
        batman.añoLanzamiento=2008;
        batman.duracion= 152;
        actor = new Actor();
        actor.nombre = "Christian Bale";
        batman.actores.add (actor);
        this.peliculas. add (batman);


        Serie howIMetYM = new Serie ();
        howIMetYM.nombre = "How I met your mother";
        howIMetYM.añoLanzamiento= 2005;
        actor= new Actor();
        actor.nombre = "Neil Patrick Harris";
        howIMetYM.actores.add(actor);
        
        actor= new Actor();
        actor.nombre = "Cobie Smulder";
        howIMetYM.actores.add(actor);

        Temporada temporada = new Temporada();
        temporada.numero = 5;
        

        Episodio episodio = new Episodio ();
        episodio.nombre= "The last cigarrette";
        episodio.numero= 11;
        temporada.episodios.add (episodio);

        episodio = new Episodio ();
        episodio.nombre= "Definitions";
        episodio.numero= 1;
        temporada.episodios.add (episodio);

        howIMetYM.temporadas. add (temporada);


        temporada = new Temporada();
        temporada.numero = 3;
        episodio = new Episodio ();
        episodio.nombre= "Wait for it";
        episodio.numero= 1;
        temporada.episodios.add (episodio);

        episodio = new Episodio ();
        episodio.nombre= "Little boys";
        episodio.numero= 4;
        temporada.episodios.add (episodio);
        
        howIMetYM.temporadas. add (temporada);
        this.series.add(howIMetYM);

        //Otra serie con 1T y 2 E
        Serie theBigBangTheory= new Serie();
        theBigBangTheory.nombre = "The bigbang Theory";
        theBigBangTheory.añoLanzamiento=2007;

        actor = new Actor();
        actor.nombre = "Kaley Couco";
        theBigBangTheory.actores.add(actor);

        temporada = new Temporada();
        temporada.numero= 1;

        episodio = new Episodio ();
        episodio.nombre= "Pilot";
        episodio.numero=1;
        temporada.episodios.add (episodio);

        episodio = new Episodio ();
        episodio.nombre= "The Cooper-Hofstadter Polarization";
        episodio.numero=9;
        temporada.episodios.add (episodio);

        this.series.add(theBigBangTheory);
        }

//Metodo para buscar serie:
public Serie buscarSerie(String nombreABuscar){

        //vAMOS A USAR EL FOREACH: sirve para recorrel listas
        for (Serie serie:this.series) {
            if (serie.nombre.equals (nombreABuscar))
                return serie;
            
        }
        return null;

        }
    
    

  
    }






