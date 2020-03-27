package polimorfismo;
public class ProgramaInterfaz 
{
    public static void main(String[] args) 
    {
        Persona pavaroti=new Persona();//para usar las clases implementadoras se crea un objeto y luego se instacia el metodo donde es llamada la interfaz.
        hacerCantar(pavaroti);
        Canario piolin=new Canario();
        hacerCantar(piolin);
        Burro asno=new Burro();
        hacerCantar(asno);
    }
    public static void hacerCantar(IPuedeCantar cantor) //aqui se hace el llamado a la interfaz y con un metodo para luego usarlo en el metodo principal.
    {
        cantor.cantar();
    }
}
