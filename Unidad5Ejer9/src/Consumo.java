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
    public final static double GASOLINA95 = 1.14;
    public final static double GASOLINA98 = 1.25;
    public final static double DIESEL = 1.04;
    
    public final static String [] tipoCombustible = {"Gasolina 95", "Gasolina 98", "Diesel"};
    //atributos
        private double kms;
        private double litros;
        private double vmed;
        private double combustible;
    //constructores

    public Consumo(double kms, double litros, double vmed, double combustible) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.combustible = combustible;
    }

    //metodos
        public double getTiempo(){
        return kms/vmed;
        }
        public double consumoMedio(){
        return kms*litros/100;
        }
        public double consumoEuros(){
        return (kms*litros/100)*DIESEL;
        }

    @Override
    public String toString() {
        return "\nkms= " + kms + 
                "\nlitros= " + litros + 
                "\nvmed=" + vmed + 
                "\nTipo de combustible=" + tipoCombustible[0];
    }
        
}
