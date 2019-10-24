
package uan.edu.co.clases;

import uan.edu.co.interfaces.Ambiente;

public class ProyectoWeb implements Ambiente{
    private String url = "Se creo";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String crearBoton() {
        return url + " boton ";
    }

    @Override
    public String crearTexto() {
        return url + " texto ";
    }
}
