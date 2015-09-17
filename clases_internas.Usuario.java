
package clases_internas;

import interfaces.Interface1;


public class Usuario {
    
    public static void main(String[] args) 
    {
        Usuario u=new Usuario();
        System.out.println("el valor es :"+u.retorna());
    }
    
    /**
     * clase interna
     * privadas 
     */
    
    public String retorna()
    {
        Interna i=new Interna();
        return i.getTexto();
    }
    
 private class Interna implements Interface1
 {
     public String getTexto()
        {
            return "hola interna";
        }

        @Override
        public String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setNombre(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getCorreo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setCorreo(String correo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
 }
    
}
