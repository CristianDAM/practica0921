
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }

    public void fijarHora (int horaAFijar, int minutosAFijar){
        horas.setValue(horaAFijar);
        minutos.setValue(minutosAFijar);
    
    
    
    }
    public void avanzarMinutos(){
        minutos.increment();
        if(minutos.getValue() == 0){
            horas.increment();
           
        
        }
    }
    public String mostrarHora(){
		return horas.getDisplayValue() + "-" + minutos.getDisplayValue();



	}
    
}        
    
    

