/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_herencia_sobrecarga_metodos;

/**
 *
 * @author larapresa
 */
/**
 * ------------------------
 * JEFE HEREDA DE EMPLEADO
 * ------------------------
 * Este ejemplo muestra la sobrecarga de método.
 * Jefe hereda de Empleado el método public void imprimeTodo()
 * Jefe puede REESCRIBIR el método  public void imprimeTodo() definiendo aquí 
 * de nuevo el método
 */


public class Jefe extends Empleado {
	private String departJefe;

	public Jefe(String nombre,int edad, String departJefe) {
		super(nombre, edad);
		this.departJefe=departJefe;
	}
	
	public void imprimeDepart(){
		System.out.println("\t\tEJERCE LA JEFATURA DE: " + departJefe);
	}

        //Aquí SOBREESCRIBIMOS el método imprimeTodo() que tiene la clase Empleado
        /**
         * El método en la clase Empleado es así:
         * public void imprimeTodo(){
         *     indicaTipoPersonal();
         *     imprimeNombre();
         *     imprimeEdad();		
         * }
         */
	public void imprimeTodo(){ // RECUERDA: para sobreescribirlo debe de llamarse igual y tener el mismo número de parámetros (en este caso ninguno)
		
		super.imprimeTodo(); // Llamamos al método imprimeTodo() de la clase padre (Empleado.java), empleando SUPER
		imprimeDepart(); // La sobrescritrua del método nos permite mostrar la información del departamento (exclusiva de la clase Jefe)
	}
	
}
