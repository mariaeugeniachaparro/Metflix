public class App {
    public static void main(String[] args) throws Exception {
        //a partir de metflix buscar la T5E1 de HIMYM y reproducir el episodio
        //Reproducir es un método, no es un objeto
        Metflix miMetflix = new Metflix ();

        System.out.println("inicializando catálogo de Metflix");

        miMetflix.inicializarCatalogo();//Estoy llamando al método q crea las pelis y las series

        Serie serieBuscada  = miMetflix.buscarSerie ("How I met your mother");
        if (serieBuscada ==null){
            System.out.println(" Serie no existe");
            return;
        }
    Temporada temporada = serieBuscada.buscarTemporada (5);
    Episodio episodio = temporada.buscarEpisodio(35);

    episodio.reproducir();



    }
}
