import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo a uma historia única e épica.");
        System.out.println("Peço a você que seja sábio em suas escolhas, pois é você quem trilha seu caminho...");
        System.out.println("Aproveite cada momento hoje, pois ninnguem sabe do amanhã...");
        System.out.println("Preparado para começar?");
        System.out.println("Lá vamos nós...");
        System.out.println("...");
        System.out.println("Hoje ocorreu o último dia de vestibular, depois de passar anos estudando e se preparando, você finalmente fez e está saindo do prédio onde foi realizado a prova.");
        System.out.println("Imagina tamanho estresse e pressão que você teve que lidar hoje.");
        System.out.println("Ao sair local, já está de tardezinha, quase de noite. Você liga seu celular e caminha em direção a sua casa.");
        System.out.println("Derrepente seu celular vibra *vrum* *vrum*");
        System.out.println("São seus amigos mandandom mensagem. Estão chamando você para desopilar um pouco. Distrair e relaxar depois de um dia tão importante.");
        System.out.println("Você está quase chegando em casa e pensa: Eu deveria sair, né? Só se vive uma vez.");
        System.out.println("Mas ao mesmo tempo passa em sua cabeça: Eu vou nada, sou farrapeiro mesmo, vou é dormir.");
        System.out.println("Dentre esse conflito interior, você tem que tomar a decisão ir ou não.");
        System.out.println("Digite 1 para IR ou 2 para FICAR");

        int escolha = input.nextInt();

        if (escolha == 1){

            System.out.println("Você pega seu celular e manda mensagem para seus amigos avisando que irá, só está se arrumando.");
            System.out.println("Seus amigos combinam de ir para um parque de diversões, e resolveram ir fantasiados com tema medieval.");
            System.out.println("Ao vasculhar seu guarda roupa você encontra três fantasias sendo elas:");
            System.out.println("Opção 1: Um manto verde de mago, com um chapéu da mesma cor da roupa.");
            System.out.println("Opção 2: Um Vestido rosa, com uma faixa rosa e uma capa roxa.");
            System.out.println("Opção 3: Uma especie colete que se usa por cima de uma camisa e calça verde, e junto com o traje acompanha um arco.");


            int roupa = input.nextInt();

            if (roupa == 1) {
                System.out.println("Você será o Presto");
                System.out.println("**Seu amigo chegou para te buscar**");
                System.out.println("Caraca, caiu bem essa fantasia do Presto em você. Vamos lá, o resto do pessoal só está nos esperando.");
            }

            else if (roupa == 2) {
                System.out.println("Você será a Sheila");
                System.out.println("**Seu amigo chegou para te buscar**");
                System.out.println("Caraca, caiu bem essa fantasia da Sheila em você. Vamos lá, o resto do pessoal só está nos esperando.");
            }

            else if (roupa == 3) {
                System.out.println("Você será o Hank");
                System.out.println("**Seu amigo chegou para te buscar**");
                System.out.println("Caraca, caiu bem essa fantasia do Hank em você. Vamos lá, o resto do pessoal só está nos esperando.");
            }
            
            else{
                System.out.println("Digite uma opção valida.");
            }

        }

        else if (escolha == 2){
            System.out.println("Você chega em casa e vai tomar um banho para relaxar.");
            System.out.println("Após sair do banho você liga sua TV e coloca sua serie favorita.");
            System.out.println("Enquanto assiste, resolve pedir um delivery");
            System.out.println("Quando você menos espera escuta alguem batendo na porta.");
            System.out.println("Você pergunta: Quem é?");
            System.out.println("Seu amigo responde: Merda de ficar em casa, bota uma roupa e bora sair");
        }

        else {
            System.out.println("Digite uma opção valida.");
        }

        input.close();
    }
}
