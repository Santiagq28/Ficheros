package com.mycompany.fichero2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fichero2 {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        file.createNewFile(); // TO DO: Crear un método para crear archivos y manejar la excepción.
        
        FileWriter writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);
        
        for(int i = 0; i<10; i++){
            pw.println("Linea " + i);
        }
        writer.close();
    }
}
