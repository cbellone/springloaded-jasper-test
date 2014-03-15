package test;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: celestino
 * Date: 3/15/14
 * Time: 9:02 AM
 */
public class GreetingsBean implements Serializable {

    private String englishGreeting = "Hello!";
    private String italianGreeting = "Ciao!";

    public String getEnglishGreeting() {
        return englishGreeting;
    }

//    public String getItalianGreeting() {
//        return italianGreeting;
//    }
//

}
