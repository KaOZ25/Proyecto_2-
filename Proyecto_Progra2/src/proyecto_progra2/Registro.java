package proyecto_progra2;
public class Registro {
    private String usuario,contraseña,nombre;

    public Registro(String usuario, String contraseña, String nombre) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Registro{" + usuario + ", contrase\u00f1a=" + contraseña +  ", nombre=" + nombre + '}';
    }
    
   
}
