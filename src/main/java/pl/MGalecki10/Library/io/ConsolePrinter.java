package pl.MGalecki10.Library.io;

import pl.MGalecki10.Library.model.Book;
import pl.MGalecki10.Library.model.LibraryUser;
import pl.MGalecki10.Library.model.Magazine;
import pl.MGalecki10.Library.model.Publication;

import java.util.Collection;
import java.util.Collections;

public class ConsolePrinter {

    public void printBooks(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printUsers(Collection<LibraryUser> users) {
        for (LibraryUser user : users) {
            printLine(user.toString());
        }
    }

    public void printLine(String text) {
        System.out.println(text);
    }
}
