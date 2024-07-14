import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Definisco la stringa della data da formattare
        String dataStringa = "2023-03-01T13:00:00Z";
        // Analizzo la stringa della data in un oggetto OffsetDateTime
        OffsetDateTime dataTime = parseDate(dataStringa);
        // Formatto la data nella configurazione richiesta e la stampo															        OffsetDateTime expectedDate = OffsetDateTime.parse(dateString);
        String formattazioneRichiesta = formatRichiesto(dataTime);
        System.out.println("Formattazione con giorno, mese e anno: " + formattazioneRichiesta);														        // Chiamata del metodo parseDate della classe Main con la stringa da parsare
    }
    // Metodo per analizzare una stringa della data nel formato "yyyy-MM-dd'T'HH:mm:ssZ" in un oggetto OffsetDateTime
    static OffsetDateTime parseDate(String dataStringa) {
        return OffsetDateTime.parse(dataStringa);
    }
    // Metodo per formattare un oggetto OffsetDateTime in una stringa della data in stile breve
    static String formatRichiesto(OffsetDateTime dataTime) {
        return dataTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")); // ritorna la formattazione 01 marzo 2023
    }
}