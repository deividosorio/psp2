/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp2.vista;

import edu.uniandes.ecos.psp2.modelo.Calculator;

/**
 * Clase que representa la vista por consola del aplicativo con los test definidos
 * @author deividosorio
 * @version 25/02/2015
 */
public class MainConsole {

    public static void main(String[] args) {

        Calculator test1 = new Calculator(1.1, 9);
        Calculator test2 = new Calculator(1.1812, 10);
        Calculator test3 = new Calculator(2.750, 30);
        
        System.out.println("Valor P con test1, x: 0 to 1.1 y dof: 9  " +
                test1.getP());
                
        System.out.println("Valor P con test2, x: 0 to 1.1812 y dof: 10  " +
                test2.getP());
        
        System.out.println("Valor P con test3, x: 0 to 2.750 y dof: 30  " +
                test3.getP());
    }
}
