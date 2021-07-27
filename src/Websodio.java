public class Websodio extends Episodio{
    public String link;

    @Override
    public void reproducir(){

        System.out.println( "reproduciendo websodio del link" + this.link);
    }
}
