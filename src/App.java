import javax.swing.JOptionPane;

import net.hiperdino.cajero.Cajero;
import net.hiperdino.clientes.Cliente;
import net.hiperdino.utilidades.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Cajero cajero1 = new Cajero(1);
        boolean seguirPreguntando = true;

        while (seguirPreguntando) {
            switch (Menu.printMenu()) {
                case "1":
                    if(cajero1.isAbierta()){
                        JOptionPane.showMessageDialog(null, "La caja ya se encuntra abierta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Abriendo...");
                        cajero1.setAbierta(true);
                        JOptionPane.showMessageDialog(null, "La caja se ha abierto con exito");
                    }

                    break;
            
                case "2":
                    Cliente cliente = new Cliente((int) (Math.random() * 12) + 16);
                    JOptionPane.showMessageDialog(null, "Llenando la lista de la compra de " + cliente.getNombre() + "...");
                    cliente.llenarCesta();
                    if (cajero1.isAbierta()){
                        
                    }
                    break;

                default:
                    break;
            }
        }
    }
}
