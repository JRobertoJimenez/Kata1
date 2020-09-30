
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Roberto Jiménez
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person() {
        this.name = null;
        this.birthdate = null;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
}
