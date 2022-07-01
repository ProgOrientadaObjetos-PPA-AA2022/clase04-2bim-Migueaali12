
package paquete03;

import paquete02.Automovil;

public class AutomovilGasolina extends Automovil {
    
    private int numGalones;
    private double costoGalon;
    private double iva;
    private double valorTotal;

    public AutomovilGasolina(int numeroDeGalonesMax, double costoGalon, double iva, double valorTotal, String nombrePropietario, String placa, double valorCancelar) {
        super(nombrePropietario, placa, valorCancelar);
        this.numGalones = numeroDeGalonesMax;
        this.costoGalon = costoGalon;
        this.iva = 10;
        this.valorTotal = valorTotal;
    }

    public int getNumGalones() {
        return numGalones;
    }

    public void setNumGalones(int numGalones) {
        this.numGalones = numGalones;
    }

    public double getCostoGalon() {
        return costoGalon;
    }

    public void setCostoGalon(double costoGalon) {
        this.costoGalon = costoGalon;
    }

    public double getIva() {
        return iva;
    }

    public void setIva() {
        this.iva = 10;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }     

    @Override
    public void calcularValorFinal(){
        valorCancelar = (costoGalon * numGalones) + (((costoGalon * numGalones) * iva) / 100);
        
    }
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("%s\n"
                + "Numero de galones: %d\n"
                + "Costo de galon: %.2f\n"
                + "iva: %.2f\n"
                + "Valor total: %.2f\n"
                ,super.toString(), numGalones, costoGalon, iva, valorTotal);
        
        return cadena;
    }
    
    
}
