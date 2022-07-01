
package paquete04;

import paquete02.Automovil;


public class AutomovilDiesel extends Automovil {
    
    private int numLitros;
    private double costoLitro;
    private double descuentoLitros;

    public AutomovilDiesel(int numLitros, double costoLitro, double descuentoLitros, String nombrePropietario, String placa, double valorCancelar) {
        super(nombrePropietario, placa, valorCancelar);
        this.numLitros = numLitros;
        this.costoLitro = costoLitro;
        this.descuentoLitros = descuentoLitros;
    }

    public int getNumLitros() {
        return numLitros;
    }

    public void setNumLitros(int numLitros) {
        this.numLitros = numLitros;
    }

    public double getCostoLitro() {
        return costoLitro;
    }

    public void setCostoLitro(double costoLitro) {
        this.costoLitro = costoLitro;
    }

    public double getDescuentoLitros() {
        return descuentoLitros;
    }

    public void setDescuentoLitros(double descuento) {
        descuentoLitros = ((numLitros * descuento) / 100);
    }    
    
   @Override
    public void calcularValorFinal(){
        valorCancelar = (costoLitro * descuentoLitros);
        
    }
    
}
