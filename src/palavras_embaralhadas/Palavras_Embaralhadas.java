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
        Scanner in = new Scanner(System.in);
        BancoDePalavras teste = new BancoDePalavras();
        FabricaEmbaralhadores embaralha = new FabricaEmbaralhadores();
        System.out.println(embaralha.embaralhaDificil(teste.retornaPalavra()));
    }
    
}
