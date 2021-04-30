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
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameGUI view = new GameGUI();
        GameModel model = new GameModel();
        
        GameController controller = new GameController(view, model);
        
        view.setVisible(true); 
    }
    
}
