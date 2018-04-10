import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
public class Paralelogramo extends Forma {
    
     
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.black);
        g2d.rotate(Math.toRadians(grados));
        g2d.drawRect(x, y, width, height);
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
           /* case KeyEvent.VK_UP:
                y--;
                repaint();
                break;
            case KeyEvent.VK_DOWN:
                y++;
                repaint();
                break;
               */
            case KeyEvent.VK_LEFT:
                x--;
                repaint();
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                repaint();
                break;
            case KeyEvent.VK_R:
                if(grados != 360) {
                    grados += 45;
                }
                /*else {
                    grados = 0;
                }
                */
               repaint();
                break;
            case KeyEvent.VK_T:
                if(grados != 360)
                {
                    grados -=45;
                }
                repaint();
                break;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}