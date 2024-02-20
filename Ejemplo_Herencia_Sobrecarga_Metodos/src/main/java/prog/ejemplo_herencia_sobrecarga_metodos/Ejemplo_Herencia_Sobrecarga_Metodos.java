/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.ejemplo_herencia_sobrecarga_metodos;

import java.util.Scanner;

/**
 *
 * @author larapresa
 * 
 * En este ejemplo se va a ver la sobrecarga de métodos.
 * 
 * Tenemos la clase padre Empleado.java y la clase hija Jefe.java que hereda de Empleado.java
 * 
 */
public class Ejemplo_Herencia_Sobrecarga_Metodos {

    	public static void main(String[] args) {
		String nombre, departJefe;
		int edad;
		Empleado empleados[];
		Jefe jefes[];
		int numEmp, numJefes;
		
                
                Scanner teclado = new Scanner (System.in);
                System.out.println("Indique los empleados que hay en la empresa: ");
		numEmp = teclado.nextInt();
                teclado.nextLine(); // Limpiamos el salto de línea del buffer 
                // se crean los empleados
		empleados = new Empleado[numEmp];
		
		//System.out.println("\nVamos a insertar los datos de " + numEmp + " empleados: ");
		for (int pos = 0; pos < numEmp; pos++){
                        System.out.println("NOMBRE: ");
			nombre = teclado.nextLine();
                        System.out.println("EDAD: ");
			edad = teclado.nextInt();
                        teclado.nextLine(); // Limpiamos el salto de línea del buffer 
			empleados[pos] = new Empleado(nombre, edad);
		}
		
                System.out.println("Indique el número de jefes que hay en la empresa: ");
                
		numJefes = teclado.nextInt();
                teclado.nextLine(); // Limpiamos el salto de línea del buffer
                //se crea un array con el número de jefes
		jefes = new Jefe[numJefes];
		
		//System.out.println("\nVamos a insertar los datos de " + numJefes + " jefes: ");
		for (int pos = 0; pos < numJefes; pos++){
                        
			System.out.println("NOMBRE: ");
			nombre = teclado.nextLine();
                        System.out.println("EDAD: ");
			edad = teclado.nextInt();
                        teclado.nextLine(); // Limpiamos el salto de línea del buffer 
                        System.out.println("DEPARTAMENTO: ");
			departJefe = teclado.nextLine();
			jefes[pos] = new Jefe(nombre, edad, departJefe);
		}
		visualtodosJefes(jefes);
		visualtodosEmpleados(empleados);
                teclado.close();
	}

	static void visualtodosEmpleados(Empleado empleados[]) {
		int pos;
		System.out.println("\n***************************************************************");
		System.out.println("Los datos de los empleados (que no son jefes) en la empresa son: ");
		System.out.println("\n***************************************************************");
		for (pos = 0; pos < empleados.length; pos++) {
			empleados[pos].imprimeTodo();
			System.out.println("__________________________________________________________");
			
		}
	}

	static void visualtodosJefes(Jefe jefes[]) {
		int pos;
		System.out.println("\n**************************************************");
		System.out.println("Los datos de los jefes que hay en la empresa son: ");
		System.out.println("\n**************************************************");
		for (pos = 0; pos < jefes.length; pos++) {
			jefes[pos].imprimeTodo();
			System.out.println("__________________________________________________________");		
		}
	}
}
