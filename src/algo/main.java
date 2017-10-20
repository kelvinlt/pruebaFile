package algo;

import java.io.*;

public class main {
    static final String fichero="prueba.txt";
    static final int EOF = -1;

    public static void main(String[] args){
        FileReader fr = null;
        BufferedReader bfr = null;
        StringBuilder builder = new StringBuilder();
        StringWriter sw = new StringWriter();

        try {
            fr = new FileReader(fichero);
            bfr = new BufferedReader(fr);
            int linea = 0;

            int caracter = 0;

            while ((caracter = fr.read()) !=EOF){
                System.out.print((char)caracter);
                builder.append((char)caracter);
            };
            System.out.println("");


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fr != null){
                try {
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
    public static void encriptar(String text, int number) {
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String temporal = "";
        int length = text.length();
        for (int i = 0; i < length; i++) {

        }
    }
}
