/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.pruebas;

import ico.fes.TiposDeCamisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YO
 */
public class PruebasUnitarias {
    
    public TiposDeCamisa objeto1;
    public TiposDeCamisa objeto2;
    public TiposDeCamisa objeto3;

    public PruebasUnitarias(){
}
       
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before     //Se inicializan los objetos para las pruebas
    public void setUp() {
       objeto1 = new TiposDeCamisa(1,190);
       objeto2 = new TiposDeCamisa(2,230);
       objeto3 = new TiposDeCamisa(3,310);
    }
    
    @After
    public void tearDown() {
    } 
    @Test
    public void probarSinDescuento(){
      double esperado= 380;
        assertEquals(esperado, objeto1.descuento(2), esperado);
    }
    
    @Test
    public void probarDescuento1(){
      double esperado= 655.5;
        assertEquals(esperado, objeto2.descuento(3), esperado);
    }
    
    @Test
    public void probarDescuento2(){
      double esperado= 1711.2;
        assertEquals(esperado, objeto3.descuento(6), esperado);
    }
}
