package polimorfismo;
public class Canario implements IPuedeCantar
{
    @Override
    public void cantar() 
    {
        System.out.println("PIO PIO PIO PIO");
    }
    
}
