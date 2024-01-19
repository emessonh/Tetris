package Tetris.game;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

// Game herda JPanel
public class GamePanel extends JPanel {
    private final int HEIGHT = 960;
    private final int WIDTH = 720;

    public GamePanel(){
        this.setPreferredSize(new Dimension(HEIGHT, WIDTH));
        // this.setBackground(Color.black);
        this.setLayout(null);
    }

}
