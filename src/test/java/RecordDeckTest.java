import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {



    @Test
    public void canGetPlaySpeed(){
        RecordDeck recordDeck = new RecordDeck(5, "Sony", "HN765", "playing", "stopped", "paused");
        assertEquals(5, recordDeck.getPlaySpeed());
    }


    @Test
    public void canPlay (){
        RecordDeck recordDeck = new RecordDeck(5, "Sony", "HN765", "playing", "stopped", "paused");
        assertEquals("playing", recordDeck.play());
    }

    @Test
    public void canStop (){
        RecordDeck recordDeck = new RecordDeck(5, "Sony", "HN765", "playing", "stopped", "paused");
        assertEquals("stopped", recordDeck.stop());
    }

    @Test
    public void canPause (){
        RecordDeck recordDeck = new RecordDeck(5, "Sony", "HN765", "playing", "stopped", "paused");
        assertEquals("paused", recordDeck.pause());
    }

}
