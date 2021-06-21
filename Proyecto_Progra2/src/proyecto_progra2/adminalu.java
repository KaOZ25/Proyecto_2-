package proyecto_progra2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class adminalu {

    private ArrayList<Alumno> lista = new ArrayList();
    private File archivo = null;

    public adminalu(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alumno> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admin{" + "lista=" + lista + '}';
    }

    public void setAlumno(Alumno p) {
        this.lista.add(p);
    }

    public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Alumno t : lista) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getCuenta() + ";");
                bw.write(t.getCarrera() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new Alumno(
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
