package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person me = new Person("Ale", new Date(97,5,25));
        System.out.println(me.getName()+ " tiene " + me.getAge() + " años");
    }
}
