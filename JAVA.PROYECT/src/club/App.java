package club;
import personas.Empleado;
import eventos.Eventos;
import personas.Miembro;

public class App {
    
    public static void main(String[] args) throws Exception {
        Empleado empleado=new Empleado("pollito acesino", 17);
        Miembro miembro = new Miembro("colita de melon ", 18);
    
     Eventos enentoUno= new Eventos("a las 6 de la tarde don sec a ya se va ", miembro, empleado);
     System.out.println(empleado.getBono());
  
     
    }
    public  static Eventos crearEvento(String fecha, Empleado empleado, Miembro miembro){
        if (miembro.getLimite()<=0){
            System.out.println("no se puede creara el evento");
          return new Eventos();
        }
                return null;
    }

}
