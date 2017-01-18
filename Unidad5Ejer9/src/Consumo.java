/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin1
 */
public class Consumo {
    //atributos
        private double kms;
        private double litros;
        private double vmed;
        private String tipocombustible;
    //constructores

    public Consumo(double kms, double litros, double vmed, String tipocombustible) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.tipocombustible = tipocombustible;
    }
 
        
        
    //metodos
        public double getTiempo(){
        return kms/vmed;
        }
        public double consumoMedio(){
        return 
        }
        public double consumoEuros(){
        
        }
        
}
