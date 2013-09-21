/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flypalooza;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class MouseEvents{
    
    public void changeFaces(){
        FlyPalooza.singleButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.singleButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.singleButton.setBackground(Color.yellow);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.firstFace.setVisible(false);
                FlyPalooza.singlePlayerFace.setVisible(true);
            }
        });
        FlyPalooza.multiplayerButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.multiplayerButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.multiplayerButton.setBackground(Color.red);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.firstFace.setVisible(false);
                FlyPalooza.multiPlayerFace.setVisible(true);
                FlyPalooza.ip.setVisible(true);
            }
        });
        FlyPalooza.rankingButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.rankingButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.rankingButton.setBackground(Color.green);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.rankings.setVisible(true);
            }
        });
        FlyPalooza.creditsButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.creditsButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.creditsButton.setBackground(Color.black);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.firstFace.setVisible(false);
                FlyPalooza.creditsFace.setVisible(true);
                try {
                    FlyPalooza.playIntro("stop");
                    FlyPalooza.playCreditsSound("play");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MouseEvents.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        FlyPalooza.returnSinglePlayerButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.returnSinglePlayerButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.returnSinglePlayerButton.setBackground(Color.black);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.singlePlayerFace.setVisible(false);
                FlyPalooza.firstFace.setVisible(true);
            }
        });
        FlyPalooza.returnMultiPlayerButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.returnMultiPlayerButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.returnMultiPlayerButton.setBackground(Color.black);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.multiPlayerFace.setVisible(false);
                FlyPalooza.ip.setVisible(false);
                FlyPalooza.firstFace.setVisible(true);
            }
        });
        FlyPalooza.returnCreditsButton.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.returnCreditsButton.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.returnCreditsButton.setBackground(Color.black);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.creditsFace.setVisible(false);
                FlyPalooza.firstFace.setVisible(true);
            }
        });
        FlyPalooza.closeRankings.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.closeRankings.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.closeRankings.setBackground(Color.black);
            }
            public void mousePressed(MouseEvent e){
                FlyPalooza.rankings.setVisible(false);
            }
        });
        FlyPalooza.joinMatch.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.joinMatch.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.joinMatch.setBackground(Color.red);
            }
            public void mousePressed(MouseEvent e){
               
            }
        });
        FlyPalooza.createMatch.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                FlyPalooza.createMatch.setBackground(Color.cyan);
            }
            public void mouseExited(MouseEvent e){
                FlyPalooza.createMatch.setBackground(Color.red);
            }
            public void mousePressed(MouseEvent e){
                
            }
        });
    }
}
