import java.util.Scanner;

public class Capitulo {
    Personagem Eric;
    Personagem Jordan;
    String texto;
    String Capitulo;
    String escolha1;
    String escolha2;
    int coragem;
    Scanner input;

    public Capitulo(Personagem Eric, Personagem Jordan, String texto, String Capitulo, String escolha1, String escolha2, int coragem, Scanner input){
        this.Eric = Eric;
        this.Jordan = Jordan;
        this.texto = texto;
        this.Capitulo = Capitulo;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.coragem = coragem;
        this.input = input;
    }


    void mostrar() {
        System.out.println(texto);
        System.out.println(escolha1);
        System.out.println(escolha2);
    }
    
    String escolher(){
        String escolha = input.nextLine();
        return escolha;
    }
}



