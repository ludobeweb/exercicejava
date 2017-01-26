/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1;

import exercice1.core.Application;
import exercice1.recursivite.suites.fibonacci.SuiteFibo;

/**
 *
 * @author ludovic-castro
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Application exo1 = new SuiteFibo();
       exo1.start();
    }
    
}
