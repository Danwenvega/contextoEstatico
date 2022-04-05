package encapsulamiento;

import dominio.Persona;//podemos importar todas las clases del packete con .*

public class Encapsulamiento {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Diovanna", 5000, false);
        System.out.println("persona1 nombre:  = " + persona1.getName());
        persona1.setName("Diovanna Paletta");
        //persona1.nombre ="Diovanna Paletta"; ya no tenemos variables publicas
        //System.out.println("Name: "+ persona1.name); mismo caso qie el anterior
        System.out.println("Persona1 nombre con cambio: " + persona1.getName());
        System.out.println("Persona1 sueldo: " + persona1.getSalary());
        System.out.println("Persona1 eliminated: " + persona1.isEliminated());
        if (persona1.isEliminated() ==true){
           persona1.setFired("Yes");
        }
        else{
            persona1.setFired("No");
        }
        System.out.println("persona1 = " + persona1.toString());
    }
    
}
