/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.bak.tp1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tbak01
 */
public abstract class Noeud {
    
    private double px;
    private double py;
    private int id;
    private double vx;
    private double vy;
    
    
    private Noeud (double px, double py) {
        this.px = px;
        this.py = py;
    }
    
    public Noeud (int id ) {
        id =-1;
    }
    public Noeud () {
            this(0,0) ;
    }
   
    public double getPx() {
        return px;
    }
    
    public void setPx(double px) {
        this.px = px;
    }
    
    public double getPy() {
        return py;
    }
    
    public void setPy (double py){
        this.py= py ;
    }
    
    @Override
    public String toString() {
        return "(" + px + "," + py + ")" ;
    }
    
    public class barresDepart {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
}
}
    
    public class barresArrivee {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
    }
    }
}
