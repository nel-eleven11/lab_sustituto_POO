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
    private ArrayList<participante> participantes_p; //tienen que ser 3 participantes

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
        this.participantes_p = new ArrayList<participante>(3);
    }


    
    /** 
     * @return String
     */
    public String getTipo() {
        return this.tipo;
    }

    
    /** 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isLiderazgo() {
        return this.liderazgo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getLiderazgo() {
        return this.liderazgo;
    }

    
    /** 
     * @param liderazgo
     */
    public void setLiderazgo(boolean liderazgo) {
        this.liderazgo = liderazgo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isColaboracion() {
        return this.colaboracion;
    }

    
    /** 
     * @return boolean
     */
    public boolean getColaboracion() {
        return this.colaboracion;
    }

    
    /** 
     * @param colaboracion
     */
    public void setColaboracion(boolean colaboracion) {
        this.colaboracion = colaboracion;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCompaneirismo() {
        return this.companeirismo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCompaneirismo() {
        return this.companeirismo;
    }

    
    /** 
     * @param companeirismo
     */
    public void setCompaneirismo(boolean companeirismo) {
        this.companeirismo = companeirismo;
    }

    
    /** 
     * @return boolean
     */
    public boolean isExperiencia() {
        return this.experiencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean getExperiencia() {
        return this.experiencia;
    }

    
    /** 
     * @param experiencia
     */
    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    
    /** 
     * @return boolean
     */
    public boolean isConocimiento() {
        return this.conocimiento;
    }

    
    /** 
     * @return boolean
     */
    public boolean getConocimiento() {
        return this.conocimiento;
    }

    
    /** 
     * @param conocimiento
     */
    public void setConocimiento(boolean conocimiento) {
        this.conocimiento = conocimiento;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCreatividad() {
        return this.creatividad;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCreatividad() {
        return this.creatividad;
    }

    
    /** 
     * @param creatividad
     */
    public void setCreatividad(boolean creatividad) {
        this.creatividad = creatividad;
    }

    
    /** 
     * @return boolean
     */
    public boolean isBarato() {
        return this.barato;
    }

    
    /** 
     * @return boolean
     */
    public boolean getBarato() {
        return this.barato;
    }

    
    /** 
     * @param barato
     */
    public void setBarato(boolean barato) {
        this.barato = barato;
    }

    
    /** 
     * @return boolean
     */
    public boolean isProfesional() {
        return this.profesional;
    }

    
    /** 
     * @return boolean
     */
    public boolean getProfesional() {
        return this.profesional;
    }

    
    /** 
     * @param profesional
     */
    public void setProfesional(boolean profesional) {
        this.profesional = profesional;
    }

    
    /** 
     * @return boolean
     */
    public boolean isTiempo_completo() {
        return this.tiempo_completo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getTiempo_completo() {
        return this.tiempo_completo;
    }

    
    /** 
     * @param tiempo_completo
     */
    public void setTiempo_completo(boolean tiempo_completo) {
        this.tiempo_completo = tiempo_completo;
    }

    
    /** 
     * @return String
     */
    public String getNombre_proyecto() {
        return this.nombre_proyecto;
    }

    
    /** 
     * @param nombre_proyecto
     */
    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    
    /** 
     * @return ArrayList<participante>
     */
    public ArrayList<participante> getParticipantes_p() {
        return this.participantes_p;
    }

    
    /** 
     * @param participantes_p
     */
    public void setParticipantes_p(ArrayList<participante> participantes_p) {
        this.participantes_p = participantes_p;
    }


    
    /** 
     * @return String
     */
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
