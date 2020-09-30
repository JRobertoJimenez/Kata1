
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
    private final Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()-birthdate.getTime())/31557600000L);
        
    }
}
