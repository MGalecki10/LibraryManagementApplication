package pl.MGalecki10.Library.io.file;

import pl.MGalecki10.Library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
