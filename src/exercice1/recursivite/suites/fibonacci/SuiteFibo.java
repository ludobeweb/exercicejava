/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice1.recursivite.suites.fibonacci;

import exercice1.core.Application;
import exercice1.recursivite.suites.interfaces.RecursiviteInterface;

/**
 *
 * @author ludovic-castro
 */
public class SuiteFibo extends Application implements RecursiviteInterface {

    @Override
    public void start() {
        suite(1);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet.");
     }
    public int max = 23;
    public int prc = 0;
    @Override
    public int suite(int n) {
        max--;
        System.out.println(prc);
        
    
    
        if (max > 0){
            int temp = n + prc; // temp correspond a n
        prc = n;
            suite(temp);
        }
        return 0;
    }
    
} 
