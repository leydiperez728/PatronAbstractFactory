package uan.edu.co.principal;

import javax.swing.JOptionPane;

import uan.edu.co.ambienteFabrica.FabricaProyectosStandAlone;
import uan.edu.co.ambienteFabrica.FabricaDeAmbientes;
import uan.edu.co.ambienteFabrica.FabricaProyectosWeb;

public class Principal {

    public static void main(String[] args) {

        FabricaProyectosWeb proWeb = new FabricaProyectosWeb();
        FabricaProyectosStandAlone proStandAlone = new FabricaProyectosStandAlone();
        String cad = "", salida;

        cad += "Ingrese la opción correspondiente para elegir el tipo de ambiente\n";
        cad += "1. Codigo de ambiente Web\n";
        cad += "2. Codigo de ambiente StandAlone\n";

        try {
            do {
                try {
                    String opcion = JOptionPane.showInputDialog(cad);

                    switch (opcion) {
                        case "1":
                            FabricaDeAmbientes.crearFabricaDeAmbiente(proWeb);
                            break;
                        case "2":
                            FabricaDeAmbientes.crearFabricaDeAmbiente(proStandAlone);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "La opción indicada no es valida");
                            break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No es un parametro de consulta valido");
                }

                salida = JOptionPane.showInputDialog("Desea consultar otro codigo? S/N");

            } while (salida.toUpperCase().equals("S"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bye!!!");
        }
    }
}
