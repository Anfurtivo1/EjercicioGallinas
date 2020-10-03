
package gallinas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés
 */
public class Gallinas {

    	public static void main(String[] args) {
		Gallina corral[][] = new Gallina [2][3];
		Gallina gallina;
		int contador=0;
                double porcentaje;
                Temporizador tiempo = new Temporizador();
                Hilo1 hilo1;
		
		for (int i = 0; i < corral.length; i++) {
			for (int j = 0; j < corral[i].length; j++) {
                                gallina = new Gallina ("Gallina "+contador,i,j,0);
				corral[i][j]=gallina;
                                System.out.println(corral[i][j].toString());
                                contador++;
			}
		}
                System.out.println("*********************");
            try {
                for (int i = 0; i < corral.length; i++) {
			for (int j = 0; j < corral[i].length; j++) {
                                porcentaje=Math.floor(Math.random()*(1-100)+100);
                                if (porcentaje<50) {
                                corral[i][j].setNombre("Gallina muerta");
                                
                            }if (!corral[i][j].getNombre().equalsIgnoreCase("Gallina muerta")) {
                                corral[i][j].setHuevosPuestos(corral[i][j].getHuevosPuestos()+1);
                            }
                                Thread.sleep(1000);
			}
		}
                 
            } catch (Exception e) {
                            System.out.println("Error en "+e);
                        }
                
            System.out.println("*********************");
            
                for (int i = 0; i < corral.length; i++) {
			for (int j = 0; j < corral[i].length; j++) {
                                System.out.println(corral[i][j].toString());
			}
		}
                
            hilo1= new Hilo1(corral);
            hilo1.start();
                
        }

}
