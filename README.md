# JAVA_Herencia_Ejemplo_Sobrecarga_Metodos

En este ejemplo se va a ver la sobrecarga de métodos.
Tenemos la clase padre Empleado.java y la clase hija Jefe.java que hereda de Empleado.java

La clase Empleado.java dispone del método 

public void imprimeTodo() {
        imprimeNombre();
        imprimeEdad();
    }

Jefe.java hereda este método y puede acceder a él ya que es público. El problema es que este método no muestra la información del departamento al que pertenece un jefe, ya que ese atributo es exclusivo de la clase Jefe.java. 

Como este método sí que muestra la información de nombre y edad, un opción posible es sobreescribirlo en la clase hija (Empleado.java) añadiendo que muestre la info del departamento.

**Recuerda**
- Las modificaciones hechas en la clase hija afectan solo a la clase hija y a las clases que hereden de ésta, en ningún caso afectan a la clase padre.
- Cuando sobreescribimos un método: El tipo de dato que devuelve debe de ser el mismo para los dos métodos. El nombre del método debe ser el mismo. Los argumentos deben de ser los mismos y del mismo tipo. 
- Por defecto, si dentro de la clase derivada llamamos al método sobrescrito, se ejecuta el método de la clase derivada. Si queremos ejecutar el método sobrescrito de la clase base, hay que usar la instrucción super


