import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Personagem Jordan = new Personagem("Jordan", 200);
        Personagem Eric  = new Personagem("Eric", 150);
  
        
        Capitulo Capitulo1 = new Capitulo(Eric, Jordan, "CAPÍTULO I. Olá, seja bem vindo a uma historia única e épica. Peço a você que seja sábio em suas escolhas, pois é você quem trilha seu caminho... Aproveite cada momento hoje, pois ninnguem sabe do amanhã... Preparado para começar? Lá vamos nós... ... Seu nome é Jordan Hoje ocorreu o último dia de vestibular, depois de passar anos estudando e se preparando, você finalmente fez e está saindo do prédio onde foi realizado a prova. Imagina tamanho estresse e pressão que você teve que lidar hoje. Ao sair local, já está de tardezinha, quase de noite. Você liga seu celular e caminha em direção a sua casa. Derrepente seu celular vibra *vrum* *vrum*  É seu amigo, Eric, mandando mensagem. Estão chamando você para desopilar um pouco. Distrair e relaxar depois de um dia tão importante. Você está quase chegando em casa e pensa: Eu deveria sair, né? Só se vive uma vez. Você está quase chegando em casa e pensa: Eu deveria sair, né? Só se vive uma vez. Mas ao mesmo tempo passa em sua cabeça: Eu vou nada, sou farrapeiro mesmo, vou é dormir. Dentre esse conflito interior, você tem que tomar a decisão ir ou não. Digite 1 para IR ou Digite 2 para FICAR", "Capitulo 1", "1", "2", 200, input);
        Capitulo Capitulo2 = new Capitulo(Eric, Jordan, "Você pega seu celular e manda mensagem para seu amigo avisando que irá, só está se arrumando. / Seu amigo combina de ir para um parque de diversões, e resolveram ir fantasiados com tema medieval. / Ao vasculhar seu guarda roupa você encontra duas fantasias sendo elas: / Opção 1: Um manto verde de mago, com um chapéu da mesma cor da roupa. / Opção 2: Um Vestido rosa, com uma faixa rosa e uma capa roxa.", "Capitulo2", "1", "2", 200, input);
        Capitulo Capitulo3 = new Capitulo(Eric, Jordan, "Você será o Presto. / **Eric, chegou para te buscar** / Caraca, caiu bem essa fantasia do Presto em você. Vamos lá, Jordan! / **Vocês sairam da sua casa em direção ao parque** / Chegando lá, todo mundo se encontrou e começou a debater sobre qual brinquedo ir primeiro e a decisão ficou em suas mãos: / Digite 1 para Montanha Russa. Digite 2 para Roda Gigante.", "Capitulo 3", "1", "2", 100, input);
        Capitulo Capitulo4 = new Capitulo(Eric, Jordan, "Uhuu... Vamos lá! Caramba isso me da um nervoso, só de pensar... / **Vocês chegam na Roda Gigante** / Na primeira volta, você se sente muito medo da velocidade. Vocês perdem 20 de coragem.", "Capitulo 4", null, null, 180, input);
        Capitulo Capitulo5 = new Capitulo(Eric, Jordan, "Uhuu... Vamos lá! / **Vocês chegam na Roda Gigante** / Quando chega no ponto alto, vocês se assustam com a altitude. Vocês perdem 10 de coragem. ", "Capitulo 5", null, null, 190, input);
        Capitulo Capitulo6 = new Capitulo(Eric, Jordan, "Você será a Sheila / **Eric, chegou para te buscar** / Caraca, caiu bem essa fantasia do Presto em você. Vamos lá, Jordan! / **Vocês sairam da sua casa em direção ao parque** / Chegando lá, todo mundo se encontrou e começou a debater sobre qual brinquedo ir primeiro e a decisão ficou em suas mãos: / Digite 1 para Montanha Russa. Digite 2 para Roda Gigante.", "Capitulo 3", "1", "2", 100, input);
        Capitulo Capitulo7 = new Capitulo(Eric, Jordan, "null", "Capitulo 7", null, null, 0, input);

        Capitulo1.mostrar();
        String escolher = Capitulo1.escolher();
            if (escolher .equals(Capitulo1.escolha1)) {
                Capitulo2.mostrar();
                String escolha2 = Capitulo2.escolher();
                if (escolha2 .equals(Capitulo2.escolha1)) {
                    Capitulo3.mostrar();
                    String escolha3 = Capitulo3.escolher();
                    if(escolha3 .equals(Capitulo3.escolha1)){
                        Capitulo4.mostrar();
                        Eric.atualizarCoragem(-20);
                        Jordan.atualizarCoragem(-20);
                    }
                    else if(escolha3 .equals(Capitulo3.escolha2)){
                        Capitulo5.mostrar();
                        Eric.atualizarCoragem(-10);
                        Jordan.atualizarCoragem(-10);
                    }
                else if (escolha2 .equals(Capitulo2.escolha2)){
                    Capitulo6.mostrar();
                }
                }
            }
            else if (escolher .equals(Capitulo1.escolha2)){
                Capitulo7.mostrar();
            }
        input.close();
    }
}