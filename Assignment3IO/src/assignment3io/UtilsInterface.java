/**
 *
 * @author Hazael Gomez Encinas
 */
package assignment3io;
import java.io.IOException;
import java.util.ArrayList;
public interface UtilsInterface {
    public ArrayList<Email> getEmails(String paragraph);
    public int displayMessageEnterTypeEmails();
    public String convertFileToString(String filePath) throws IOException;
    public void writeFile(String FileName, String textToAdd);
    
}