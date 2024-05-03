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
                        JOptionPane.showMessageDialog(null, "La caja ya se encuentra abierta");
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
                        cajero1.añadirCliente(cliente);
                        JOptionPane.showMessageDialog(null, "Se ha puesto en la fila un cliente nuevo...");
                    } else {
                        JOptionPane.showMessageDialog(null, "Disculpe las molestias, la caja esta cerrada");
                    }
                    break;

                case "3":
                    if(cajero1.getColaClientes().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Actualmente no hay clientes en fila");
                    } else {
                        JOptionPane.showMessageDialog(null, "Atendiendo a " + cajero1.getColaClientes().poll().getNombre());
                        JOptionPane.showMessageDialog(null, "El cliente fue atendido con exito");
                    }
                    break;
                
                case "4":
                    if(cajero1.getColaClientes().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Actualmente no hay clientes en fila");
                    } else {
                        JOptionPane.showMessageDialog(null, "Actualmente se encuentra en la fila: ");
                        for (Cliente clientito : cajero1.getColaClientes()) {
                            JOptionPane.showMessageDialog(null, clientito.getNombre() + " el cual seria atendido en el cajero " + cajero1.getNumeroCaja());
                        }
                    }
                    break;
                
                case "5":
                    JOptionPane.showMessageDialog(null, "Muchas gracias por usar nuestro programa, Pepe Gestor Optimus Maximus");
                    seguirPreguntando = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Porfavor intruduzca uno de los numeros mostrados en pantalla");
                    break;
            }
        }
    }
}
