/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class EmpleadoPorComision extends Empleado {
    
    //Atributos
    private double ventasMensuales;

    //Constructor
    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
    
    public EmpleadoPorComision(double ventasMensuales, int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
        this.ventasMensuales = ventasMensuales;
    }

    //Constructor Padre
    public EmpleadoPorComision(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
    }

    //Getters & Setters
    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    /*
    * Metodo CalcularSalarioFinal
    * Si el empleado realizo ventas superiores entre $500 & $1000
    * se le ortorga una comision del 10% sobre las ventas mensuales
    *
    * Si el empleado realizo ventas superiores entre $1001 & $5000
    * se le ortorga una comision del 15% sobre las ventas mensuales
    *
    * Si el empleado realizo ventas superiores a $5001
    * se le ortorga una comision del 20% sobre las ventas mensuales
    */
    
    @Override
    public double calcularSalarioFinal() {
        if (ventasMensuales >= 500 && ventasMensuales <= 1000) {
            return super.getSalario() + (ventasMensuales * 0.10);
        } else if (ventasMensuales > 1000 && ventasMensuales <= 5000) {
            return super.getSalario() + (ventasMensuales * 0.15);
        } else if (ventasMensuales > 5000) {
            return super.getSalario() + (ventasMensuales * 0.20);
        } else {
            return super.getSalario();
        }
    }
    
}
