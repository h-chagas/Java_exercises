import java.awt.*;
import java.util.*;

public class SystemTime {
    public static void main(String[] args) {

        /*Print today's date and time*/
        Date date = new Date();
        System.out.println("The time is" + " " + date);

        /*Print OS name*/
        System.out.println("My OS is" + " " + System.getProperty("os.name"));

        /*Print Screen size*/
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)size.getWidth();
        int height = (int)size.getHeight();

        /*Print my display language*/
        Locale currentLocale = Locale.getDefault();
        System.out.println("My display idiom is " + currentLocale.getDisplayLanguage());


        System.out.println("My screen resolution is " + width + " x " + height);

    }


}

