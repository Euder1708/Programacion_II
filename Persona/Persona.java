public class Persona {
    String nombre;
    int edad;
    public void Birthday (){
      this.edad++;
      System.out.println("el estudiante cumple años "+edad);
    }
    public void decirNombre (){
    System.out.println("mi nombre es "+ this.nombre);
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
