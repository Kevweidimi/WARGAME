/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.event.ActionListener;

/**
 *
 * @author diregraph
 */
public class GameGUI extends javax.swing.JFrame {

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPlayer1Stack = new javax.swing.JLabel();
        jButtonDrawCard = new javax.swing.JButton();
        jLabelCard1 = new javax.swing.JLabel();
        jLabelCard2 = new javax.swing.JLabel();
        jLabelPlayer2Stack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCountP2 = new javax.swing.JLabel();
        jLabelCountP1 = new javax.swing.JLabel();
        jLabelInstruction = new javax.swing.JLabel();
        jLabelDiscardPile1Count = new javax.swing.JLabel();
        jLabelDiscardPile2Count = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonDealGame = new javax.swing.JButton();
        jButtonContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPlayer1Stack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/b1fv.png"))); // NOI18N
        jLabelPlayer1Stack.setText("jLabelDrawPile");

        jButtonDrawCard.setText("Play a card");
        jButtonDrawCard.setEnabled(false);

        jLabelPlayer2Stack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/b1fv.png"))); // NOI18N

        jLabel1.setText("Player 1");

        jLabel2.setText("Player 2");

        jLabel3.setText("Discard pile count:");

        jLabel4.setText("Discard pile count:");

        jLabelStatus.setText("Instruction: ");

        jLabel5.setText("Card count:");

        jLabel6.setText("Card count:");

        jLabelCountP2.setText("0");

        jLabelCountP1.setText("0");

        jLabelInstruction.setText("Draw cards.");

        jLabelDiscardPile1Count.setText("0");

        jLabelDiscardPile2Count.setText("0");

        jLabel7.setText("War: Draw cards and test your luck!");

        jButtonDealGame.setText("Deal Game");

        jButtonContinue.setText("Continue");
        jButtonContinue.setEnabled(false);
        jButtonContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelStatus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelCountP1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelPlayer1Stack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDealGame, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jButtonContinue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDrawCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDiscardPile1Count)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDiscardPile2Count, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPlayer2Stack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCountP2)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelDiscardPile2Count)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDealGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPlayer1Stack)
                                    .addComponent(jLabelPlayer2Stack))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabelCountP1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabelCountP2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonDrawCard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonContinue)
                                .addGap(23, 23, 23)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStatus)
                            .addComponent(jLabelInstruction))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDiscardPile1Count))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonContinueActionPerformed

    public void setDiscardPileImage(int pile, Card card) {
        switch (pile) {
            case 0:
                jLabelCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(card.getImage())));
                break;
            case 1:
                jLabelCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(card.getImage())));
                break;
            default:
                jLabelCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(card.getImage())));
                break;
        }
    }
    
    public void resetDiscardPileImage(){
        jLabelCard1.setIcon(null);
        jLabelCard2.setIcon(null);
    }

    public void setPlayerCardCount(int player, String count) {
        switch (player) {
            case 0:
                jLabelCountP1.setText(count);
                break;
            case 1:
                jLabelCountP2.setText(count);
                break;
            default:
                jLabelCountP1.setText(count);
                break;
        }
    }
    
    public void setDiscardPileCount(int player, String count) {
        switch (player) {
            case 0:
                jLabelDiscardPile1Count.setText(count);
                break;
            case 1:
                jLabelDiscardPile2Count.setText(count);
                break;
            default:
                jLabelDiscardPile1Count.setText(count);
                break;
        }
    }
    
    
    
    public void setInstruction(String instruction) {
       jLabelInstruction.setText(instruction);
    }
    
    public void setDrawButtonEnabled(boolean shouldEnable){
        jButtonDrawCard.setEnabled(shouldEnable);
    }
    
    public void setContinueButtonEnabled(boolean shouldEnable){
        jButtonContinue.setEnabled(shouldEnable);
    }
    
    void addDealGameListener(ActionListener listener) {
        jButtonDealGame.addActionListener(listener);
    }
    
    void addDrawCardListener(ActionListener listener) {
        jButtonDrawCard.addActionListener(listener);
    }
    
    void addContinueListener(ActionListener listener) {
        jButtonContinue.addActionListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinue;
    private javax.swing.JButton jButtonDealGame;
    private javax.swing.JButton jButtonDrawCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCard1;
    private javax.swing.JLabel jLabelCard2;
    private javax.swing.JLabel jLabelCountP1;
    private javax.swing.JLabel jLabelCountP2;
    private javax.swing.JLabel jLabelDiscardPile1Count;
    private javax.swing.JLabel jLabelDiscardPile2Count;
    private javax.swing.JLabel jLabelInstruction;
    private javax.swing.JLabel jLabelPlayer1Stack;
    private javax.swing.JLabel jLabelPlayer2Stack;
    private javax.swing.JLabel jLabelStatus;
    // End of variables declaration//GEN-END:variables
}
