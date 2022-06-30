
package paquete04;

import paquete02.Automovil;


public class AutomovilDiesel extends Automovil {
    
    private int numLitros;
    private double costoLitro;
    private double descuentoLitros;

    public AutomovilDiesel(int numLitros, double costoLitro, 
            double descuentoLitros, String nombrePropietario, String placa) {
        super(nombrePropietario, placa);
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
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("Automóvil Diesel\n"
                + "%s"
                + "Numero de litros: %d\n"
                + "Costo de litro: %.2f\n"
                + "descuento: %.2f\n "
                + "Valor Final: %.2f\n"                
                ,super.toString(), numLitros, costoLitro, descuentoLitros,
                valorCancelar);
        
        return cadena;
    }
    
    
}
