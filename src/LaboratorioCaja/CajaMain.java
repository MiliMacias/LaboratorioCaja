
package LaboratorioCaja;

/**
 *
 * @author milim
 */
public class CajaMain {
    public static void main(String[] args) {
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;
        Caja caja1 = new Caja();
           caja1.ancho = medidaAncho;
           caja1.alto = medidaAlto;
           caja1.profundo = medidaProfundo;
           int resultado = caja1.volumen();
           
           System.out.println("resultado volumen caja 1 = " + resultado);
           
         Caja caja2 = new Caja(3, 2, 6);
            System.out.println("resultado volumen caja 2 = " + caja2.volumen());
                 
            
        
    }
}
