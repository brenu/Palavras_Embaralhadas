/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavras_embaralhadas;

import java.util.Arrays;
import java.util.*;
/**
 *
 * @author brenu
 */
public class FabricaEmbaralhadores implements Embaralhador{

    @Override
    public String embaralhaFacil(String palavra) {
        char[] trocado = palavra.toCharArray();
        for(int i=0;i<trocado.length;i++){
            int aux = i;
            while(i<trocado.length && trocado[i]!= ' '){
                i++;
            }
            char temp = trocado[aux];
            trocado[aux] = trocado[i-1];
            trocado[i-1] = temp;
        }
        return new String(trocado);
    }

    @Override
    public String embaralhaMedio(String palavra) {
        StringBuilder reverter = new StringBuilder();
        reverter.append(palavra);
        reverter = reverter.reverse();
        return reverter.toString();
    }
    @Override
    public String embaralhaDificil(String palavra) {
        List<String> embaralhando = Arrays.asList(palavra.split(""));
        Collections.shuffle(embaralhando);
        StringBuilder resultado = new StringBuilder();
        for(String temp : embaralhando){
            resultado.append(temp);
        }
        return resultado.toString();
    }
    
}
