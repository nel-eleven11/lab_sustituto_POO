/*
 * Laboratorio sustituto
 * Nelson García Barvatti 22434
 * 15/11/2022
 * clase empresa
 
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class empresa {

    private ArrayList<participante> participantes;
    private ArrayList<proyecto> proyectos;

    public empresa() {
        this.participantes = new ArrayList<participante>();
        this.proyectos = new ArrayList<proyecto>();
    }


    public ArrayList<participante> getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(ArrayList<participante> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<proyecto> getProyectos() {
        return this.proyectos;
    }

    public void setProyectos(ArrayList<proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    //agregar participante
    public void agregar_participante(String nombre, String tipo, boolean liderazgo, boolean colaboracion, boolean companeirismo, boolean experiencia, boolean conocimiento, boolean creatividad, boolean barato, boolean profesional, boolean tiempo_completo){

        participante participante_nuevo = new participante(nombre, tipo, liderazgo, colaboracion, companeirismo, experiencia, conocimiento, creatividad, barato, profesional, tiempo_completo);
        this.participantes.add(participante_nuevo);
    }
    // nuevo proyecto

    public void nuevo_proyecto(String tipo, boolean liderazgo, boolean colaboracion, boolean companeirismo, boolean experiencia, boolean conocimiento, boolean creatividad, boolean barato, boolean profesional, boolean tiempo_completo, String nombre_proyecto){
        proyecto proyecto_nuevo = new proyecto(tipo, liderazgo, colaboracion, companeirismo, experiencia, conocimiento, creatividad, barato, profesional, tiempo_completo, nombre_proyecto);
        this.proyectos.add(proyecto_nuevo);
        Random random = new Random();
        boolean rehacer = true;
        Scanner sc = new Scanner(System.in);
        do{
            //se eligen 3 participantes aleatoriamente
            int par1 = 0;
            int par2 = 0;
            int par3 = 0;
            par1 = random.nextInt(this.participantes.size());
            do{
                par2 = random.nextInt(this.participantes.size());
            }while(par1==par2);
            do{
                par3 = random.nextInt(this.participantes.size());
            }while((par1==par3)||(par2==par3));
            
            //se calcula el puntaje de cada participante, el puntaje es sobre 90 en total
            int puntaje1 = 0;
            int puntaje2 = 0;
            int puntaje3 = 0;
            
            if(this.participantes.get(par1).isLiderazgo() == proyecto_nuevo.isLiderazgo()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isColaboracion() == proyecto_nuevo.isColaboracion()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isCompaneirismo() == proyecto_nuevo.isCompaneirismo()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isExperiencia() == proyecto_nuevo.isExperiencia()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isConocimiento() == proyecto_nuevo.isConocimiento()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isCreatividad() == proyecto_nuevo.isCreatividad()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isBarato() == proyecto_nuevo.isBarato()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isProfesional() == proyecto_nuevo.isProfesional()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par1).isTiempo_completo() == proyecto_nuevo.isTiempo_completo()){
                puntaje1 += 10;
            }
            if(this.participantes.get(par2).isLiderazgo() == proyecto_nuevo.isLiderazgo()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isColaboracion() == proyecto_nuevo.isColaboracion()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isCompaneirismo() == proyecto_nuevo.isCompaneirismo()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isExperiencia() == proyecto_nuevo.isExperiencia()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isConocimiento() == proyecto_nuevo.isConocimiento()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isCreatividad() == proyecto_nuevo.isCreatividad()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isBarato() == proyecto_nuevo.isBarato()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isProfesional() == proyecto_nuevo.isProfesional()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par2).isTiempo_completo() == proyecto_nuevo.isTiempo_completo()){
                puntaje2 += 10;
            }
            if(this.participantes.get(par3).isLiderazgo() == proyecto_nuevo.isLiderazgo()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isColaboracion() == proyecto_nuevo.isColaboracion()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isCompaneirismo() == proyecto_nuevo.isCompaneirismo()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isExperiencia() == proyecto_nuevo.isExperiencia()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isConocimiento() == proyecto_nuevo.isConocimiento()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isCreatividad() == proyecto_nuevo.isCreatividad()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isBarato() == proyecto_nuevo.isBarato()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isProfesional() == proyecto_nuevo.isProfesional()){
                puntaje3 += 10;
            }
            if(this.participantes.get(par3).isTiempo_completo() == proyecto_nuevo.isTiempo_completo()){
                puntaje3 += 10;
            }

            System.out.println("Los participantes elegidos son y sun puntaje sobre 90: " + this.participantes.get(par1).getNombre() + " " + puntaje1 + " " + this.participantes.get(par2).getNombre() + " " + puntaje2 + " " + this.participantes.get(par3).getNombre() + " " + puntaje3);

            
            System.out.println("¿Desea repetir el proceso? \n1. Si \n2. No\n");
            int opcion = 0;
            opcion = sc.nextInt();
            if(opcion==1){
                rehacer = true;
            }else{
                //se agregan los participantes al proyecto
            
                proyecto_nuevo.getParticipantes_p().add(this.participantes.get(par1));
                proyecto_nuevo.getParticipantes_p().add(this.participantes.get(par2));
                proyecto_nuevo.getParticipantes_p().add(this.participantes.get(par3));
                rehacer = false;
            }   
        }while(rehacer==true);

    }


    // mostrar participantes
    public void mostrar_participantes(){
        for (participante participante : participantes) {
            System.out.println(participante.getNombre());
        }
    }

    // mostrar proyectos
    public void mostrar_proyectos(){
        String part = "";
        for (proyecto proyecto : proyectos) {
            for(int i=0; i<proyecto.getParticipantes_p().size(); i++){
                part = part + "  "+proyecto.getParticipantes_p().get(i).getNombre();
            }
            System.out.println(proyecto.getNombre_proyecto()+" "+proyecto.getTipo()+" "+part);
        }
    }



}
