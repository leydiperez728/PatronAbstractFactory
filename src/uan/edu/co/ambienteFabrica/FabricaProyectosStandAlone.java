package uan.edu.co.ambienteFabrica;

import javax.swing.JOptionPane;
import uan.edu.co.clases.ProyectoStandAlone;
import uan.edu.co.interfaces.Ambiente;
import uan.edu.co.interfaces.TipoAmbiente;

public class FabricaProyectosStandAlone implements TipoAmbiente {

    @Override
    public Ambiente CrearAmbiente() {
        ProyectoStandAlone proyectoStandAlone = new ProyectoStandAlone();

        JOptionPane.showMessageDialog(null, " " + proyectoStandAlone.crearBoton()
                + " y " + proyectoStandAlone.crearTexto() + " STANDALONE", "Obj STANDALONE", JOptionPane.INFORMATION_MESSAGE);

        return proyectoStandAlone;
    }

}
