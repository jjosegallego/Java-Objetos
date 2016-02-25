package sustentacion;


public class Delay {
    
     public void retardo(){
        try {
            Thread.sleep(3000);                 
        } 
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
}
