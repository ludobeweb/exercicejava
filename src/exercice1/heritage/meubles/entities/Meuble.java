/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1.heritage.meubles.entities;

/**
 *
 * @author ludovic-castro
 */
public abstract class Meuble  {
    public String nom = "";
    public void getNom(){
        System.out.println("la " + this.getClass().getSimpleName() + " s'appelle : " + nom);
    }
}
