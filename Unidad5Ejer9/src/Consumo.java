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

    public final static String[] tipoCombustible = {"Gasolina 95", "Gasolina 98", "Diesel"};
    //atributos
    private double kms;
    private double litros;
    private double vmed;
    private int combustible;
    //constructores

    public Consumo(double kms, double litros, double vmed, int combustible) {
        this.setKms(kms);
        this.setLitros(litros);
        this.setVmed(vmed);
        this.setPgas(combustible);
    }

    //metodos
    /**
     * Obtenemos el tiempo del viaje
     *
     * @return
     */
    public double getTiempo() {
        return kms / vmed;
    }
    /**
     * Devuelve el consumo medio por cada 100 Kms
     * @return 
     */
    public double consumoMedio() {
        return kms * litros / 100;
    }
    /**
     * Devuelve el consumo en Euros
     * @return 
     */
    public double consumoEuros() {
        if (combustible == 0) {
            return (kms * litros / 100) * GASOLINA95;
        } else if (combustible == 1) {
            return (kms * litros / 100) * GASOLINA98;
        } else if (combustible == 2) {
            return (kms * litros / 100) * DIESEL;
        }

        return (kms * litros / 100) * GASOLINA98;
    }
    /**
     * Se fijan los Kms recorridos
     * @param kms 
     */
    public void setKms(double kms) {
        this.kms = kms;
    }
    /**
     * Añade los litros consumidos
     * @param litros 
     */
    public void setLitros(double litros) {
        this.litros = litros;
    }
    /**
     * Se establece la velocidad media
     * @param vmed 
     */
    public void setVmed(double vmed) {
        this.vmed = vmed;
    }
    /**
     * Se establece el tipo de combustible usado
     * @param combustible 
     */
    public void setPgas(int combustible) {
        this.combustible = combustible;
    }
    
    @Override
    public String toString() {
        return "\nHas introducido= " + kms + " Kms"
                + "\nTotal carburante= " + litros + " Litos"
                + "\nVelocidad media= " + vmed + " Kms/h"
                + "\nTipo de combustible= " + tipoCombustible[combustible];
    }

}
