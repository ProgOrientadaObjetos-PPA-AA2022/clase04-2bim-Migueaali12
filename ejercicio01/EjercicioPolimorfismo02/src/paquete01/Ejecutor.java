
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        /* Profe este codigo lo termine ahorita en casa pedón por no utilizar
       los valores dichos en clase para los objetos */
        
        AutomovilGasolina auto1 = new AutomovilGasolina(20, 5.3, "Miguel Alvarez",
        "AXB - 222" );
        
        AutomovilDiesel auto2 = new AutomovilDiesel(20, 3.7, 10, "Angel Suarez",
        "EXH - 143");
        
        auto1.calcularValorFinal();
        auto2.calcularValorFinal();
        
        System.out.println(auto1);
        System.out.println(auto2);
        
    }
}
