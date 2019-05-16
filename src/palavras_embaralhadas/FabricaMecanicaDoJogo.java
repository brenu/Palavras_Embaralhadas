/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palavras_embaralhadas;

import java.util.*;
/**
 *
 * @author brenu
 */
public class FabricaMecanicaDoJogo implements MecanicaDoJogo{
    private int erros;
    private int acertos;
    private String original;
    private String embaralhado;
    
    public FabricaMecanicaDoJogo(){
    this.erros = 0;
    this.acertos = 0;
    this.original = null;
    this.embaralhado = null;
}

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getEmbaralhado() {
        return embaralhado;
    }

    public void setEmbaralhado(String embaralhado) {
        this.embaralhado = embaralhado;
    }
    
    

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    
    
    
    @Override
    public boolean testaPalavra(String original, String entrada) {
        if(original.equals(entrada))
            return true;
        else
            return false;
    }

    @Override
    public int verificaDificuldade() {
        Random r = new Random();
        int aleatorio = r.nextInt(3);
        return aleatorio;
        
    }

    @Override
    public void novaPalavra() {
        BancoDePalavras banco = new BancoDePalavras();
        FabricaEmbaralhadores embaralhar = new FabricaEmbaralhadores();
        this.original = banco.retornaPalavra();
        int dificuldade = verificaDificuldade();
        switch(dificuldade){
            case 1:
                this.embaralhado = embaralhar.embaralhaFacil(original);
                break;
            case (2):
                this.embaralhado = embaralhar.embaralhaMedio(original);
                break;
            case (3):
                this.embaralhado = embaralhar.embaralhaDificil(original);
                break;
        }
    }

    @Override
    public void novoJogo() {
        Scanner in = new Scanner(System.in);
        do{
        while(this.embaralhado == null){
        this.novaPalavra();
        if(this.embaralhado != null){
        System.out.println("A palavra é: " + this.embaralhado);
        System.out.println("Sua resposta é: ");
        String entrada = in.next();
            System.out.println(entrada.equals(original));
        if(this.testaPalavra(original, entrada)){
            this.setAcertos(this.getAcertos()+1);
        }else{
            this.setErros(this.getErros()+1);
        }
        }}
        this.embaralhado = null;
        }while(this.getErros()<3);
        System.out.println("Fim de jogo :(");
        System.out.println("Você teve "+this.getAcertos()+" acertos");
    }
    //Use um switch + variável random pra escolher de forma aleatória
                                //o embaralhamento da próxima palavra
}
