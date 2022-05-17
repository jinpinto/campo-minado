/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author aluno.cyber
 */
public class Campo {
    Mina minas[][];
    Random r = new Random();
    public Campo(int x, int y) {
        //this.minas = minas;
       minas = new Mina[x][y];
    }
       
    public void povoarMatriz(){
        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas[i].length; j++) {
                minas[i][j] = new Mina(r.nextBoolean());
            }
        }
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas[i].length; j++) {
                System.out.print("|");
                if (minas[i][j].isTembomba() == true) {
                    System.out.print("B");
                } else {
                    System.out.print("S");
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    
    public int calcMinasProximas(Mina minas[]){
        int cont =0;
        for (int i = 0; i < 10; i++) {
            if(minas[i].isTembomba() == true){
                cont++;
            }
        }
        return cont;
    }
    
    public void minasProximas(){
        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas[i].length; j++) {
                minas[i][j].setBombasproximas(i);
                
            }
        }
    }
}
