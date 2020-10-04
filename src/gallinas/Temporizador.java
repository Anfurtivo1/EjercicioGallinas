
package gallinas;

import java.util.TimerTask;

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
                    //Cuando ha llegado a 3600 segundos, la simulacion se para
                    if (tiempo==3600) {
                        timer.cancel();
                    }
                }
            };
            //Se repetira todo cada segundo(El segundo campo indica cada cuantos segundos y el primero con cuanto retraso se ejecuta
            timer.schedule(tarea,0,1000);
    }
    
    

}
