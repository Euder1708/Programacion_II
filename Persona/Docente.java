public class Docente  extends Persona {
    double sueldo;
    
    
    
    /**
     * crear el objetod el docente 
     * @param nombre : nombre del docente 
     * @param edad : edad del docente 
     * @param sueldo : valor  a pagar a el docente 
     */

    public Docente(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }
    @Override
    public void decirNombre(){
        System.out.println("My name is " + super.nombre + "y gano de sueldo"+ this.sueldo);
    }
    
}
