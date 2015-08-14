/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalalfredoserrano;

/**
 *
 * @author T-107
 */
public class ThreadInterno extends Thread{
    public void run (){
        while (true){
            try{
                Thread.sleep(500);
                System.out.println("ThreadInterno");
            }catch (InterruptedException e){   
                
            }
        }
    }
    
}
