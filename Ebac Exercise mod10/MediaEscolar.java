import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) throws Exception {

        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite Nota de Matemática");
        int NotaMat = x.nextInt();
        System.out.println("Digite Nota de História");
        int NotaHist = x.nextInt();
        System.out.println("Digite Nota de Português");
        int NotaPort = x.nextInt();
        System.out.println("Digite Nota de Artes");
        int NotaArt = x.nextInt();
        int NotaMedia = (NotaMat + NotaHist + NotaPort + NotaArt)/4;

        //Retirei as acentuações por questão de embelezamento no terminal.
        System.out.format("Juntando as notas de Matematica %d, Historia %d, Portugues %d e Artes %d. Sua media final e de %d.\n", NotaMat, NotaHist, NotaPort, NotaArt, NotaMedia);
        
     if (NotaMedia >= 7) {
            System.out.println("Voce esta aprovado.");
        }if (NotaMedia >= 5) {
            System.out.println("Voce esta em recuperacao");
        } if (NotaMedia < 5) {
                System.out.println("Voce esta reprovado.");
        }
       }
    }
