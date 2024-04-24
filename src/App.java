import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Personagem status = new Personagem();
        System.out.println("CAPÍTULO I");
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
        System.out.println("São seu amigo, Eric, mandandom mensagem. Estão chamando você para desopilar um pouco. Distrair e relaxar depois de um dia tão importante.");
        System.out.println("Você está quase chegando em casa e pensa: Eu deveria sair, né? Só se vive uma vez.");
        System.out.println("Mas ao mesmo tempo passa em sua cabeça: Eu vou nada, sou farrapeiro mesmo, vou é dormir.");
        System.out.println("Dentre esse conflito interior, você tem que tomar a decisão ir ou não.");
        System.out.println("Digite IR ou FICAR");
        status.nome2 = "Eric";
        status.coragem2 = 150;

        String escolha = input.nextLine();

        if (escolha.toUpperCase().equals("IR")){

            System.out.println("Você pega seu celular e manda mensagem para seu amigo avisando que irá, só está se arrumando.");
            System.out.println("Seu amigo combina de ir para um parque de diversões, e resolveram ir fantasiados com tema medieval.");
            System.out.println("Ao vasculhar seu guarda roupa você encontra três fantasias sendo elas:");
            System.out.println("Opção 1: Um manto verde de mago, com um chapéu da mesma cor da roupa.");
            System.out.println("Opção 2: Um Vestido rosa, com uma faixa rosa e uma capa roxa.");
            System.out.println("Opção 3: Uma especie colete que se usa por cima de uma camisa e calça verde, e junto com o traje acompanha um arco.");

            int roupa = input.nextInt();

            if (roupa == 1) {
                status.vida = 500;
                status.forca = 50;
                status.coragem1 = 170;
                status.nome1 = "Presto";
                System.out.println("Você será o Presto");
                System.out.println("**Eric, chegou para te buscar**");
                System.out.println("Caraca, caiu bem essa fantasia do Presto em você. Vamos lá!");
                System.out.println("**Vocês sairam da sua casa em direção ao parque**");
                System.out.println("Chegando lá, todo mundo se encontrou e começou a debater sobre qual brinquedo ir primeiro e a decisão ficou em suas mãos:");
                System.out.println("Digite 1 para Montanha Russa. Digite 2 para Roda Gigante.");

                int brinq1 = input.nextInt();

                if (brinq1 == 1) {
                    System.out.println("Uhuu... Vamos lá! Caramba isso me da um nervoso, só de pensar...");
                    System.out.println("**Vocês chegam na montanha russa e ao apertar o sinto já bate um medo em ambos**");
                    System.out.println("Na primeira volta, você se sente muito medo da velocidade. Vocês perdem 20 de coragem.");
                    status.coragem1 -= 20;
                    status.coragem2 -= 20;
                    System.out.println("Sua coragem agora é de: " + status.coragem1 + " e a do Eric é " + status.coragem2);
                }

                else if (brinq1 == 2) {
                    System.out.println("Uhuu... Vamos lá!");
                    System.out.println("**Vocês chegam na Roda Gigante**");
                    System.out.println("Quando chega no ponto alto, vocês se assustam com a altitude. Vocês perdem 10 de coragem.");
                    status.coragem1 -= 10;
                    status.coragem2 -= 10;
                    System.out.println("Sua coragem agora é de: " + status.coragem1 + " e a do Eric é " + status.coragem2);
                }
                
                else{
                    System.out.println("Digite uma opção valida.");
                }
            }

            else if (roupa == 2) {
                status.vida = 600;
                status.forca = 120;
                status.coragem1 = 220;
                status.nome1 = "Sheila";
                System.out.println("Você será a Sheila");
                System.out.println("**Eric chegou para te buscar**");
                System.out.println("Caraca, caiu bem essa fantasia da Sheila em você. Vamos lá!");
                System.out.println("**Vocês sairam da sua casa em direção ao parque**");
                System.out.println("Chegando lá, todo mundo se encontrou e começou a debater sobre qual brinquedo ir primeiro e a decisão ficou em suas mãos:");
                System.out.println("Digite 1 para Montanha Russa. Digite 2 para Roda Gigante.");

                int brinq1 = input.nextInt();

                if (brinq1 == 1) {
                    System.out.println("Uhuu... Vamos lá! Caramba isso me da um nervoso, só de pensar...");
                    System.out.println("**Vocês chegam na montanha russa e ao apertar o sinto já bate um medo em ambos**");
                    System.out.println("Na primeira volta, você se sente muito medo da velocidade. Vocês perdem 20 de coragem.");
                    status.coragem1 -= 20;
                    status.coragem2 -= 20;
                    System.out.println("Sua coragem agora é de: " + status.coragem1 + " e a do Eric é " + status.coragem2);
                }

                else if (brinq1 == 2) {
                    System.out.println("Uhuu... Vamos lá!");
                    System.out.println("**Vocês chegam na Roda Gigante**");
                    System.out.println("Quando chega no ponto alto, seu amigo se assusta com a altitude. Ele perde 10 de coragem.");
                    status.coragem2 -= 10;
                    System.out.println("Sua coragem agora é de: " + status.coragem1 + " e a do Eric é " + status.coragem2);
                }
                
                else{
                    System.out.println("Digite uma opção valida.");
                }

            }

            else if (roupa == 3) {
                status.vida = 700;
                status.forca = 250;
                status.coragem1 = 270;
                status.nome1 = "Hank";
                System.out.println("Você será o Hank");
                System.out.println("**Eric chegou para te buscar**");
                System.out.println("Caraca, caiu bem essa fantasia do Hank em você. Vamos lá!");
                System.out.println("**Vocês sairam da sua casa em direção ao parque**");
                System.out.println("Chegando lá, todo mundo se encontrou e começou a debater sobre qual brinquedo ir primeiro e a decisão ficou em suas mãos:");
                System.out.println("Digite 1 para Montanha Russa. Digite 2 para Roda Gigante.");

                int brinq1 = input.nextInt();

                if (brinq1 == 1) {
                    System.out.println("Uhuu... Vamos lá! Caramba isso me da um nervoso, só de pensar...");
                    System.out.println("**Vocês chegam na montanha russa e ao apertar o sinto já bate um medo em ambos**");
                    System.out.println("Na primeira volta, você se sente muito medo da velocidade. Vocês perdem 20 de coragem.");
                    status.coragem1 -= 20;
                    status.coragem2 -= 20;
                    System.out.println("Sua coragem agora é de: " + status.coragem1 + " e a do Eric é " + status.coragem2);
                }

                else if (brinq1 == 2) {
                    System.out.println("Uhuu... Vamos lá!");
                    System.out.println("**Vocês chegam na Roda Gigante**");
                    System.out.println("Quando chega no ponto alto, seu amigo se assusta com a altitude. Ele perde 10 de coragem.");
                    status.coragem2 -= 10;
                    System.out.println("Sua coragem agora é de: " + status.coragem1 + " e a do Eric é " + status.coragem2);
                }
                
                else{
                    System.out.println("Digite uma opção valida.");
                }
            }
            
            else{
                System.out.println("Digite uma opção valida.");
            }

        }

        else if (escolha.toUpperCase().equals("FICAR")){
            System.out.println("Você chega em casa e vai tomar um banho para relaxar.");
            System.out.println("Após sair do banho você liga sua TV e escolhe algo para assisti.");
            System.out.println("Digite 1 para filme de terror e 2 para serie descontraida.");
            
            int filme = input.nextInt();

                if (filme == 1) {
                    System.out.println("Você chega em casa e vai tomar um banho para relaxar.");
                    System.out.println("Enquanto assiste, resolve pedir um delivery");
                    System.out.println("Quando você menos espera escuta alguem batendo na porta.");
                    System.out.println("Você se assusta e perde 20 de coragem.");

                }
                
                else if (filme == 1) {
                    System.out.println("Você chega em casa e vai tomar um banho para relaxar.");
                    System.out.println("Enquanto assiste, resolve pedir um delivery");
                    System.out.println("Quando você menos espera escuta alguem batendo na porta.");
                }
                
                else{
                    System.out.println("Digite uma opção valida.");
                }
            
            System.out.println("Você pergunta: Quem é?");
            System.out.println("Seu amigo responde: Merda de ficar em casa, bota uma roupa e bora sair");
        }

        else{
            System.out.println("Digite uma opção valida.");
        }

        input.close();
    }
}