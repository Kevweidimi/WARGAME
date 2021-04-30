/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author diregraph
 */
public class GameController {
    
    private GameGUI view;
    private GameModel model;
    
    private final String DRAW = "Draw cards.";
    
    public GameController(GameGUI view, GameModel model){
        this.model = model;
        this.view = view;
        
        this.view.addDealGameListener(new DealGameListener());
        this.view.addDrawCardListener(new DrawCardListener());
        this.view.addContinueListener(new ContinueListener());

    }
    
    class DealGameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.resetGame();
            for(int i=0; i<2; i++){
                view.setPlayerCardCount(i, String.valueOf(model.dealCardsToPlayer(i)));
            }
            view.setInstruction(DRAW);
            view.setDrawButtonEnabled(true);
            view.setContinueButtonEnabled(false);
        }
    }
    
    class DrawCardListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i=0; i<2; i++){
                view.setPlayerCardCount(i, String.valueOf(model.drawCardFromPlayer(i)));
                view.setDiscardPileImage(i, model.viewTopCardOnDiscardPile(i));
                view.setDiscardPileCount(i, String.valueOf(model.getDiscardPileCount(i)));
            }
            view.setDrawButtonEnabled(false);
            view.setInstruction(model.evaluateCards());
            if(model.getGameOverState()){
                view.setContinueButtonEnabled(false);
            }else{
                view.setContinueButtonEnabled(true);
            }
        }
    }
    
    class ContinueListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setDrawButtonEnabled(true);
            view.setContinueButtonEnabled(false);
            model.continueGame();
            view.resetDiscardPileImage();
            for(int i=0; i<2; i++){
                view.setDiscardPileCount(i, String.valueOf(model.getDiscardPileCount(i)));
                view.setPlayerCardCount(i, String.valueOf(model.getPlayer(i).countCards()));
            }
            view.setInstruction(DRAW);

        }
    }
    
}

