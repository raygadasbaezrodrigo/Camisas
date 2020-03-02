/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;
import java.util.*;

/**
 *
 * @author YO
 */
public class TiposDeCamisa {
    int tipo;
    int precio;
    public TiposDeCamisa (int tip, int pre){
        this.precio = pre;
        this.tipo = tip;
        
    }

        //Constructor
    public TiposDeCamisa() {
    }
    

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //Muestra al usuario las opciones a seleccionar
    public void MostrarDatos(){
        System.out.println("Tipo    Descripcion             Precio");
        System.out.println(" 1      Manga Corta              190");
        System.out.println(" 2   Casual de manga larga       230");
        System.out.println(" 3   Formal de manga larga       310");
    }
    
    //Solicita al usuario la cantidad de cammisas a comprar
    public static int cuantas(){
        System.out.println("Cuantas vas a querer?");
        Scanner opcion = new Scanner(System.in);
        int cantidad;
        cantidad = opcion.nextInt();
        return cantidad;
        
    }
    
    //Calcula los descuentos con base en la cantidad solicitada
    public double descuento(int cantidad){
        double descuento; 
        double total=0;
        double descuento1=0.05;
        double descuento2= 0.08;
        
        //De 0 a 2 camisas no hay descuento
        if (cantidad<=2){
            total = precio*cantidad;
            System.out.println("No hay descuento,su total es: " + total); 
            return total;
        }
        
        //De 3 a 5 hay un descuento del 5%
        if (cantidad>2 && cantidad<=5){
            descuento = precio*cantidad*descuento1;
            total= (precio*cantidad)-(descuento);
            System.out.println("Si hay descuento, su total es: " + total);
            return total;
    }
        //Mayor a 5, hay un descuento del 8%
        if (cantidad>5){
           descuento = precio*cantidad*descuento2;
           total= (precio*cantidad)-(descuento);
           System.out.println("Si hay descuento, su total es: " + total);
           return total;
    }
       return total;
        
}
}
