/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.bak.tp1;

/**
 *
 * @author tbak01
 */
public class Vecteur2D extends Noeud {
    
    private double vx;
    private double vy ;
    
    public Vecteur2D (double px, double py) {
        this.vx = vx;
        this.vy = vy;
    }
    
    public Vecteur2D() {
        this(0,0) ;
    }
    
    public double getVx() {
        return vx;
    }
    
    public void setVx(double vx) {
        this.vx = vx;
    }
    
    public double getVy () {
        return vy;
    }
    
    public void setVy(double vy) {
        this.vy = vy;
    }
    
    @Override
    public String toString() {
        return "(" + vx + "," + vy + ")" ;
    }
    }

     

