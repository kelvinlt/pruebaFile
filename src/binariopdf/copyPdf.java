package binariopdf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class copyPdf {
    public static void main(String[] args) {
        final String ORIG = "xyz.pdf";
        final String DEST = "copiaxyz.pdf";

        try (
                BufferedInputStream bis = new BufferedInputStream(copyPdf.class.getResourceAsStream(ORIG));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(DEST))) {

            byte[] buf = new byte[100];
            int leido = 0;

            while ((leido = bis.read(buf, 0, 100)) > -1) {
                bos.write(buf, 0, leido);
            }

        } catch (Exception e) {

        }
    }
}
