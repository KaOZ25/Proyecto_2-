package proyecto_progra2;
public class Maestro extends Registro{
   private int ID;
   private String Profesion;
   private int sueldo;
   
    public Maestro(String usuario, String contraseña, String nombre) {
        super(usuario, contraseña, nombre);
    }

    public Maestro(String usuario, String contraseña, String nombre,int ID, String Profesion, int sueldo) {
        super(usuario, contraseña, nombre);
        this.ID = ID;
        this.Profesion = Profesion;
        this.sueldo = sueldo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Maestro{"+  super.toString() + "ID=" + ID + ", Profesion=" + Profesion + ", sueldo=" + sueldo +'}';
    }
   
   
    
}
