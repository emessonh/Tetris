import javax.swing.JFrame;

import Tetris.game.GamePanel;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Adiciona a tela
        GamePanel painelJogo = new GamePanel();
        window.add(painelJogo);
        window.pack();

        // permite gerar a tela do jogo centralizada
        window.setLocationRelativeTo(null);
        // Permite visualizar a tela
        window.setVisible(true);
    }
    
}

