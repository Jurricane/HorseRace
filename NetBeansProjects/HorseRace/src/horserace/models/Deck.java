/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horserace.models;

import java.util.ArrayList;

/**
 *
 * @author JerryJerr
 */
public class Deck {
    
    private ArrayList<Card> cards;
    
    public Deck() {
        this.cards = new ArrayList<Card>();
        cards.add(new Card("Spades", "2"));
        cards.add(new Card("Spades", "3"));
        cards.add(new Card("Spades", "4"));
        cards.add(new Card("Spades", "5"));
        cards.add(new Card("Spades", "6"));
        cards.add(new Card("Spades", "7"));
        cards.add(new Card("Spades", "8"));
        cards.add(new Card("Spades", "9"));
        cards.add(new Card("Spades", "10"));
        cards.add(new Card("Spades", "J"));
        cards.add(new Card("Spades", "Q"));
        cards.add(new Card("Spades", "K"));
        //cards.add(new Card("Spades", "A"));
        
        cards.add(new Card("Diamonds", "2"));
        cards.add(new Card("Diamonds", "3"));
        cards.add(new Card("Diamonds", "4"));
        cards.add(new Card("Diamonds", "5"));
        cards.add(new Card("Diamonds", "6"));
        cards.add(new Card("Diamonds", "7"));
        cards.add(new Card("Diamonds", "8"));
        cards.add(new Card("Diamonds", "9"));
        cards.add(new Card("Diamonds", "10"));
        cards.add(new Card("Diamonds", "J"));
        cards.add(new Card("Diamonds", "Q"));
        cards.add(new Card("Diamonds", "K"));
        
        cards.add(new Card("Clubs", "2"));
        cards.add(new Card("Clubs", "3"));
        cards.add(new Card("Clubs", "4"));
        cards.add(new Card("Clubs", "5"));
        cards.add(new Card("Clubs", "6"));
        cards.add(new Card("Clubs", "7"));
        cards.add(new Card("Clubs", "8"));
        cards.add(new Card("Clubs", "9"));
        cards.add(new Card("Clubs", "10"));
        cards.add(new Card("Clubs", "J"));
        cards.add(new Card("Clubs", "Q"));
        cards.add(new Card("Clubs", "K"));
        
        cards.add(new Card("Hearts", "2"));
        cards.add(new Card("Hearts", "3"));
        cards.add(new Card("Hearts", "4"));
        cards.add(new Card("Hearts", "5"));
        cards.add(new Card("Hearts", "6"));
        cards.add(new Card("Hearts", "7"));
        cards.add(new Card("Hearts", "8"));
        cards.add(new Card("Hearts", "9"));
        cards.add(new Card("Hearts", "10"));
        cards.add(new Card("Hearts", "J"));
        cards.add(new Card("Hearts", "Q"));
        cards.add(new Card("Hearts", "K"));
        
    }
    
    public ArrayList<Card> getCards() {
        return this.cards;
    }
        
        
        
}
