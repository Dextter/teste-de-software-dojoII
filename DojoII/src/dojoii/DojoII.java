/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojoii;

import java.util.Random;

/**
 *
 * @author 20152014040023
 */
public class DojoII {

    private String entrada;
    private int tamanho;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    //---------------------------TRATAMENTO DE ENTRADA--------------------------
    //
    public void isString(String[] entrada){
        for(String caractere: entrada){
            if (caractere instanceof String){
                continue;
            } else {
                excecaoEntradaInvalida();
            }
        }
    }

    //Retorna o ultimo caractere corrente
    public String getLast(String[] entrada){
        int ultimo = 0;
        for(int i = 0; i < entrada.length; i++){
            ultimo = i;
        }
        return entrada[ultimo];
    }
    
    //---------------------------EXCEÇÕES---------------------------------------
    //Mensagem para entrada de dados com tipo diferente de String
    public void excecaoEntradaInvalida(){
        System.out.println("A entrada não é válida, insira caracteres de texto.");
    }
    
    //Exceção para o caso de mensagem que exceda 255 caracteres
    public void excecaoLimiteCaracteres(){
        System.out.println("A entrada não é válida, o texto não pode exceder "
                         + "255 caracteres.");
    }
    
    //---------------------------MISCELANEOUS-----------------------------------    
    //Teste com uma palavra de tamanho indefinido que pode ser usada com tamanho 
    //maior que 255 para lançar exceção de tamanho excedido
    public void palavraTesteTamanho(int tamanho){
        String[] textoTexte = null;
        for (int i = 0; i < tamanho; i++){
            textoTexte[i] = "a";
        }
    }
}
