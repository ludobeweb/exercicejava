/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1.recursivite.suites.entier;

import exercice1.core.Application;
import exercice1.recursivite.suites.interfaces.RecursiviteInterface;

/**
 *
 * @author ludovic-castro
 */
public class  SuiteEntier extends Application implements RecursiviteInterface {

    @Override
    public void start() {
        suite(0);
    }
    

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int max = 300;
    @Override
    public int suite(int n) {
    //
        max--;
        System.out.println(n);
        if (max > 0){
            suite(n+1);
        }
        return 0;
    
    }
    
   
}
