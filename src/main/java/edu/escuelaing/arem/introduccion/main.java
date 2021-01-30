/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.introduccion;

import edu.escuelaing.arem.introduccion.linkedlist.LinkedList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Clase principal encargada de hacer la lectura de los archivos de texto y delegacion de las funciones
 * @author Nicolas Ortega
 */
public class main {
    private static final LinkedList lista=new LinkedList();
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException{
        //Inspired by: https://www.codegrepper.com/code-examples/java/java+read+integer+from+text+file+into+array+scanner
        Scanner scanner = new Scanner(new File("src/test/input/input-2.txt"));
        ArrayList<Double> number = new ArrayList<>();
        while(scanner.hasNextInt()){
             number.add(scanner.nextDouble());
        }
        for (int j=0;j<number.size();j++){
            Double a = number.get(j);
            lista.add(a);            
        }     
        run();
    }
    
    /**
     * 
     */
    public static void run (){
        System.out.println("MEAN: ");
        System.out.println(mean(lista));
        System.out.println("Standard Deviation: ");
        System.out.println(standardDeviation(lista));    
    }
    
    /**
     * @param lista
     * @return el valor calculado de la desviacion estandar
     */
    public static double  standardDeviation(Collection<Double> lista){
        Double mean=Calculator.mean(lista);
        return Calculator.standardDeviation(lista,mean);
    }
    
    /**
     * @param lista
     * @return el valor calculado de la media
     */
    public static double mean (Collection<Double> lista){
        return Calculator.mean(lista);
    }
}
