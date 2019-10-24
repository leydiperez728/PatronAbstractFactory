package uan.edu.co.ambienteFabrica;

import javax.swing.JOptionPane;
import uan.edu.co.clases.ProyectoWeb;
import uan.edu.co.interfaces.Ambiente;
import uan.edu.co.interfaces.TipoAmbiente;

public class FabricaProyectosWeb implements TipoAmbiente {

    @Override
    public Ambiente CrearAmbiente() {
        ProyectoWeb proyectoWeb = new ProyectoWeb();
         JOptionPane.showMessageDialog(null, " " + proyectoWeb.crearBoton()
                + " y " + proyectoWeb.crearTexto() + " WEB ", "Obj WEB ", JOptionPane.INFORMATION_MESSAGE);
        
        return proyectoWeb;
    }

}
