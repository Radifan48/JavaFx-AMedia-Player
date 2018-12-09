package tugasradifan084;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

class coba implements Runnable{
    private int id;
    public coba(int id){
        this.id=id;
    }
    public void run(){
        System.out.println("Bilangan Ganjil :"+ id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
public class tugasthread {


    public static void main(String[] args) {
   ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i=1;i<=100;i++)  if(i%2==1){
           
           
            service.submit(new coba (i));
            
        }
        service.shutdown();
       
        
        try{
            service.awaitTermination(5, TimeUnit.DAYS);
            
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("---------------SELESAI---------------");
    
    }
   
}

