/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1.heritage;

import exercice1.heritage.animaux.entities.Animal;

/**
 *
 * @author ludovic-castro
 */
public class Tripoteur {
    
    
    public void tripote(Tripotable a){
        
        System.out.println(this.getClass().getSimpleName() + " " + 
                this.getClass().getDeclaredMethods()[0].getName() + " "
        + a.getClass().getSimpleName());
        if (a instanceof Animal){
            ((Animal)a).emettreSon();
        }
    }
}
