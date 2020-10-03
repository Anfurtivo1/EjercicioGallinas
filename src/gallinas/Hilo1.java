
package gallinas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés
 */
public class Hilo1 extends Thread{
    private Gallina corral[][];
    
    public Hilo1(Gallina[][] corral) {
        this.corral = corral;
    }

    public Gallina[][] getCorral() {
        return corral;
    }

    public void setCorral(Gallina[][] corral) {
        this.corral = corral;
    }

    @Override
    public void run(){
        String todo;
        System.out.println("");
        for (int i = 0; i < corral.length; i++) {
            for (int j = 0; j < corral[i].length; j++) {
                    todo=("Encontrados "+corral[i][j].getHuevosPuestos()+" en la posicion "+i+"-"+j);
                    System.out.println(todo);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error en "+e);
                }
            }
        }
        
        
    }
    
    
    
}
