/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Axioo
 */
public class PersegiPanjang implements BangunDatar {
    private final int panjang;
    private final int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double luas() {
        return panjang * lebar;
    }
} 
