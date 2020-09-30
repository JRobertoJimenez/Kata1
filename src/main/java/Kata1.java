
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
public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Luis Almeida", LocalDate.of(1980, 5, 15));
        System.out.println(person.getName()+" "+person.getAge());
    }
}
