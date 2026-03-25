/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

/**
 *
 * @author RYZEN
 */
import modelo.Gerente;
import modelo.Empleado;
import controlador.NominaController;

public class Herencia {

    public static void main(String[] args) {
        System.out.println("Aprendiendo herencia");
        NominaController control = new NominaController();
        //polimorfismo
        
        control.registrarEmpleados(new Empleado("Yael Botero", 1000));
        control.registrarEmpleados(new Gerente("Yael Botero 2", 5000, 500));
        
        //lista de pagos
        System.out.println("--- Lista de pagos ---");
        for(Empleado emp :control.obtenerLista()){
        //aqui es donde actua el polimorfismo: cada objeto sabe como calcular su pago
        System.out.println("Nombre: "+ emp.getNombre());
        System.out.println("pago: $"+ emp.calcularPago());
        System.out.println("----------------------------------");
        
        //sobrecarga
        
        System.out.println("=prueba de sobrecarga=");
        Empleado busqueda1 = control.buscar("Yael Botero");
        Empleado busqueda2 = control.buscar(1);
        
        System.out.println("prueba de sobrecarga busqueda por nombre : "+ (busqueda1 != null? busqueda1.getNombre():" No existe"));
        System.out.println("prueba de sobrecarga busqueda por indice   : "+ (busqueda2 != null? busqueda1.getNombre():" No existe"));
        }
    }
}
