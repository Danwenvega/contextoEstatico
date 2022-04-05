
package dominio;

public class Persona {
    private String name;
    private String fired;
    private double salary;
    private boolean eliminated;
    
    public Persona (String name, double salary, boolean eliminated ){
        this.name = name;
        this.salary = salary;
        this.eliminated = eliminated;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public boolean isEliminated(){
        return this.eliminated;
    }
    
    public void getEliminated(boolean eliminated){
        this.eliminated = eliminated;
    }
    
    public String getFired(){
        return this.fired;
    }
    
    public void setFired(String fired){
        this.fired = fired;
    }
    
    public String toString(){
        return "Persona (Name: " + this.name +
                ", Persona salary: " + this.salary +
                ", \nPersona eliminated: " + this.eliminated +
                ", Persona is fired: " + this.fired+")";
    }
}
