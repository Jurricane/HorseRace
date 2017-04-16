/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horserace.models;

import jdk.nashorn.internal.ir.Symbol;

/**
 *
 * @author JerryJerr
 */
public class Card {
    
    private final String symbol;
    private final String value;
    
    public Card(String symbol, String value) {
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return (this.value + " " + this.symbol);
    }
    
    
}
