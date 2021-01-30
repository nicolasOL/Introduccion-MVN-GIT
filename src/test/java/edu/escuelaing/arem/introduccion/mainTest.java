/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion;

import edu.escuelaing.arem.introduccion.linkedlist.LinkedList;
import static edu.escuelaing.arem.introduccion.main.run;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas Ortega
 */
public class mainTest {
    
    public mainTest() {
    }
   
    /**
     * Test of standardDeviation method, con el set de datos numero 2.
     */
    @Test
    public void testStandardDeviation() {
        try {
            System.out.println("standardDeviation");
            LinkedList lista=new LinkedList();
            Scanner scanner = new Scanner(new File("src/test/input/input-2.txt"));
            ArrayList<Double> number = new ArrayList<>();
            while(scanner.hasNextInt()){
                number.add(scanner.nextDouble());
            }
            for (int j=0;j<number.size();j++){
                Double a = number.get(j);
                lista.add(a);
            }
            double expResult = 625.6339806770231;
            double result = main.standardDeviation(lista);
            assertEquals(expResult, result, 0.0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of mean method, con el set de datos numero 1.
     */
    @Test
    public void testMean() {
        try {
            System.out.println("mean");
            LinkedList lista=new LinkedList();
            Scanner scanner = new Scanner(new File("src/test/input/input-1.txt"));
            ArrayList<Double> number = new ArrayList<>();
            while(scanner.hasNextInt()){
                number.add(scanner.nextDouble());
            }
            for (int j=0;j<number.size();j++){
                Double a = number.get(j);
                lista.add(a);
            }
            double expResult = 550.6;
            double result = main.mean(lista);
            assertEquals(expResult, result, 0.0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
