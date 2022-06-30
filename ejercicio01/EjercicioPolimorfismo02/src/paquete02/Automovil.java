
package paquete02;


public abstract class Automovil {
    
    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String nombrePropietario, String placa) {
        this.nombrePropietario = nombrePropietario;
        this.placa = placa;
        
    }
    
    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public String getPlaca() {
        return placa;
    }

    
    public abstract void calcularValorFinal();
    
    public double getValorCancelar() {
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("Nombre Propietario: %s\n"
                + "Placa: %s\n", nombrePropietario, placa);        
        
        return cadena;
    }
    
}
