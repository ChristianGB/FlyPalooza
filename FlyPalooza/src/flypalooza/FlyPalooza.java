package flypalooza;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class FlyPalooza extends JFrame{
    
    //Faces
    public static JPanel firstFace;
    public static JPanel singlePlayerFace;
    public static JPanel multiPlayerFace;
    public static JPanel creditsFace;
    public static JPanel rankings;
    
    //Buttons
    public static JPanel singleButton;
    public static JPanel multiplayerButton;
    public static JPanel rankingButton;
    public static JPanel creditsButton;
    public static JPanel returnCreditsButton;
    public static JPanel returnSinglePlayerButton;
    public static JPanel returnMultiPlayerButton;
    public static JPanel closeRankings;
    public static JPanel joinMatch;
    public static JPanel createMatch;
    
    //Objects
    public static JTextField ip;
    Cursor cursor = new Cursor(12);
    //Constructor of the principal window
    public FlyPalooza(){
        super("FlyPalooza");
        Container container = getContentPane();
        
        this.setBounds(0,0,1200,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(container);
        
        firstFace = new JPanel();
        firstFace.setBounds(0, 0, 1200, 700);
        firstFace.setBackground(Color.ORANGE);
        firstFace.setVisible(true);
        firstFace.setLayout(null);
        container.add(firstFace);
        
        creditsFace = new JPanel();
        creditsFace.setBounds(0, 0, 1200, 700);
        creditsFace.setBackground(Color.MAGENTA);
        creditsFace.setVisible(false);
        creditsFace.setLayout(null);
        container.add(creditsFace);
        
        singlePlayerFace = new JPanel();
        singlePlayerFace.setBounds(0, 0, 1200, 700);
        singlePlayerFace.setBackground(Color.PINK);
        singlePlayerFace.setVisible(false);
        singlePlayerFace.setLayout(null);
        container.add(singlePlayerFace);
        
        multiPlayerFace = new JPanel();
        multiPlayerFace.setBounds(0, 0, 1200, 700);
        multiPlayerFace.setBackground(Color.darkGray);
        multiPlayerFace.setVisible(false);
        multiPlayerFace.setLayout(null);
        container.add(multiPlayerFace);
        
        ip = new JTextField(20);
        ip.setBounds(400, 30, 400, 50);
        ip.setVisible(false);
        ip.setFont(new Font("Arial", Font.BOLD, 44));
        multiPlayerFace.add(ip);
        
        singleButton = new JPanel();
        singleButton.setBounds(700, 300, 420, 100);
        singleButton.setBackground(Color.yellow);
        singleButton.setVisible(true);        
        singleButton.setCursor(cursor);
        firstFace.add(singleButton);
        
        multiplayerButton = new JPanel();
        multiplayerButton.setBounds(700, 400, 420, 100);
        multiplayerButton.setBackground(Color.red);
        multiplayerButton.setVisible(true);
        multiplayerButton.setCursor(cursor);
        firstFace.add(multiplayerButton);
        
        rankingButton = new JPanel();
        rankingButton.setBounds(700, 500, 420, 100);
        rankingButton.setBackground(Color.green);
        rankingButton.setVisible(true);
        rankingButton.setCursor(cursor);
        firstFace.add(rankingButton);
        
        creditsButton = new JPanel();
        creditsButton.setBounds(1020, 250, 100, 30);
        creditsButton.setBackground(Color.black);
        creditsButton.setVisible(true);
        creditsButton.setCursor(cursor);
        firstFace.add(creditsButton);
        
        returnCreditsButton = new JPanel();
        returnCreditsButton.setBounds(30, 600, 100, 30);
        returnCreditsButton.setBackground(Color.black);
        returnCreditsButton.setVisible(true);
        returnCreditsButton.setCursor(cursor);
        creditsFace.add(returnCreditsButton);
        
        returnSinglePlayerButton = new JPanel();
        returnSinglePlayerButton.setBounds(30, 600, 100, 30);
        returnSinglePlayerButton.setBackground(Color.black);
        returnSinglePlayerButton.setVisible(true);
        returnSinglePlayerButton.setCursor(cursor);
        singlePlayerFace.add(returnSinglePlayerButton);
        
        returnMultiPlayerButton = new JPanel();
        returnMultiPlayerButton.setBounds(30, 600, 100, 30);
        returnMultiPlayerButton.setBackground(Color.black);
        returnMultiPlayerButton.setVisible(true);
        returnMultiPlayerButton.setCursor(cursor);
        multiPlayerFace.add(returnMultiPlayerButton);
        
        createMatch = new JPanel();
        createMatch.setBounds(820, 40, 100, 30);
        createMatch.setBackground(Color.red);
        createMatch.setVisible(true);
        createMatch.setCursor(cursor);
        multiPlayerFace.add(createMatch);
        
        joinMatch = new JPanel();
        joinMatch.setBounds(400, 90, 100, 30);
        joinMatch.setBackground(Color.red);
        joinMatch.setVisible(true);
        joinMatch.setCursor(cursor);
        multiPlayerFace.add(joinMatch);
        
        rankings = new JPanel();
        rankings.setBounds(100, 80, 420, 500);
        rankings.setBackground(Color.green);
        rankings.setLayout(null);
        rankings.setVisible(false);
        firstFace.add(rankings);
        
        closeRankings = new JPanel();
        closeRankings.setBounds(350, 00, 70, 30);
        closeRankings.setBackground(Color.black);
        closeRankings.setVisible(true);
        closeRankings.setCursor(cursor);
        rankings.add(closeRankings);
    }

    //Methos that intialize the intro sound
    
    static String path = "";
    static InputStream in;
    static AudioStream audio;
    public static void playIntro(String state) throws FileNotFoundException{
        path = "Audio\\Intro.wav";
        in = new FileInputStream(path);
        switch (state) {
            case "play":
                try{
                    audio = new AudioStream(in);
                    AudioPlayer.player.start(audio);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case "stop":
                try{
                    AudioStream audio = new AudioStream(in);
                    AudioPlayer.player.stop(audio);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
        }
    }
    
    //Methos that intialize the  credits sound
    public static void playCreditsSound(String state) throws FileNotFoundException{
        path = "Audio\\Credits.wav";
        in = new FileInputStream(path);
        switch (state) {
            case "play":
                try{
                    audio = new AudioStream(in);
                    AudioPlayer.player.start(audio);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case "stop":
                try{
                    AudioStream audio = new AudioStream(in);
                    AudioPlayer.player.stop(audio);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
        }
    }
    
    //Objects of other classes
    public static MouseEvents obj = new MouseEvents();
    
    //Main of the Window
    public static void main(String[] args) throws FileNotFoundException {
        FlyPalooza window = new FlyPalooza();
        window.playIntro("play");
        obj.changeFaces();
    }
    
}
