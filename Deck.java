/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author diregraph
 */
public class Deck {
    
    private ArrayList<Card> deck;
    
    public Deck(){
        deck = new ArrayList<>();
        for(int i=0; i<4; i++){
            for(int j = 0; j < 13; j++){
                deck.add(new Card(i, j));
            }
        }
    }
    
    public Card getCardFromTop(){
        return deck.remove(0);
    }
    
    public void printAllCards(){
        System.out.println("Cards in the deck: \n"+deck);
    }
    
    public int countCards(){
        return deck.size();
    }
    
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
