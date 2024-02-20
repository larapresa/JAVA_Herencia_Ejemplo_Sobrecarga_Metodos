/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_herencia_sobrecarga_metodos;

import java.util.Scanner;

/**
 *
 * @author larapresa
 */
public class Empleado {
        // ATRIBUTOS
	private String nombre;
	private int edad;

        // CONSTRUCTOR
	public Empleado(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
         // MÉTODOS
	public void pedirDatos() {
                Scanner teclado = new Scanner (System.in);
		System.out.println("\nVamos a insertar los datos del empleado: ");
                System.out.println("NOMBRE");
		nombre = teclado.nextLine();
                 System.out.println("EDAD");
		edad = teclado.nextInt();
                teclado.nextLine(); // Limpiamos el salto de línea del buffer 
                teclado.close();
	}


	public void setNombre(String nombre){	
		this.nombre=nombre;
	}
	
	public void setTodo(String nombre,int edad){
		this.nombre=nombre;
		this.edad=edad;
		}
        
	public void imprimeNombre(){
		System.out.print("\n\t\tNOMBRE " + nombre);
		
	}
	
	public void imprimeEdad(){
		System.out.println("\n\t\tEDAD: " + edad);

	}
        // ------------------------------------------------------------
        // Este método es el que vamos a sobreescribir en la clase Jefe
        // ya que necesitamos que también imprima el departamento del que 
        // es jefe
        // ------------------------------------------------------------
	public void imprimeTodo(){
		imprimeNombre();
		imprimeEdad();		
	}
}