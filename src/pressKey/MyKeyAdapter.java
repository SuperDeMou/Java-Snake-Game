package pressKey;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import mainProgram.GamePanel;

public class MyKeyAdapter extends KeyAdapter {
    private GamePanel gamePanel;

    public MyKeyAdapter(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char direction = gamePanel.getDirection(); 
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (direction != 'R') {
                    gamePanel.setDirection('L');
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') {
                    gamePanel.setDirection('R');
                }
                break;
            case KeyEvent.VK_UP:
                if (direction != 'D') {
                    gamePanel.setDirection('U');
                }
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 'U') {
                    gamePanel.setDirection('D');
                }
                break;
        }
    }
}
