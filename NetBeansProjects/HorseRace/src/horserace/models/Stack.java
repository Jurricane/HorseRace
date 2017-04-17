/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horserace.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JerryJerr
 */
public class Stack {
    
    private ArrayList<Card> cards;
    
    public Stack(boolean fill) {
        if (fill == true) {
            fillWithShuffledCards();
        } else {
            this.cards = new ArrayList<Card>();
        }
    }
    
    private void fillWithShuffledCards() {
        this.cards = new ArrayList<>(new Deck().getCards());
        Collections.shuffle(cards);
        Collections.shuffle(cards);
    }
    
    public ArrayList<Card> getCards() {
        return this.cards;
    }
    
    public void setCards(List<Card> cards) {
        this.cards =(ArrayList<Card>) cards;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card + "\n");
        }
        sb.append("--------------------------------------------------\n");
        return sb.toString();
    }
}
