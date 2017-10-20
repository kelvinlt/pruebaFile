package pruebaRead;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class pruebaUno {
    static File file = new File("prueba.txt");
    static File directory1 = new File("kek");
    static File[] listaDirectory1 = directory1.listFiles();
    static String buscador ;
    static File buscadorFile =new File("");
    static File[] listaBuscadorFile;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Escibre el nombre del fichero o documento:");
            buscador = br.readLine();
            buscadorFile = new File(buscador);
            existe(buscadorFile);


        } catch (Exception e) {
        }
    }

    public static void existe(File directorio) {
        if (directorio.exists()) {
            if (directorio.isFile()) {
                System.out.println(directorio + " es un documento de texto");
            }
            if (directorio.isDirectory()) {
                System.out.println(directorio + " es un directorio");
                toFileArray(directorio);
                showListTerminal(listaBuscadorFile);
            }
        } else {
            System.out.println(directorio + " no existe el fichero/documento");
        }
    }

    public static void showListTerminal(File[] list) {
        System.out.println("Se ha imprimido la siguiente lista dentro de la carpeta insertada:");
        for (File i : list) {
            System.out.println("- " + i);
        }

    }
    public static void toFileArray(File directorio){
       listaBuscadorFile = directorio.listFiles();
    }
}
