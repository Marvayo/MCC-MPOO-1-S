/*
 * Tarea EmailParser
 */
package assignment3io;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Marlette Gpe. Arvayo Ortega
 */
public class UniversityEmail extends Email {

    private String department;//que funge tambien como dominio
    private int code;

    public UniversityEmail(String username, String dominio, String extension, String department, int code) {
        super(username, dominio, extension);
        this.department = department;
        this.code = code;
    }

    @Override
    public String getSubdominio() {
        return this.department;
    }

    static int getCodeByString(String department) {
        if ("sistemas".equals(department)) {
            return 1;
        }
        if ("contabilidad".equals(department)) {
            return 2;
        }
        if ("administracion".equals(department)) {
            return 3;
        }
        if ("mecanica".equals(department)) {
            return 4;
        }
        if ("electrica".equals(department)) {
            return 5;
        }
        if ("informatica".equals(department)) {
            return 6;
        }
        if ("biomedica".equals(department)) {
            return 7;
        }
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return username + "@" + department + "." + dominio + "." + extension;
    }
}
