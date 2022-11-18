/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11_extra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.StringTokenizer; 

/**
 *
 * @author bolys
 */
public class POOP11_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] nombres = {"Julian", "Mariana", "Luis", "Santiago", "Pedro","Antonio", "Aylin", "Javier", "Juan", "Kenia"};
        String[] apellidoP = {"Alcala", "Aceves", "Perez", "Garcia", "Lopez", "Hernandez", "Corro", "Olivos", "Zarco", "Ferreira"};
        String[] apellidoM = {"Alcala", "Aceves", "Perez", "Garcia", "Lopez", "Hernandez", "Corro", "Olivos", "Zarco", "Ferreira"};
        
        Alumno[] alumnos = new Alumno [10];
        
        // Creamos el array de objetos Alumno inicializados
        for (int i = 0; i < 10; i++) {
            Alumno alu = new Alumno(nombres[i], apellidoP[i], apellidoM[9 - i], 319157293, 20, (float) 9.6);
            alumnos[i] = alu;
        }
        
        /**
         * Mandamos los atributos de cada objeto alumno a un archivo ".csv"
         */
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("objetosAlumnos.csv"));
            PrintWriter salida = new PrintWriter(bw);
            
            String data;
            for (int i = 0; i < 10; i++) {
                data = alumnos[i].getNombre() + "," + alumnos[i].getaPaterno() + "," + alumnos[i].getaMaterno() + "," + alumnos[i].getNumCuenta() + "," + alumnos[i].getEdad() + "," + alumnos[i].getPromedio();
                salida.println(data);
            }
            
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(POOP11_EXTRA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /**
         * Aplicamos Tokenización a cada elemento leído del archivo ".csv"
         */
        try{
            BufferedReader br = new BufferedReader(new FileReader("objetosAlumnos.csv"));
            String dataRead = br.readLine();
            System.out.println("La Información en el Archivo sin Tokenizer:");
            
            while (dataRead != null){
                System.out.println(dataRead);
                dataRead = br.readLine();
            }
            br.close();
            
            // Aquí usamos Tokenizer para Tokenizar los Elementos Leidos del Archivo
            System.out.println("\nLa Información en el Archivo con Tokenizer:");
            br = new BufferedReader(new FileReader("objetosAlumnos.csv"));
            dataRead = br.readLine();
            StringTokenizer cadParticion = new StringTokenizer(dataRead, ",");
            
            while (dataRead != null){
                System.out.println("\n" + dataRead);
                while (cadParticion.hasMoreElements()){
                    System.out.println(cadParticion.nextElement());
                }
                dataRead = br.readLine();
                cadParticion = new StringTokenizer(dataRead, ",");
            }
            
            br.close();
        }catch (FileNotFoundException ex) {
            Logger.getLogger(POOP11_EXTRA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(POOP11_EXTRA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
