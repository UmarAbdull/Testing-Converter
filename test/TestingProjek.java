/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projek.pkg2.s3.q1.Loading;
import projek.pkg2.s3.q1.Logic;
import projek.pkg2.s3.q1.Page;

/**
 *
 * @author Muhammad Ammar Fadhlan, umar abdullah Azzam
 */
public class TestingProjek {
    
    public TestingProjek() {
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    //Testing Method in Page.java (converter)
    @Test
    public void testKilogram() {
        Page pg = new Page();
        String expInput = "20";
        pg.Kilogram(expInput);
        String expResult="200.0 HG";
        String result = pg.A2.getText();
        assertEquals(expResult, result);
         System.out.println("Test Kilogram Sukses");
    }    
    @Test
    public void testHektogram() {
        Page pg = new Page();
        String expInput = "20";
        pg.HektoGram(expInput);  
        String expResult="200.0 DKG";
        String result = pg.A3.getText();
        assertEquals(expResult, result);
         System.out.println("Test Hektogram Sukses");
    }
    @Test
    public void testDekagram() {
        Page pg = new Page();
        String expInput = "20";
        pg.DekaGram(expInput);
         String expResult="200.0 G";
        String result = pg.A4.getText();
        assertEquals(expResult, result);
         System.out.println("Test Dekagram Sukses");
    }
    @Test
    public void testGram() {
        Page pg = new Page();
        String expInput = "20";
        pg.Gram(expInput);
         String expResult="200.0 DG";
        String result = pg.A5.getText();
        assertEquals(expResult, result);
         System.out.println("Test Gram Sukses");
    }
    @Test
    public void testDesigram() {
        Page pg = new Page();
        String expInput = "20";
        pg.DesiGram(expInput);
         String expResult="200.0 CG";
        String result = pg.A6.getText();
        assertEquals(expResult, result);
         System.out.println("Test Desigram Sukses");
    }
    @Test
    public void testCentigram() {
        Page pg = new Page();
        String expInput = "20";
        pg.CentiGram(expInput);
         String expResult="200.0 MG";
        String result = pg.A7.getText();
        assertEquals(expResult, result);
         System.out.println("Test Centigram Sukses");
    }
    @Test
    public void testMiligram() {
        Page pg = new Page();
        String expInput = "20";
        pg.MiliGram(expInput);
         String expResult="2.0E-5 KG";
        String result = pg.A1.getText();
        assertEquals(expResult, result);
         System.out.println("Test Miligram Sukses");
    }
   
    //Testing Method in Page.java
    @Test
    public void testSelectB() {
        Page pg = new Page();
        pg.selectB1();
        pg.selectB2();
        pg.selectB3();
        pg.selectB4();
        pg.selectB5();
        pg.selectB5();
        pg.selectB7();
         System.out.println("Test Select Button Sukses");
    }
    //Testing for Logic GUI Form Loading
    @Test
    public void testLogic() {
        Logic lg = new Logic();
        String[] args = null;
        lg.main(args);
         System.out.println("Test Logic Sukses");
    }
    //Testing for GUI Form Page.java
    @Test
    public void testPage() {
        Page pg = new Page();
        String[] args = null;
        pg.main(args);
         System.out.println("Test  Page Sukses");
    }
    //Testing for GUI Form Loading.java
    @Test
    public void testLoading() {
        Loading ld = new Loading();
        String[] args = null;
        ld.main(args);
        System.out.println("Test Loading Sukses");
    }
}
