package pl.MGalecki10.Library.io.file;

import pl.MGalecki10.Library.exception.NoSuchFileTypeException;
import pl.MGalecki10.Library.io.ConsolePrinter;
import pl.MGalecki10.Library.io.DataReader;

public class FileManagerBuilder {
    private ConsolePrinter printer;
    private DataReader reader;

    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public FileManager build() {
        printer.printLine("Wybierz format danych");
        FIleType fileType = getFileType();
        switch (fileType) {
            case SERIAL:
                return new SerializableFileManager();
            case CSV:
                return new CsvFileManager();
            default:
                throw new NoSuchFileTypeException("Nieobsługiwany typ danych");
        }

    }

    private FIleType getFileType() {
        boolean typeOk = false;
        FIleType result = null;
        do {
            printTypes();
            String type = reader.getString().toUpperCase();
            try {
                result = FIleType.valueOf(type);
                typeOk = true;
            } catch (IllegalArgumentException e) {
                printer.printLine("Nieobsługiwany typ danych, wybierz ponownie.");
            }
        } while (!typeOk);
        return result;
    }

    private void printTypes() {
        for (FIleType value : FIleType.values()) {
            printer.printLine(value.name());
        }
    }
}
