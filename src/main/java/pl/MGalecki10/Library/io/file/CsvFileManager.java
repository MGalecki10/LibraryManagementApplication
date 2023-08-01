package pl.MGalecki10.Library.io.file;

import pl.MGalecki10.Library.exception.DataExportException;
import pl.MGalecki10.Library.model.Library;
import pl.MGalecki10.Library.model.Publication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileManager implements FileManager {
    private static final String FILE_NAME = "Library.csv";
    @Override
    public Library importData() {
        return null;
    }

    @Override
    public void exportData(Library library) {
        Publication[] publications = library.getPublications();
        try (var fileWriter = new FileWriter(FILE_NAME);
        var bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Publication publication : publications) {
                bufferedWriter.write(publication.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + FILE_NAME);
        }
    }
}
