
package proyecto_progra2;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class adminclases {
    private ArrayList<clases> lista= new ArrayList();
    private File archivo = null;
     public adminclases(String path) {
        archivo = new File(path);
    }
     public ArrayList<clases> getLista() {
        return lista;
    }

    public void setLista(ArrayList<clases> lista) {
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
      public void setClases(clases p) {
        this.lista.add(p);
    }
       public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (clases t : lista) {
                bw.write(t.getID() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getHora() + ";");
                bw.write(t.getUV() + ";");
                bw.write(t.getSemestre() + ";");
                bw.write(t.getPeriodo() + ";");
                 bw.write(t.getAño() + ";");
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
                    lista.add(new clases (sc.next(),
                                    sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
