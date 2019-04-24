/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.EmpleadoPorAsalariado;
import ec.edu.ups.clases.EmpleadoPorComision;
import ec.edu.ups.clases.EmpleadoPorHoras;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Domenika Delgado
 */
public class Main {
    
    public static void main(String[] args) {
        
        List <Empleado> lista = new ArrayList<>();
        
        
        GregorianCalendar fechaContratacionPepito = new GregorianCalendar(2011, 0, 5);
        EmpleadoPorAsalariado empleadoPepito = new EmpleadoPorAsalariado(1, "1717272727", "Pepito", fechaContratacionPepito.getTime(), 500);
        double salarioFinalPepito = empleadoPepito.calcularSalarioFinal();
        System.out.println("Salario final de Pepito: " + salarioFinalPepito);
        
        GregorianCalendar fechaContratacionJuanito = new GregorianCalendar(2015, 0, 5);
        EmpleadoPorHoras empleadoJuanito = new EmpleadoPorHoras(2, "1717171717", "Juanito", fechaContratacionJuanito.getTime(), 350);
        empleadoJuanito.setCostoHoraExtra(10);
        empleadoJuanito.setNumeroHorasExtra(15);
        double salarioFinalJuanito = empleadoJuanito.calcularSalarioFinal();
        System.out.println("Salario final de Juanito: " + salarioFinalJuanito);
        
        GregorianCalendar fechaContratacionMaria = new GregorianCalendar(2017, 0, 5);
        EmpleadoPorComision empleadaMaria = new EmpleadoPorComision(3, "1717273434", "María", fechaContratacionMaria.getTime(), 450);
        empleadaMaria.setVentasMensuales(1200);
        double salarioFinalMaria = empleadaMaria.calcularSalarioFinal();
        System.out.println("Salario final de Maria: " + salarioFinalMaria);
        
        
        lista.add(empleadoPepito);
        lista.add(empleadoJuanito);
        lista.add(empleadaMaria);
        
        for (Empleado empleado : lista) {
            if(empleado instanceof EmpleadoPorAsalariado){
                EmpleadoPorAsalariado e= (EmpleadoPorAsalariado) empleado;                
            }else if( empleado instanceof EmpleadoPorComision){
                EmpleadoPorComision e = (EmpleadoPorComision) empleado;
            }else if (empleado instanceof EmpleadoPorHoras){
                EmpleadoPorHoras e = (EmpleadoPorHoras) empleado;
            }            
        }
        
        Empleado empleadoAnonimo = new Empleado(4, "04040404040", "Anonimo Perez", fechaContratacionPepito.getTime(), 250){
            @Override
            public double calcularSalarioFinal() {
                return this.getSalario() + 50;
            }
        };
        
        System.out.println(empleadoAnonimo);
    }
}
