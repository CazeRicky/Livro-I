public class Personagem {
    String nome;
    int coragem;

    public Personagem (String nome, int coragem){
        this.nome = nome;
        this.coragem = coragem;
    }

    void atualizarCoragem(int incremento){
        if(incremento != 0){
            this.coragem += incremento;
            System.out.println("Mediante a isso a coragem de " + nome + " foi atualizada para " + coragem);
        }
    }
}
