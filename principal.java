/*
 * Laboratorio sustituto
 * Nelson García Barvatti 22434
 * 15/11/2022
 * clase principal
 */
 
import java.io.File; /*Importamos el .io para los documentos*/
import java.io.FileNotFoundException;/* Importamos el found exception para los documentos*/
import java.io.FileWriter;/*Importamos el .io.filewriter esta se utiliza para escribir archivos en forma de caracteres del mismo*/
import java.io.IOException;/* Se importa el .io.exception clase base para excepciones que se producen mientras se tiene acceso a la información mediante secuencias, archivos y directorios*/

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        empresa empresa_nelson = new empresa();


        //crear archivo
        try {
            File myObj = new File("Participantes.csv");
            if (myObj.createNewFile()) {
              System.out.println("Archivo creado: " + myObj.getName());
            } else {
              System.out.println("Archivo ya es existente.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }

        //escribir archivo

        try {
            FileWriter myWriter = new FileWriter("Participantes.csv");
            myWriter.write("Nombre, Tipo, Liderazgo, Colaboracion, Companeirismo, Experiencia, Conocimiento, Creatividad, Barato, Profesional, Tiempo completo\n");
            myWriter.write(nombre+ "," + tipo + "," + liderazgo + "," + colaboracion + "," + companeirismo + "," + experiencia + "," + conocimiento + "," + creatividad + "," + barato + "," + profesional + "," + tiempo_completo + "\n");
            myWriter.close();                                                                                               
        
        }catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
        }

        //leer archivo e imprimirlo

        try {
            File my = new File("Participantes.csv");
            Scanner myReader = new Scanner(my);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
          }

        //menu
        int opcion = 0;
        while((opcion < 5) &&(opcion >= 0)) {
            System.out.println("1. Agregar participante");
            System.out.println("2. Agregar proyecto");
            System.out.println("3. Asignar participante a proyecto");
            System.out.println("4. Mostrar participantes");
            System.out.println("6. Mostrar proyectos");
            System.out.println("7. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    //agregar participante
                    System.out.println("Ingrese el nombre del participante");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el tipo de participante: \n1. practicante \n2. ingeniero \n3. administrador\n");
                    int num = scanner.nextInt();
                    String tipo = "";
                    switch(num){
                        case 1:
                            tipo = "practicante";
                            break;
                        case 2:
                            tipo = "ingeniero";
                            break;
                        case 3:
                            tipo = "administrador";
                            break;
                    }
                    

                case 2:
                    //agregar proyecto

                case 3:
                    //asignar participante a proyecto

                case 4:
                    //mostrar participantes

                case 5:
                    //mostrar proyectos

                case 6:
                    //salir del programa
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                break;

            }
        }
    }
}
