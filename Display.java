import javax.swing.*;
import java.awt.*;
public class Display extends JComponent{
    Game game;
    public Display(Game g){
        game = g;
    }
    public void draw(){
        super.repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(10+game.x,10,100,100);
    }
}