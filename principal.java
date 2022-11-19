/*
 * Laboratorio sustituto
 * Nelson García Barvatti 22434
 * 15/11/2022
 * clase principal
 */
 
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        


        Scanner scanner = new Scanner(System.in);
        empresa empresa_nelson = new empresa();
        
        Random random = new Random();


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

        //obtener los participantes del archvios Participantes y guardarlos en el arraylist participantes de empresa
        try {
            File my = new File("Participantes.csv");
            Scanner myReader = new Scanner(my);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] datos = data.split(",");
              String nombre = datos[0];
              String tipo = datos[1];
              boolean liderazgo = Boolean.parseBoolean(datos[2]);
              boolean colaboracion = Boolean.parseBoolean(datos[3]);
              boolean companeirismo = Boolean.parseBoolean(datos[4]);
              boolean experiencia = Boolean.parseBoolean(datos[5]);
              boolean conocimiento = Boolean.parseBoolean(datos[6]);
              boolean creatividad = Boolean.parseBoolean(datos[7]);
              boolean barato = Boolean.parseBoolean(datos[8]);
              boolean profesional = Boolean.parseBoolean(datos[9]);
              boolean tiempo_completo = Boolean.parseBoolean(datos[10]);
              participante participante_nuevo = new participante(nombre, tipo, liderazgo, colaboracion, companeirismo, experiencia, conocimiento, creatividad, barato, profesional, tiempo_completo);
              empresa_nelson.getParticipantes().add(participante_nuevo);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error.");
            e.printStackTrace();
          }



        //menu
        int opcion = 0;
        while((opcion < 5) &&(opcion >= 0)) {
            System.out.println("\n");
            System.out.println("1. Agregar participante");
            System.out.println("2. Agregar proyecto");
            System.out.println("3. Mostrar participantes");
            System.out.println("4. Mostrar proyectos");
            System.out.println("5. Salir");
            System.out.println("\n");
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
                    boolean liderazgo = false;
                    boolean colaboracion = false;
                    boolean companeirismo = false;
                    boolean experiencia = false;
                    boolean conocimiento = false;
                    boolean creatividad = false;
                    boolean barato = false;
                    boolean profesional = false;
                    boolean tiempo_completo = false;
                    
                    switch(num){
                        case 1:
                            tipo = "practicante";
                            barato = true;
                            creatividad = true;
                            companeirismo = true;
                            colaboracion = true;
                            break;
                        case 2:
                            tipo = "ingeniero";
                            tiempo_completo = true;
                            experiencia = true;
                            conocimiento = true;
                            companeirismo = true;                            
                            break;
                        case 3:
                            tipo = "administrador";
                            experiencia = true;
                            creatividad = true;
                            liderazgo = true;
                            break;
                    }

                    empresa_nelson.agregar_participante(nombre, tipo, liderazgo, colaboracion, companeirismo, experiencia, conocimiento, creatividad, barato, profesional, tiempo_completo);
                    
                    try {
                        FileWriter myWriter = new FileWriter("Participantes.csv");
                        myWriter.write("Nombre, Tipo, Liderazgo, Colaboracion, Companeirismo, Experiencia, Conocimiento, Creatividad, Barato, Profesional, Tiempo completo\n");
                        for (int i = 0; i < empresa_nelson.getParticipantes().size(); i++) {
                            myWriter.write(empresa_nelson.getParticipantes().get(i).getNombre() + "," + empresa_nelson.getParticipantes().get(i).getTipo() + "," + empresa_nelson.getParticipantes().get(i).isLiderazgo() + "," + empresa_nelson.getParticipantes().get(i).isColaboracion() + "," + empresa_nelson.getParticipantes().get(i).isCompaneirismo() + "," + empresa_nelson.getParticipantes().get(i).isExperiencia() + "," + empresa_nelson.getParticipantes().get(i).isConocimiento() + "," + empresa_nelson.getParticipantes().get(i).isCreatividad() + "," + empresa_nelson.getParticipantes().get(i).isBarato() + "," + empresa_nelson.getParticipantes().get(i).isProfesional() + "," + empresa_nelson.getParticipantes().get(i).isTiempo_completo() + "\n");
                        }
                        myWriter.close();                                                                                               
                    
                    }catch (IOException e) {
                        System.out.println("Ha ocurrido un error.");
                        e.printStackTrace();
                    }
                
                    break;

                case 2:
                    //agregar proyecto
                    System.out.println("Ingrese el nombre del proyecto");
                    String nombre_proyecto = scanner.nextLine();
                    System.out.println("Ingrese el tipo de proyecto: \n1. investigativo\n2. nuevo cliente\n3. mantenimiento\n4. interno");
                    int num_proyecto = scanner.nextInt();
                    String tipo_proyecto = "";
                    boolean liderazgo_p = false;
                    boolean colaboracion_p = false;
                    boolean companeirismo_p = false;
                    boolean experiencia_p = false;
                    boolean conocimiento_p = false;
                    boolean creatividad_p = false;
                    boolean barato_p = false;
                    boolean profesional_p = false;
                    boolean tiempo_completo_p = false;
                    switch(num_proyecto){
                        case 1:
                            tipo_proyecto = "investigativo";
                            experiencia_p = true;
                            conocimiento_p = true;
                            creatividad_p = true;
                            break;
                        case 2:
                            tipo_proyecto = "nuevo cliente";
                            profesional_p = true;
                            conocimiento_p = true;
                            creatividad_p = true;
                            colaboracion_p = true;
                            break;
                        case 3:
                            tipo_proyecto = "mantenimiento";
                            liderazgo_p = true;
                            colaboracion_p = true;
                            experiencia_p = true;
                            break;
                        case 4:
                            tipo_proyecto = "interno";
                            companeirismo_p = true;
                            barato_p = true;
                            tiempo_completo_p = true;
                            break;
                    }
                    empresa_nelson.nuevo_proyecto(tipo_proyecto, liderazgo_p, colaboracion_p, companeirismo_p, experiencia_p, conocimiento_p, creatividad_p, barato_p, profesional_p, tiempo_completo_p, nombre_proyecto);

                    break;

                case 3:
                    //mostrar participantes
                    System.out.println("Participantes: ");
                    empresa_nelson.mostrar_participantes();
                    break;

                case 4:
                    //mostrar proyectos
                    System.out.println("Proyectos: ");
                    empresa_nelson.mostrar_proyectos();
                    break;

                case 5:
                    //salir del programa
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;

            }
        }
    }
}
