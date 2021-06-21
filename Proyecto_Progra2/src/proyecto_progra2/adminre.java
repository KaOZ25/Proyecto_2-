package proyecto_progra2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class adminre {

    private ArrayList<Registro> lista= new ArrayList();
    private File archivo = null;
    
     public adminre(String path) {
        archivo = new File(path);
    }

    public ArrayList<Registro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Registro> lista) {
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
      public void setRegistro(Registro p) {
        this.lista.add(p);
    }
      public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Registro t : lista) {
                bw.write(t.getUsuario() + ";");
                 bw.write(t.getContraseña() + ";");
                bw.write(t.getNombre() + ";");
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
                    lista.add(new Registro(
                                    sc.next(),
                                    sc.next(),
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
