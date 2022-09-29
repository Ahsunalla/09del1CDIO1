package Test;
import Spil.Person;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void returnPoint() {
        Person player = new Person("joe");
        player.setPoint(2);
        assertEquals(2, player.getPoint());
    }
}
