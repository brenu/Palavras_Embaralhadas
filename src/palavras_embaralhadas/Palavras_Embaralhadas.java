/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavras_embaralhadas;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author brenu
 */
public class Palavras_Embaralhadas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException{
        LimpaTela limpador = new LimpaTela();
        Scanner in = new Scanner(System.in);
        String resposta;
        BancoDePalavras teste = new BancoDePalavras();
        FabricaEmbaralhadores embaralha = new FabricaEmbaralhadores();
        FabricaMecanicaDoJogo game = new FabricaMecanicaDoJogo();
        System.out.println("-----Bem-vindo ao jogo Palavras Embaralhadas!-----");
        System.out.println("• Lhe serão mostradas palavras com as letras trocadas;");
        System.out.println("• Você deve inserir o que acredita ser a palavra certa;");
        System.out.println("• Sempre que der uma resposta, você receberá uma nova palavra;");
        System.out.println("• Você pode errar até três vezes. Após isso, perdeu;");
        System.out.println("• No fim do jogo, serão contados os seus acertos.");
        System.out.println("Deseja iniciar uma nova partida?");
        resposta = in.next();
        do{
            limpador.limparTela();
        switch(resposta){
            case "y":
            game.novoJogo();
            break;
            case "Y":
            game.novoJogo();
            break;    
        }
        System.out.println("Digite y caso queira jogar uma nova partida: ");
        resposta = in.next();
        }while(resposta.equals("y") || resposta.equals("Y"));
                for(int i=0;i<3;i++){
                    System.out.println("\n");
                }
                System.out.println("---------------------------------");
                System.out.println("----------Encerrando...----------");
    }
    
}
