
package com.Servicios;

import com.Interfaces.ICRUD;
import com.Tecnologia.Computadoras.Computadora;
import java.util.*;


public class ServiciosCompu implements ICRUD{

    List<Computadora> lista=new LinkedList();
    
    @Override
    public boolean create(Computadora compu){
     
        return lista.add(compu);
    }
    
    @Override
    public List read(){
        return lista;
    }
    public List delete(){
        return lista;
    }
    
}
