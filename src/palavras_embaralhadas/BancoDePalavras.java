/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavras_embaralhadas;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author brenu
 */
public class BancoDePalavras{
    public String retornaPalavra(){
    File palavras = new File("palavras.txt");
    try{
    int i;
    BufferedReader in = new BufferedReader(new FileReader(palavras));
    String linha = null;
    Random aleatorio = new Random();
    int numeroLinha = aleatorio.nextInt(50);
    for(i=0;i<=numeroLinha;i++){
        linha = in.readLine();
        if(i==numeroLinha){
            System.out.println(linha);
            return linha;
        }
    }
    }
    catch(Exception ex){
            System.out.println(ex);
    }
    return null;
  }
}
