/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */

/**
 *Clase Padre abstracta que tiene atributos en común entre
 *los diferentes tipos de empleados
 *
 *Se implementa el método abstracto calcularSalarioFinal
 *que será implementado en cada clase hija
*/
public abstract class Empleado {
    
    //Atributos
    private int codigo;
    private String cedula;
    private String nombre;
    private Date fechaContratacion;
    private double salario;

    
    //Constructores
    public Empleado() {
    }

    public Empleado(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }

    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + '}';
    }
    
    //Metodo Abstracto --> Calcular el salario final
    public abstract double calcularSalarioFinal();
         
    
}
