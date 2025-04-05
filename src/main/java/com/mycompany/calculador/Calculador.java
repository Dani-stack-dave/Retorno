/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculador;

import javax.swing.JOptionPane;

/**
 *
 * @author SAM
 */
public class Calculador {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero2: "));
        
       Operaciones op=new Operaciones();
       op.sumar(n1, n2);
       op.restar(n1, n2);
       op.multiplicar(n1, n2);
       op.dividir(n1, n2);
       op.mostrarResultados();
    }
}
