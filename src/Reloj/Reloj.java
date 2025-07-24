/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author UTN
 */
public class Reloj extends Tiempo implements Configurable {

    @Override
   public void configurar(int h, int m, int s){
       this.hora=h;
       this.minuto=m;
       this.segundo=s;

    
    
}
