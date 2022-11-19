/*
 * Laboratorio sustituto
 * Nelson García Barvatti 22434
 * 15/11/2022
 * clase empresa
 
 */

import java.util.ArrayList;


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
        boolean rehacer = true;
        do{
            //se eligen 3 participantes aleatoriamente
            int par1 = 0;
            int par2 = 0;
            int par3 = 0;
            while(par1 == par2 || par1 == par3 || par2 == par3){
                par1 = (int) (Math.random() * this.participantes.size());
                par2 = (int) (Math.random() * this.participantes.size());
                par3 = (int) (Math.random() * this.participantes.size());
            }
            //se agregan los participantes al proyecto
            proyecto_nuevo.getParticipantes_p().add(this.participantes.get(par1));
            proyecto_nuevo.getParticipantes_p().add(this.participantes.get(par2));
            proyecto_nuevo.getParticipantes_p().add(this.participantes.get(par3));

            
            

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
        for (proyecto proyecto : proyectos) {
            System.out.println(proyecto.getNombre_proyecto());
        }
    }



}
