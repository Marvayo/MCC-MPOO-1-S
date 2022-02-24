/*
Implementar los conceptos vistos "clases, objetos, herencia, etc..." 
simulando que los animales de la canción "el pollito pío" descienden de una clase
llamada Animal que tiene que ser abstracta y tener un metodo abstracto         - 
"haceSonido()" que tendra que ser implementado en cada hijo, asi cada clase hija
tendrá su propio método "haceSonido()" de manera obligatoria

La clase principal se debe llamar "Radio" para que se cumpla que               -
"en la radio hay un pollito". No se trata de simular la letra de la canción pero 
si lo hacen tampoco está mal, se trata de que de la letra tomen los animales que 
heredarán de la clase abstracta Animal y tomen el sonido que cada animal hace. 

En la clase principal Radio creen un objeto para cada animal y llamen su método- 
haceSonido().
 */
package radio;

/**
 *
 * @author Marlette Gpe. Arvayo Ortega
 */
//clase hija
public class Tractor extends Animal{
//propio método haceSonido    
    @Override
    public void haceSonido(){
        System.out.println("Bruum");
    }
}
