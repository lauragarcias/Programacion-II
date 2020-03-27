package polimorfismo;
public class Persona implements IPuedeCantar
{
    @Override
    public void cantar() 
    {
        System.out.println("DO RE MI FA SO LA SIII");
    }
    
    
}
