public class Estudiante extends Persona{
  double notas;

public Estudiante(String nombre, int edad, double notas) {
    super(nombre, edad);
    this.notas = notas;
} 
@Override
public void decirNombre (){
    System.out.println("me llamo "+super.nombre + "y mi nota es "+this.notas);
}
    
}
