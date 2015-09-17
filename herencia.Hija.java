package herencia;

public class Hija extends Padre {
    
    Hija()
    {
        super("Juan Pérez","juanito@gmail.com");
    }
    Hija(String nombre,String correo)
    {
        super(nombre,correo);
    }
    
    public static void main(String[]args)
    {
        //Padre p=new Padre();
        Hija h=new Hija("Eduardo López","edu@hotmail.com");
        System.out.println("El nombre es : "+h.getNombre());
        h.setNombre("Marcelo Ñandú");
        System.out.println("El nombre es : "+h.getNombre());
    }
    
    /*
    @Override
    public String getNombre() {
        return "mi edificio aun se mueve con el terremoto";
    }
    */
}
