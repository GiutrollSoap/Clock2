
package Reloj;


public class Temporizador extends Tiempo implements Configurable, Controladores{

    @Override
    public void configurar(int h, int m, int s) {
     this.hora=h;
     this.minuto=m;
     this.segundo=s;
    }

    @Override
    public void iniciar() {
     this.activo=true;
    }

    @Override
    public void detener() {
    this.activo=false;
    }

    @Override
    public void correr() {
        if (this.activo){
        segundo--;
               if (segundo==-1){
                   segundo=59;
                  minuto--;
                  
                   if (minuto==-1){
                     minuto=59;
                     hora--;
                         if (hora==-1){
                             hora=0;
                             minuto=0;
                             segundo=0;
                             this.activo=false;
                    }
                }    
            }
        }       
    }
}