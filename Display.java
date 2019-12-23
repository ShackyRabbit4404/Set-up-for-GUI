import javax.swing.*;
import java.awt.*;
public class Display extends JComponent{
    public Display(){
        
    }
    public void draw(){
        super.repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(10,10,100,100);
    }
}