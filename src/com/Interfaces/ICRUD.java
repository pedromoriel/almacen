
package com.Interfaces;

import com.Tecnologia.Computadoras.Computadora;
import java.util.*;


public interface ICRUD {
    
    boolean create(Computadora compu);
    
    List read();
}
