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
//clase principal
public class Radio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //En la clase principal Radio creen un objeto para cada animal y llamen su método haceSonido().
        Pollito pollito= new Pollito(); 
        pollito.haceSonido();
        
        Gallina gallina = new Gallina(); 
        gallina.haceSonido();
        
        Gallo gallo = new Gallo(); 
        gallo.haceSonido();
        
        Pavo pavo = new Pavo(); 
        pavo.haceSonido();
        
        Paloma paloma = new Paloma(); 
        paloma.haceSonido();
        
        Gato gato = new Gato(); 
        gato.haceSonido(); 
             
        Perro perro = new Perro(); 
        perro.haceSonido();
     
        Cabra cabra = new Cabra(); 
        cabra.haceSonido();
        
        Cordero cordero = new Cordero(); 
        cordero.haceSonido(); 
        
        Vaca vaca = new Vaca(); 
        vaca.haceSonido();
        
        Toro toro = new Toro(); 
        toro.haceSonido();
        
        Tractor tractor = new Tractor();
        tractor.haceSonido();
    }
    
}
