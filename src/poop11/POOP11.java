/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu29
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno = new Alumno();
        System.out.println("############# File ##############");
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        boolean seCreo;
        try {
            seCreo = archivo.createNewFile();
            System.out.println(seCreo);
            System.out.println(archivo.exists());
            
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("############# FileWriter ##############");
        try {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Escribe texto para el archivo: ");

            String texto = br.readLine();
            
            System.out.println(texto);
            
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("############# FileWriter ##############");
        
        try {
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Esto es una impresion de texto en el archivo");
            salida.println("Segunda linea.");
            for (int i = 0; i < 10;i ++){
                salida.println("Linea escrita por el editor."+i);
            }
            salida.close();
            
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("############# FileReader ##############");
        try {
            FileReader fr = new FileReader("fw.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("############# Alumnos ##############");
        System.out.println("############# FileWriter ##############");
        
        try {
            FileWriter fw = new FileWriter("listaAlumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Orihuela,Arellano,Santiago,319252903,20,8.81");
            
            salida.close();
            
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("############# FileReader ##############");
        try {
            FileReader fr = new FileReader("listaAlumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            System.out.println(linea);
            
            System.out.println("#############StringTokenizer#############");
            StringTokenizer tokenizador = new StringTokenizer(linea,",");
            while(tokenizador.hasMoreTokens()){
                System.out.println(tokenizador.nextToken());
                
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
