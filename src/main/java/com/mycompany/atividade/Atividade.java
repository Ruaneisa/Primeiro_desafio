/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author ruane
 */
public class Atividade {

    public static void main(String[] args) {
        int condicao = 0;
        
        Scanner novoScanner = new Scanner(System.in);
        Estoque novoGalao = new Estoque();
        
        String menu = """
                      \n***Conversão de galão para litros:
                      1 - Conversor: 
                      2 - Encerrar
                      """;
        
        
        while (condicao != 2){
            System.out.println(menu);
            System.out.println("Escolha uma opção:");
            condicao = novoScanner.nextInt();
            if (condicao == 1){
                System.out.println("Quantidade de galões: ");
                novoGalao.litro(novoScanner.nextDouble());
            }
            
        }
        
    }
}
