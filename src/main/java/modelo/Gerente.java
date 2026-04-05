/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author RYZEN
 */
public class Gerente extends Empleado {
    private double bono;
    
    public Gerente(String nombre, double salarioBase , double bono) {
            super(nombre, salarioBase); //herencia del constructor
            this.bono = bono;
    }
    
    @Override
    public double calcularPago(){
    return salarioBase +bono;    
        
        
        
        }
    }


