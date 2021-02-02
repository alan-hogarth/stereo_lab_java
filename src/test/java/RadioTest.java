import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RadioTest {

    @Test
    public void canTune(){
        Radio radio = new Radio("Tuning to Radio 6");
        assertEquals("Tuning to Radio 6", radio.tune());
    }

}
