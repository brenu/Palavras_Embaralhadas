/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavras_embaralhadas;

/**
 *
 * @author brenu
 */
public interface MecanicaDoJogo {
    public abstract boolean testaPalavra(String original, String entrada);
    public abstract int verificaDificuldade();
    public abstract void novaPalavra();
    public abstract void novoJogo();
    
}
