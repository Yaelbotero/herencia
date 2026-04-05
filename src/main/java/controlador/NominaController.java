/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author RYZEN
 */
import modelo.Empleado;
import modelo.Gerente;
import java.util.ArrayList;

public class NominaController {

    private ArrayList<Empleado> listaEmpleados;
    //crear atributos

    public NominaController() {
        this.listaEmpleados = new ArrayList<>();
    }

    //registro de empleados:
    public void registrarEmpleados(Empleado e) {
        listaEmpleados.add(e); //se registra la lista de empleados, se llena de esta forma
    }
        //sobrecarga:
    public Empleado buscar(String nombre) {
        for (Empleado e : listaEmpleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }

        }
        return null;
    }

    //sobrecarga: buscar por la posicion de la lista:
    public Empleado buscar(int indice) {
        if (indice >= 0 && indice < listaEmpleados.size()) {
            return listaEmpleados.get(indice);
        }
        return null;
    }

    public ArrayList<Empleado> obtenerLista() {
        return listaEmpleados;
    }

}
