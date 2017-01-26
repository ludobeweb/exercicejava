/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1.heritage;

import exercice1.core.Application;
import exercice1.heritage.animaux.entities.Animal;
import exercice1.heritage.animaux.entities.impl.Chat;
import exercice1.heritage.animaux.entities.impl.Chien;
import exercice1.heritage.meubles.entities.Meuble;
import exercice1.heritage.meubles.entities.impl.Table;

/**
 *
 * @author ludovic-castro
 */
public class Heritage extends Application {

    @Override
    public void start() {
        Animal chien = new Chien();
        Animal chat = new Chat();
        chien.emettreSon();
        chat.emettreSon();
        Meuble table = new Table();
        table.getNom();
        
        
        chat.emettreSon();
        chien.emettreSon();
        Tripoteur Francois = new Tripoteur();
        Francois.tripote(chat);
        chat.emettreSon();
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
