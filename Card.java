/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author diregraph
 */
public class Card {
    
    private final int suit, value;
    private final String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private final String[] cardValue = {"King", "Queen", "Jack", "10",
    "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};

    public Card(int cSuit, int cValue) {
        suit = cSuit;
        value = cValue;
    }

    public String toString() {
        String cardInfo = cardValue[value] + " of " + cardSuit[suit];
        return cardInfo;
    }
    
    public int getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getImage(){
        String basePath = "/game/images/";
        String cardImagepath = cardValue[value]+cardSuit[suit]+".png";
        return basePath+cardImagepath;
    }
}
