package edu.globant.designpatterns.solid.srp;


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
}
