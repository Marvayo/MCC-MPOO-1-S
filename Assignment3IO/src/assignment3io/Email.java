/*
 *Tarea EmailParser
 */
package assignment3io;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Marlette Gpe. Arvayo Ortega
 */
public class Email {

    protected String username;
    protected String dominio;
    protected String extension;

    public Email(String username, String dominio, String extension) {
        this.username = username;//*
        this.dominio = dominio;//*
        this.extension = extension;//*
    }

    public int getCode() {
        return 0;
    }

    public String getSubdominio() {
        return "";
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username + "@" + dominio + "." + extension;
    }
}
