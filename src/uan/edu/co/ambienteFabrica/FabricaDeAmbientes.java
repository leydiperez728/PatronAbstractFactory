package uan.edu.co.ambienteFabrica;

import uan.edu.co.interfaces.Ambiente;
import uan.edu.co.interfaces.TipoAmbiente;

public class FabricaDeAmbientes {

    public static void crearFabricaDeAmbiente(TipoAmbiente factory) {
        Ambiente objetoAmbiente = factory.CrearAmbiente();
        objetoAmbiente.crearBoton();
        objetoAmbiente.crearTexto();

    }
}