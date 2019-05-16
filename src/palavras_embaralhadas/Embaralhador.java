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
public interface Embaralhador {

    public abstract String embaralhaFacil(String palavra);
    public abstract String embaralhaMedio(String palavra);
    public abstract String embaralhaDificil(String palavra);
}
