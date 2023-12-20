public class App {
    public static void main(String[] args) throws Exception {
        //Uzumaki, Junji ito, 1 vol, 668 pags
        //instanciando objeto
        Manga manga1 = new Manga() ;
            manga1.Nome = "Uzumaki";
            manga1.Autor = "Junji Ito";
            manga1.Paginas = 668;
            manga1.Volumes = 1;

        System.out.format("O manga %s, escrito e ilustrado pelo autor %s, tem %d paginas, e %d volume.", manga1.Nome, manga1.Autor, manga1.Paginas, manga1.Volumes);
    }
    
}
