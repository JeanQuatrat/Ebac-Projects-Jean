public class App {
    public static void main(String[] args) throws Exception {

        int NotaMat = 5;
        int NotaHist = 8;
        int NotaPort = 9;
        int NotaArt = 10;

        int NotaMedia = (5 + 8 + 9 + 10)/4;
        //Retirei as acentuações por questão de embelezamento no terminal.
        System.out.format("Juntando as notas de Matematica %d, Historia %d, Portugues %d e Artes %d. Sua media final e de %d.", NotaMat, NotaHist, NotaPort, NotaArt, NotaMedia);
        
    }
}
