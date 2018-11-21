
package com.Tecnologia.Computadoras;

import com.Tecnologia.Tecnologia;

public class Computadora extends Tecnologia {
    
    private String procesador;
    private int ram;    

    public Computadora(String noSerie, String anio, String modelo,String procesador, int ram) {
        super(noSerie, anio, modelo);
        this.procesador = procesador;
        this.ram = ram;
    }

    public Computadora(String procesador, int ram) {
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    @Override
    public String toString(){
        return super.toString()+", procesador "+this.procesador+" ,Ram "+this.ram;
    }
            
}
