
package LaboratorioCaja;

/**
 *
 * @author milim
 */
public class Caja {
    //atributos
    int ancho, alto, profundo;
    
    //constructores
    public Caja(){
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    //metodos
    public int volumen (){
        return ancho * alto * profundo;
    }
    
}
