import com.example.SimpleLib;     // --class-path='.' works.
import net.example.Subproject;
import jarlib.JarLib;

public class JavaDelimiterTest {
    public static void main (String args[]) {
        SimpleLib.greet("SimpleLib in JavaDelimiterTest");
        Subproject.greet("Subproject in JavaDelimiterTest");
        JarLib.greet("JarLib in JavaDelimiterTest");
    }
}

