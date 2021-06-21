package proyecto_progra2;

import java.util.ArrayList;

public class clases {
    private String ID;
    private String nombre;
    private String hora;
    private int UV;
    private String Semestre;
    private int periodo;
    private int año;
    public clases(String ID, String nombre, String hora, int UV, String Semestre, int periodo, int año) {
        this.ID = ID;
        this.nombre = nombre;
        this.hora = hora;
        this.UV = UV;
        this.Semestre = Semestre;
        this.periodo = periodo;
        this.año = año;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getUV() {
        return UV;
    }

    public void setUV(int UV) {
        this.UV = UV;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "clases{" + "ID=" + ID + ", nombre=" + nombre + ", hora=" + hora + ", UV=" + UV + ", Semestre=" + Semestre + ", periodo=" + periodo + ", a\u00f1o=" + año + '}';
    }
    
}
