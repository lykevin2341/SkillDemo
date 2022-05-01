import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply(){
        assertEquals(15, SkillDemo.mulitply(3, 5));
    }
}
