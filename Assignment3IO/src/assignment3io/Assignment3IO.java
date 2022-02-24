/*
Tarea EmailParser
 */
package assignment3io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marlette Gpe. Arvayo Ortega
 */
public class Assignment3IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Utils util = new Utils();
        String linea = "";
        linea = "input.txt";
        int opcion = -1;
        ArrayList<Email> EmailsArray = util.getEmails(util.convertFileToString(linea));
        String Emails = "";
        while (opcion != 9) {
            opcion = util.displayMessageEnterTypeEmails();
            if (opcion > 0 && opcion < 8) {
                //funcion para code
                Emails = util.getEmailsByCode(opcion, EmailsArray);
            } else {
                //funcion para subdominios
                if (opcion == 0) {
                    Emails = util.getEmailbySubDominio(false, EmailsArray);
                } else {
                    if(opcion==8){
                    //traer correos con subdominios
                        Emails = util.getEmailbySubDominio(true, EmailsArray);
                    }
                    else{
                        break;
                    }
                }

            }
            System.out.println(Emails);
            util.writeFile("out.txt", Emails);
        }

    }
}
