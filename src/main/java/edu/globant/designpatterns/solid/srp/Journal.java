package edu.globant.designpatterns.solid.srp;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/*
* Esta clase modela lo que sería un diario, donde agregamos entradas
* basadas en algun tema miscelaneo. En primera instancia cumple el principio
* de Responsabilidad Unica, dado a que sus atributos y operaciones solo estan
* acotadas a lo que respecta escribir, borrar y verificar cantidad de contenido*/
public class Journal {

    private List<String> entries;

    private int count;

    public Journal() {
        entries = new ArrayList<>();
        count = 0;
    }

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    public int getTotalEntries() {
        return entries.size();
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    /*Ahora vamos a agregar funcionalidades que no son directamente relacionados
    * al concepto <Journal>, como persistir el contenido en algun lugar*/
    public void save(String fileName) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)) {
            out.println(toString());
        }
    }

    public void load(String fileName) {
        //write the Implementation here
    }

    public void load(URL url) {
        //write the Implementation here
    }
}
