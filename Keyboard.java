import java.awt.event.*;
public class Keyboard extends KeyAdapter{
    public Keyboard(){
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_A){
            System.out.println("A pressed");
        }
    }
    public void keyReleased(KeyEvent e){
        
    }
}