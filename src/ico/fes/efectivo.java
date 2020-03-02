/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import java.util.Scanner;

/**
 *
 * @author YO
 */
public class efectivo {
    public static void main(String[] args) {
        
        TiposDeCamisa camisa1 = new TiposDeCamisa(1, 190);
        TiposDeCamisa camisa2 = new TiposDeCamisa(2, 230);
        TiposDeCamisa camisa3 = new TiposDeCamisa(3, 310);
        
        camisa1.MostrarDatos();
        
        System.out.println("Escoge un tipo de camisa: ");
        Scanner opcion = new Scanner(System.in);
        int option;
        option = opcion.nextInt();
   
        if(option !=1 && option !=2 && option!=3){
            System.out.println("Opcion no valida.");
            System.exit(0);
        }
        
        if (option == 1){
            camisa1.descuento(TiposDeCamisa.cuantas());
        }else{
            if(option==2){
                camisa2.descuento(TiposDeCamisa.cuantas());
            }
        else{
                camisa3.descuento(TiposDeCamisa.cuantas());
            }   
    }
    }  
}
