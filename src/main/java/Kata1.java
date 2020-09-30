
import java.util.Calendar;
import java.util.GregorianCalendar;

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
        Calendar date = GregorianCalendar.getInstance();
        date.set(1980, 5, 20);
        Person person = new Person("Luis Almeida", date);
        System.out.println(person.getName()+" "+person.getAge());
    }
}
