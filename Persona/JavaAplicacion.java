public class JavaAplicacion {

public static void main(String[] args) {
    Persona persona= new Persona (" juan", 6);
Estudiante estudiante=new Estudiante("pepe", 15, 4.5  );
Docente docente= new Docente("Jose", 22, 1000); 

System.out.println("docente ");
docente.decirNombre();
docente.Birthday();

System.out.println(" estudiante");
estudiante.Birthday();
estudiante.decirNombre(); 

System.out.println("persona ");
persona.Birthday();
persona.decirNombre();
}
}