
package paquete03;

import paquete02.Automovil;

public class AutomovilGasolina extends Automovil {
    
    private int numGalones;
    private double costoGalon;
    private double iva;

    public AutomovilGasolina(int numeroDeGalonesMax, double costoGalon, 
            String nombrePropietario, String placa) {
        super(nombrePropietario, placa);
        this.numGalones = numeroDeGalonesMax;
        this.costoGalon = costoGalon;
        this.iva = 10;

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

    @Override
    public void calcularValorFinal(){
        valorCancelar = (costoGalon * numGalones) + (((costoGalon * numGalones) * iva) / 100);
        
    }
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("Automóvil Gasolina\n"
                + "%s"
                + "Numero de galones: %d\n"
                + "Costo de galon: %.2f\n"
                + "iva: %.2f\n "
                + "Valor Final: %.2f\n"                
                ,super.toString(), numGalones, costoGalon, iva, valorCancelar);
        
        return cadena;
    }
    
    
}
