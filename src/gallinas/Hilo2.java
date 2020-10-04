
package gallinas;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés
 */
public class Hilo2 extends Thread{
    private String mensaje;

    public Hilo2(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public void run(){
        File archivo = new File("corral.txt");
        FileWriter escritorArchivo=null;
        BufferedWriter bw=null;
            
        try {
            escritorArchivo = new FileWriter(archivo);
            bw = new BufferedWriter(escritorArchivo);
            bw.write(mensaje);
            
        } catch (IOException e) {
            System.out.println("Error en "+e);
        }finally{
            try{
                if (bw != null) {
                    bw.close();
                }
                if (escritorArchivo!= null) {
                    escritorArchivo.close();
                }
            }catch(Exception e){
                
            }
        }
    }
}
