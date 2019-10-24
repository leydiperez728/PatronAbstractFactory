package uan.edu.co.clases;

import uan.edu.co.interfaces.Ambiente;

public class ProyectoStandAlone implements Ambiente {

    private String equipo = "Se creo un ";

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String crearBoton() {
        return equipo + " botón";
    }

    @Override
    public String crearTexto() {
        return equipo + " texto";
    }

}
