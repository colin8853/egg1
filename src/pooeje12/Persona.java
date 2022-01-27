/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nico
 */
public class Persona {
    private String nombre;
    private Date fechaDeNacimiento;
    Scanner leer = new Scanner(System.in);

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Persona" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento ;
    }
    
    public Persona crearPersona(Persona persona){
        int dia,mes,ano;
         DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ingrese nombre");
            nombre = leer.nextLine();
            persona.setNombre(nombre);
            System.out.println("Ingrese su año de nacimiento");
            ano = leer.nextInt();
            System.out.println("Ingrese su mes de nacimiento");
            mes = leer.nextInt();
            System.out.println("Ingrese el dia de su nacimiento");
            dia = leer.nextInt();
            Date fecha = new Date(ano-1900, mes-1, dia);
            System.out.println("la fecha de nacimiento en formato fecha es : " + fecha);
            String fechaN = sdf.format(fecha);
            persona.setFechaDeNacimiento(fecha);
            System.out.println("la fecha de nacimiento en formato sdf es : " + fechaN);
            System.out.println(persona.getFechaDeNacimiento().getYear());
            return new Persona(nombre,fechaDeNacimiento);
    }
   
    public void calcularEdad(Persona persona){
        int edad;
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println(fechaActual.getYear()+1900);
        int anoActual=fechaActual.getYear()+1900;
        System.out.println(anoActual);
        edad = anoActual - (persona.getFechaDeNacimiento().getYear()+1900);
        System.out.println(edad);
    }
    
    public boolean menorQue (int edad){
        boolean esMenorQue = true;
        Date fecha = new Date ();
        int edadPersona = fecha.getYear() - fechaDeNacimiento.getYear();
        if (edadPersona < edad){
            System.out.println("es menor");
            return esMenorQue;
        }
        else{
            System.out.println("es mayor");
            return esMenorQue=false;
        }
    }
   
    public void mostrarPersona (Persona Persona){
        System.out.println("el nombre es:"+ Persona.getNombre()+" la fecha de nacimiento es:"+Persona.getFechaDeNacimiento());
    }
   
}
