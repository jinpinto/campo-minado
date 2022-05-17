/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author aluno.cyber
 */
public class Mina {
    private boolean tembomba;
    private boolean selecionado;
    private int bombasproximas;

    public Mina(boolean tembomba) {
        this.tembomba = tembomba;
    }

    public boolean isTembomba() {
        return tembomba;
    }

    public void setTembomba() {
        if (tembomba == false) {
            this.tembomba = true;
        } else {
            this.tembomba = false;
        }
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado() {
        if (selecionado == false) {
            this.selecionado = true;
        } else {
            this.selecionado = false;
        }
    }

    public int getBombasproximas() {
        return bombasproximas;
    }

    public void setBombasproximas(int bombasproximas) {
        this.bombasproximas = bombasproximas;
    }
    
}
