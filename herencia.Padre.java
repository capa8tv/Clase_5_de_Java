
package herencia;

import interfaces.Interface1;

abstract class Padre implements Interface1{
    
    protected String nombre;
    protected String correo;
    
    Padre()
    {
        this.nombre="César Cancino";
        this.correo="yo@cesarcancino.com";
    }
    Padre(String nombre,String correo)
    {
        this.nombre=nombre;
        this.correo=correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
