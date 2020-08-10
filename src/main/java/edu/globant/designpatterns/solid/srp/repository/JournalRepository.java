package edu.globant.designpatterns.solid.srp.repository;

import edu.globant.designpatterns.solid.srp.domain.Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

/*Creamos la clase repository para separar resposabilidades, de esta forma la clase <Journal> mantiene
* una sola razon para cambiar, lo mismo esta nueva clase*/
public class JournalRepository {

    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(fileName).exists())

        try (PrintStream out = new PrintStream(fileName)) {
            out.println(journal.toString());
        }
    }

    public Journal load(String fileName) {
        //write the Implementation here
        return new Journal();
    }

    public Journal load(URL url) {
        //write the Implementation here
        return new Journal();
    }

}
