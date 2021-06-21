package proyecto_progra2;

import java.util.ArrayList;

public class Alumno extends Registro{
    private int cuenta;
    private String carrera;
    private ArrayList <clases> clases;
    public Alumno(String usuario, String contraseña, String nombre) {
        super(usuario, contraseña, nombre);
    }

    public Alumno(String usuario, String contraseña, String nombre,int cuenta, String carrera) {
        super(usuario, contraseña, nombre);
        this.cuenta = cuenta;
        this.carrera = carrera;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() + "cuenta=" + cuenta + ", carrera=" + carrera +'}';
    }
    
   
    
}
