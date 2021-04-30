/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author diregraph
 */
public class Player {
    private ArrayList<Card> cardPile;

    public Player(){
        cardPile = new ArrayList<>();
    }
    
    public void resetHand(){
        cardPile = new ArrayList<>();
    }
    
    public Card getCardFromTop(){
        return cardPile.remove(0);
    }
    
    public boolean putCardToBottom(Card card){
        return cardPile.add(card);
    }
    
    public int countCards(){
        return cardPile.size();
    }
    
}
