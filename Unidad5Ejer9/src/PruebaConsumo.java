/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loren
 */
public class PruebaConsumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumo c1=new Consumo(50, 5, 50, 0);
        
        System.out.println("El tiempo empleado en realizar el viaje es de "+c1.getTiempo()+" hora");
        System.out.println("El consumo medio es de "+c1.consumoMedio()+" Litros a los 100");
        System.out.println("El consumo en euros es de "+c1.consumoEuros()+"€");
        System.out.println(c1.toString());
    }
    
}
