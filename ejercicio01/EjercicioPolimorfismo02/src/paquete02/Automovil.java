
package paquete02;


public abstract class Automovil {
    
    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String nombrePropietario, String placa, double valorCancelar) {
        this.nombrePropietario = nombrePropietario;
        this.placa = placa;
        this.valorCancelar = valorCancelar;
    }
    
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setValorCancelar(double valorCancelar) {
        this.valorCancelar = valorCancelar;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValorCancelar() {
        return valorCancelar;
    }
    
    public abstract void calcularValorFinal();
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("Nombre Propietario: %s\n"
                + "Placa: %s\n", nombrePropietario, placa);        
        
        return cadena;
    }
    
}
