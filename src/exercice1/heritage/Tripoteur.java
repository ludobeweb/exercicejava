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
    
    public String prenom = "";
    public void tripote(Animal animal){
        this.prenom = "Francois";
        System.out.println(this.getClass().getDeclaredMethods()
        [0].getName() + " " + animal.getClass().getSimpleName());
        animal.emettreSon();
        System.out.println(prenom + "Force "
        + animal.getClass().getSimpleName());
        animal.son = "hurle";
    }
}
