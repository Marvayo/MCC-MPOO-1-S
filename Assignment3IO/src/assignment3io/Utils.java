/**
 *
 * @author Hazael Gomez Encinas
 */
package assignment3io;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils implements UtilsInterface {

    public ArrayList<Email> getEmails(String paragraph) {
        ArrayList<Email> EmailsArray = new ArrayList<Email>();
        Pattern pattern = Pattern.compile("[\\w.]+@[\\w.]+");
        Matcher matcher = pattern.matcher(paragraph);
        while (matcher.find()) {
            String email = matcher.group();
            int index = email.indexOf('@');
            String username = email.substring(0, index);
            String domain = email.substring(username.length() + 1);   //I use the lenght of the username + 1 to remove also the @ symbol
            String[] parts = domain.split("\\.");
            if (parts.length == 2) {
                EmailsArray.add(new Email(username, parts[0], parts[1]));
            } else if (parts.length == 3) {
                EmailsArray.add(new UniversityEmail(username, parts[1], parts[2], parts[0], UniversityEmail.getCodeByString(parts[0])));
            }
        }
        return EmailsArray;
    }

    // lo siguiente se tomó del video del maestro  
    public String getEmailsByCode(int code, ArrayList<Email> EmailsArray) {
        String email = "";
        for (int i = 0; i < EmailsArray.size(); i++) {
            if (EmailsArray.get(i).getCode() == code) {
                email = email + EmailsArray.get(i).toString() + "\n";
            }
        }
        return email;
    }

    public String getEmailbySubDominio(boolean SubDominio, ArrayList<Email> EmailsArray) {
        String email = "";
        for (int i = 0; i < EmailsArray.size(); i++) {
            if (SubDominio == false) {
                if ("".equals(EmailsArray.get(i).getSubdominio())) {
                    email = email + EmailsArray.get(i).toString() + "\n";
                }
            } else {
                if (!"".equals(EmailsArray.get(i).getSubdominio())) {
                    email = email + EmailsArray.get(i).toString() + "\n";
                }
            }
        }
        return email;
    }

    public int displayMessageEnterTypeEmails() {
        Scanner kw = new Scanner(System.in);
        System.out.println("Porfavor seleccione que quieres hacer para poner en el archivo de salida");
        System.out.println("0: Correos electrónicos que no tienen sub-dominio en la lista de arreglos");
        System.out.println("1: sistemas");
        System.out.println("2: contabilidad");
        System.out.println("3: administracion");
        System.out.println("4: mecanica");
        System.out.println("5: electrica");
        System.out.println("6: informatica");
        System.out.println("7: biomedica");
        System.out.println("8: Escriba todas las direcciones de correos electrónicos que tengan un subdominio");
        return kw.nextInt();
    }

    public String convertFileToString(String filePath) throws IOException {
        String result = "";
        try {
            BufferedReader lect = new BufferedReader(new FileReader(filePath));
            String lin = lect.readLine();
            while (lin != null) {
                result += lin + "\n";
                lin = lect.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        return result;
    }
    // lo siguiente se tomó del video del maestro  

    public void writeFile(String FileName, String textToAdd) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FileName));
            PrintWriter wr = new PrintWriter(bw);
            wr.write(textToAdd);
            wr.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Ocurrio un problema al tratar de escribir");
        }

    }

}
