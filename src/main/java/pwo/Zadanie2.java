/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

/**
 *
 * @author student
 */
public class Zadanie2 {
    
    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "lucasseq100.txt";

    public static void run() {

        System.out.println("Lucas wersja 1");

        boolean ok = SequenceTools.writeToFileLucas(
                new LucasGenerator(), FROM, TO, FILE_NAME);

        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }   
        
    }
    
}
