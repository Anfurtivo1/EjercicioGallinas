
package gallinas;

import java.util.Date;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author Andrés
 */
public class Temporizador {
    java.util.Timer timer = new java.util.Timer();// --> Se define como atributo de la clase.
    private int tiempo = 0;// --> Variable que iremos incrementando de uno en uno.

    public Temporizador() {
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    tiempo++;
                    //Si han pasado 4 segundos se hace esto
                    if (tiempo % 4 ==0) {
                        //System.out.println("Han pasado 4 segundos");
                    }
                    //Si han pasado 10 segundos se hace esto
                    if (tiempo % 10 ==0) {
                        //System.out.println("Han pasado 10 segundods");
                    }
                    //Si han pasado 20 segundos se hace esto
                    if (tiempo % 20 == 0) {
                        //System.out.println("Han pasado 20 segundos");
                    }
                    //Cuando ha llegado a 21 segundos, la simulacion se para
                    if (tiempo==21) {
                        timer.cancel();
                    }
                }
            };
            //Se repetira todo cada segundo(El segundo campo indica cada cuantos segundos y el primero con cuanto retraso se ejecuta
            timer.schedule(tarea,0,1000);
    }
    
    

}
