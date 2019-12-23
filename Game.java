public class Game implements Runnable{
    int x;
    public Game(){
        x = 0;
    }
    public void run(){
        while(true){
            x++;
            try{
                Thread.sleep(20);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}