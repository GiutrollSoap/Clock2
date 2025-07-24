/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author UTN
 */
public abstract class Tiempo {
    protected int hora;
    protected int minuto;
    protected int segundo;
    
    
    public Tiempo(){
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
    }
    
    public void correr(){
        segundo++;
        if (segundo==60){
            segundo=0;
            minuto++;
        }
         
        if (minuto==60){
            minuto=0;
            hora++;
        }
           
        if (hora==24){
            hora=0;
            
        }
    }
    
    public String toString(){
        String h,m,s;
         h=String.valueOf(hora);
        if(hora<10){
            h="0".concat(h); 
        }
             m=String.valueOf(minuto);
        if(minuto<10){
            m="0".concat(m); 
        }
             s=String.valueOf(segundo);
        if(segundo<10){
            s="0".concat(s); 
        }
        return h+":"+m+":"+s;
    }
}
