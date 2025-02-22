package eventos;
import personas.Empleado;
import personas.Miembro;
public class Eventos {
    
    private String fecha ;

    private Miembro solicitante;
    
    private Empleado organizador;

    public Eventos(String fecha, Miembro solicitante, Empleado organizador) {
        organizador.addBono();
        solicitante.restarLimite();
        this.fecha = fecha;
        this.solicitante = solicitante;
        this.organizador = organizador;

    }

    public Eventos() {
        //TODO Auto-generated constructor stub
    }
    public void mostrarInfo(){
        System.out.println("---------------datos del evento---------");
        System.out.println("Fecha"+ this.fecha);
        System.out.println("Empleado"+this.organizador.getNombre());
        System.out.println("solicitante"+this.solicitante.getNombre());
    }
        
}
