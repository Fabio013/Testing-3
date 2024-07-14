import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testParseDate() { //verifico che la conversione in OffsetDataTime sia corretta
        String dataStringa = "2023-03-01T13:00:00Z";
        OffsetDateTime dataAttesa = OffsetDateTime.parse(dataStringa);
        OffsetDateTime dataAttuale = Main.parseDate(dataStringa);
        assertEquals(dataAttesa, dataAttuale);
    }
    @Test // verifico che la formattazione corrisponda
    public void testFormatRichiesto() {
        OffsetDateTime dataTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formattazioneAttesa = "01 marzo 2023";
        String formattazioneAttuale = Main.formatRichiesto(dataTime);
        assertEquals(formattazioneAttesa, formattazioneAttuale);
    }
}