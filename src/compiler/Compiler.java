/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import analizadores.AnalisadorLexico;
import static analizadores.AnalisadorLexico.preencherArrayPalavrasReservadas;
import static analizadores.AnalisadorLexico.i;
import tokens.Out;

/**
 *
 * @author Dell-User
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Palavras resevadas
        preencherArrayPalavrasReservadas();

        try {

            AnalisadorLexico sc = new AnalisadorLexico("./input.txt");



           Out token = new Out();

           
            do {
                token = sc.nextToken();
                if (token != null) {
                    System.out.println("Token: " + token.getToken() + " , Lexema: " + token.getLexema() + " , Linha: " + token.getLinha());

                }
            } while (token != null);

            i = 0;

        } catch (Exception ex) {
        }
    }

}
