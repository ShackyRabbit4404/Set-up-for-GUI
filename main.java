import javax.swing.*;
public class main{
    public static void main(String[] args){
        JFrame frame = new JFrame("DISPLAY");
        Display screen = new Display();
        frame.add(screen);
        Mouse mouse = new Mouse();
        frame.addMouseListener(mouse);
        frame.setBounds(0,0,1000,1000);
        frame.setVisible(true);
        new Thread(new frameRateUpdater(30,screen)).start();
    }
}