/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11_extra;

/**
 *
 * @author bolys
 */
public class Alumno {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private int numCuenta;
    private int edad;
    private float promedio;

    public Alumno() {
    }
    
    /**
     * Constructor 
     * @param nombre
     * @param aPaterno
     * @param aMaterno
     * @param numCuenta
     * @param edad
     * @param promedio 
     */
    public Alumno(String nombre, String aPaterno, String aMaterno, int numCuenta, int edad, float promedio) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
    }

    /**
     * Retorna el valor de 'Nombre'
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que establece (modifica) el valor de 'Nombre'
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Retorna el valor de aPaterno (apellido paterno)
     * @return 
     */
    public String getaPaterno() {
        return aPaterno;
    }
    
    /**
     * Método que establece (modifica) el valor de 'aPaterno' (apellido paterno)
     * @param aPaterno 
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }
    
    /**
     * Retorna el valor de aMaterno (apellido Materno)
     * @return 
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * Método que establece (modifica) el valor de 'aMaterno' (apellido Materno)
     * @param aMaterno 
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    /**
     * Retorna el valor de 'NumCuenta'
     * @return 
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    
    /**
     * Método que establece (modifica) el valor de 'NumCuenta'
     * @param numCuenta 
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    /**
     * Retorna el valor de 'Edad'
     * @return 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece (modifica) el valor de 'Edad'
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Retorna el valor de 'Promedio'
     * @return 
     */
    public float getPromedio() {
        return promedio;
    }
    
    /**
     * Método que establece (modifica) el valor de 'Promedio'
     * @param promedio 
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", numCuenta=" + numCuenta + ", edad=" + edad + ", promedio=" + promedio + '}';
    }
}
