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
public class GameModel {
    
    private Deck deck;
    private final ArrayList<Card> discardPilePlayer1;
    private final ArrayList<Card> discardPilePlayer2;
    private final Player player1;
    private final Player player2;
    //this variable holds the result of the card evalation
    //Value : Interpretation
    //0     : card1 is higher
    //1     : card2 is higher
    //-1    : cards are equal
    private int result;
    private boolean isGameOver = false;
    
    public GameModel(){
        player1 = new Player();
        player2 = new Player();
        
        discardPilePlayer1 = new ArrayList<>();
        discardPilePlayer2 = new ArrayList<>();
    }
    
    public Player getPlayer(int playerNumber){
        switch (playerNumber) {
            case 0:
                return player1;
            case 1:
                return player2;
            default:
                return player1;
        }
    }
    
    private void putCardToDiscardPile(int pile, Card card){
        switch (pile) {
            case 0:
                discardPilePlayer1.add(0, card);
                break;
            case 1:
                discardPilePlayer2.add(0, card);
                break;
            default:
                discardPilePlayer1.add(0, card);
                break;
        }
    }
    
    public Card viewTopCardOnDiscardPile(int pile){
        ArrayList<Card> discardPile;
        switch (pile) {
            case 0:
                discardPile = discardPilePlayer1;
                break;
            case 1:
                discardPile = discardPilePlayer2;
                break;
            default:
                discardPile = discardPilePlayer1;
                break;
        }
        if(discardPile.isEmpty()){
            return null;
        }else{
            return discardPile.get(0);
        }
    }
    
    public void resetGame(){
        deck = new Deck();
        deck.shuffle();
        player1.resetHand();
        player2.resetHand();
    }
    
    public int dealCardsToPlayer(int playerNumber){
        Player player = getPlayer(playerNumber);
        for(int j=0; j<26; j++){
            player.putCardToBottom(deck.getCardFromTop());
        }
        return player.countCards();
    }
    
    public int drawCardFromPlayer(int playerNumber){
        Player player = getPlayer(playerNumber);
        putCardToDiscardPile(playerNumber, player.getCardFromTop());
        if(result == -1){
            putCardToDiscardPile(playerNumber, player.getCardFromTop());
        }
        return player.countCards();

    }
    
    public int getDiscardPileCount(int pile){
        switch (pile) {
            case 0:
                return discardPilePlayer1.size();
            case 1:
                return discardPilePlayer2.size();
            default:
                return discardPilePlayer1.size();

        } 
    }
    
    public String evaluateCards(){
        int player1CardCount = getPlayer(0).countCards();
        int player2CardCount = getPlayer(1).countCards();
        if(player1CardCount == 0){
            isGameOver = true;
            return "Player 2 wins the game. Press Deal Game to start again.";
        }else  if(player2CardCount == 0){
            isGameOver = true;
            return "Player 1 wins the game. Press Deal Game to start again.";
        } else {
            int card1Value = viewTopCardOnDiscardPile(0).getValue();
            int card2Value = viewTopCardOnDiscardPile(1).getValue();
            if(card1Value > card2Value){
                result = 0;
                return "Player 1 wins the hand. Press continue.";
            }else if(card2Value > card1Value){
                result = 1;
                return "Player 2 wins the hand. Press continue.";
            }else {
                result = -1;
                return "Cards are equal, there is a war! Press continue.";
            }
        }
    }
    
    public boolean getGameOverState(){
        return isGameOver;
    }
    
    public void continueGame(){
        if(result != -1 && !isGameOver){
            Player winner = getPlayer(result);
            int discardPileSize = discardPilePlayer1.size();
            Collections.shuffle(discardPilePlayer1);
            for (int i = 0; i < discardPileSize; i++) {
                winner.putCardToBottom(discardPilePlayer1.remove(0));
            }
            discardPileSize = discardPilePlayer2.size();
            Collections.shuffle(discardPilePlayer1);
            for (int i = 0; i < discardPileSize; i++) {
                winner.putCardToBottom(discardPilePlayer2.remove(0));
            }
        }
    }
}
