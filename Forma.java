//import java.awt.event.KeyEvent; 
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public abstract class Forma extends JFrame implements KeyListener {
    protected int x = 200, y = 100, width =100, height = 50;
    protected int grados = 0;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    protected void mostrar() {
        this.setTitle("Adaptador");
        this.addKeyListener(this);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
        

    @Override
    public abstract void keyPressed(KeyEvent e);
}