
package com.Principal;

import com.Servicios.ServiciosCompu;
import com.Tecnologia.Computadoras.Computadora;
import java.util.*;
import java.util.Scanner;


public class Computadoras {

    private static Scanner sc=new Scanner(System.in);
    private static Scanner scLines=new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        
        boolean flag=true;
        
        
        System.out.println("*************---Bienvenido a Tecnologias---*************");
        System.out.println("");
        ServiciosCompu services=new ServiciosCompu();
        
        do{
            System.out.println("Ingresa la opcion que desees: ");
            System.out.println("");
            System.out.println("1) Añadir computadora");
            System.out.println("2) Revisar lista");
            System.out.println("3) Modificar");
            System.out.println("4) Eliminar");
            System.out.println("5) Salir");
            System.out.println("");
            int opc=sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("");
                    Computadora compu=pedirDatosAUsuario();
                    boolean exito=services.create(compu);
                    if(exito){
                        System.out.println("Se agrego con exito");
                    }else{
                        System.out.println("Nel Morrillo No se Arma Asi !!");
                    }
                    break;
                case 2:
                    System.out.println("");
                    List lista=services.read();
                    imprimirLista(lista);
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    //List lista=services.delete();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Hasta luego!!");
                    flag=!flag;
                    break;
                default:
                    System.out.println("");
                    System.out.println("La opcion no es valida!!");
                    System.out.println("Intenta de nuevo....");                    
                    break;
            }
            
            
        }while(flag);
        
    }

    public static Computadora pedirDatosAUsuario() {
        System.out.println("Ingrese el numero de serie: ");
        String noSerie=scLines.nextLine();
        
        System.out.println("Ingrese el año de fabricacion: ");
        String anio=scLines.nextLine();
        
        System.out.println("Ingrese el modelo de la computadora: ");
        String modelo=scLines.nextLine();
        
        System.out.println("Ingrese el modelo de procesador: ");
        String procesador=scLines.nextLine();
        
        System.out.println("Ingrese la cantidad de RAM: ");
        int ram=sc.nextInt();
        
        Computadora compu;
        compu = new Computadora(noSerie,anio,modelo,procesador,ram);
        return compu;
    }

    private static void imprimirLista(List<Computadora> lista) {
        
        for(Computadora compu:lista){
            System.out.println("");
            System.out.println(compu);
        }
        
        
    }
    
}
