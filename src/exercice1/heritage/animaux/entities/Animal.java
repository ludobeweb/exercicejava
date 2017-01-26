/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1.heritage.animaux.entities;

import exercice1.heritage.Tripotable;

/**
 *
 * @author ludovic-castroexercice1.core.
 */
public abstract class Animal implements Tripotable {
   public String son = "";
    public void emettreSon(){
        System.out.println("le " + this.getClass().getSimpleName() +" " + son);
    }
}
