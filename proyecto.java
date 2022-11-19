/*
 * Laboratorio sustituto
 * Nelson García Barvatti 22434
 * 15/11/2022
 * clase proyecto
 */
 

import java.util.ArrayList;

public class proyecto {

    private String tipo;  //investigativo, nuevo cliente, mantenimiento, interno
    private boolean liderazgo; 
    private boolean colaboracion; 
    private boolean companeirismo; 
    private boolean experiencia;
    private boolean conocimiento;
    private boolean creatividad;   
    private boolean barato; 
    private boolean profesional; 
    private boolean tiempo_completo;
    private String nombre_proyecto;
    private ArrayList<participante> participantes_p; 

    public proyecto(String tipo, boolean liderazgo, boolean colaboracion, boolean companeirismo, boolean experiencia, boolean conocimiento, boolean creatividad, boolean barato, boolean profesional, boolean tiempo_completo, String nombre_proyecto) {
        this.tipo = tipo;
        this.liderazgo = liderazgo;
        this.colaboracion = colaboracion;
        this.companeirismo = companeirismo;
        this.experiencia = experiencia;
        this.conocimiento = conocimiento;
        this.creatividad = creatividad;
        this.barato = barato;
        this.profesional = profesional;
        this.tiempo_completo = tiempo_completo;
        this.nombre_proyecto = nombre_proyecto;
        this.participantes_p = new ArrayList<participante>();
    }


    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLiderazgo() {
        return this.liderazgo;
    }

    public boolean getLiderazgo() {
        return this.liderazgo;
    }

    public void setLiderazgo(boolean liderazgo) {
        this.liderazgo = liderazgo;
    }

    public boolean isColaboracion() {
        return this.colaboracion;
    }

    public boolean getColaboracion() {
        return this.colaboracion;
    }

    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    public boolean isCompaneirismo() {
        return this.companeirismo;
    }

    public boolean getCompaneirismo() {
        return this.companeirismo;
    }

    public void setCompaneirismo(boolean companeirismo) {
        this.companeirismo = companeirismo;
    }

    public boolean isExperiencia() {
        return this.experiencia;
    }

    public boolean getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isConocimiento() {
        return this.conocimiento;
    }

    public boolean getConocimiento() {
        return this.conocimiento;
    }

    public void setConocimiento(boolean conocimiento) {
        this.conocimiento = conocimiento;
    }

    public boolean isCreatividad() {
        return this.creatividad;
    }

    public boolean getCreatividad() {
        return this.creatividad;
    }

    public void setCreatividad(boolean creatividad) {
        this.creatividad = creatividad;
    }

    public boolean isBarato() {
        return this.barato;
    }

    public boolean getBarato() {
        return this.barato;
    }

    public void setBarato(boolean barato) {
        this.barato = barato;
    }

    public boolean isProfesional() {
        return this.profesional;
    }

    public boolean getProfesional() {
        return this.profesional;
    }

    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    public boolean isTiempo_completo() {
        return this.tiempo_completo;
    }

    public boolean getTiempo_completo() {
        return this.tiempo_completo;
    }

    public void setTiempo_completo(boolean tiempo_completo) {
        this.tiempo_completo = tiempo_completo;
    }

    public String getNombre_proyecto() {
        return this.nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public ArrayList<participante> getParticipantes_p() {
        return this.participantes_p;
    }

    public void setParticipantes_p(ArrayList<participante> participantes_p) {
        this.participantes_p = participantes_p;
    }


    @Override
    public String toString() {
        return "{" +
            " tipo='" + getTipo() + "'" +
            ", liderazgo='" + isLiderazgo() + "'" +
            ", colaboracion='" + isColaboracion() + "'" +
            ", companeirismo='" + isCompaneirismo() + "'" +
            ", experiencia='" + isExperiencia() + "'" +
            ", conocimiento='" + isConocimiento() + "'" +
            ", creatividad='" + isCreatividad() + "'" +
            ", barato='" + isBarato() + "'" +
            ", profesional='" + isProfesional() + "'" +
            ", tiempo_completo='" + isTiempo_completo() + "'" +
            ", nombre_proyecto='" + getNombre_proyecto() + "'" +
            ", participantes_p='" + getParticipantes_p() + "'" +
            "}";
    }

}
