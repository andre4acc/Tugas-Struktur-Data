/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author andre
 */
public class ThreadPool implements Runnable{
    private int td;
    
    public ThreadPool(int id){
        this.td=id;
    }
 @Override
    public void run() {
  
      System.out.println("Hitung bilangan ganjil = "+td);
      
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }
}  
