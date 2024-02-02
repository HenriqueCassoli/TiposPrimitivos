/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Pessoal
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome= teclado.nextLine();
        System.out.print("Digite sua idade: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f \n",nome ,nota);
        System.out.format("A nota de %s é %.5f \n",nome ,nota);
    }
}
