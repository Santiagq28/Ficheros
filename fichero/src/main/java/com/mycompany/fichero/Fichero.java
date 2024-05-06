package com.mycompany.fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Fichero {

    public static void main(String[] args) throws IOException  {
        
        File file = new File("./archivo.txt");
        
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("Archivo creado");
            }catch(IOException e){
                System.out.println("No se pudo crear el archivo");
            }
            
            
        } else{
            System.out.println("El archivo ya existe");
        }
        
        FileReader reader = new FileReader(file, Charset.forName("UTF8"));
        System.out.println(reader.getEncoding());
        
        //Acceder caracter a caracter
        /*
        char[] data = new char[50];
        reader.read(data);
        
        System.out.println(data[3]);
        //reader.close();
        */
        
        // Acceder línea a línea
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while((line = buffer.readLine()) != null) {
            System.out.println("Line: " + line);
        }
        reader.close();
        
        
        
        
        
        
        
        /*File file = new File("C:/hola.txt");
        
        if(file.exists()){
            System.out.println("Nombre:" + file.getName());
            System.out.println("Ruta:" + file.getPath());
            System.out.println("Ruta absoluta:" + file.getAbsolutePath());
            System.out.println("Permite escribir?:" + file.canWrite());
            System.out.println("Permite leer?:" + file.canRead());
            System.out.println("Tamaño:" + file.length());
            
        }else{
            System.out.println("El fichero no existe");
        }*/
    }
}
