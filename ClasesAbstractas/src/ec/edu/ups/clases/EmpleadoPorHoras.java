/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class EmpleadoPorHoras extends Empleado {
    
    //Atributos
    private int numeroHorasExtra;
    private double costoHoraExtra;

    //Constructores
    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
    }        

    public EmpleadoPorHoras(int numeroHorasExtra, double costoHoraExtra, int codigo, String cedula, String nombre, Date fechaContratacion, double salario) {
        super(codigo, cedula, nombre, fechaContratacion, salario);
        this.numeroHorasExtra = numeroHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    public EmpleadoPorHoras(int numeroHorasExtra, double costoHoraExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
        this.costoHoraExtra = costoHoraExtra;
    }

    //Getters & Setters
    public int getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(int numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public double getCostoHoraExtra() {
        return costoHoraExtra;
    }

    public void setCostoHoraExtra(double costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }
    
    @Override
    public double calcularSalarioFinal() {
        return super.getSalario() + (numeroHorasExtra * costoHoraExtra);
    }

    
}
