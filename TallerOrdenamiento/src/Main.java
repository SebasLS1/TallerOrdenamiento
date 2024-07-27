import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearGUI();
            }
        });
    }

    private static void crearGUI() {
        JFrame frame = new JFrame("Menú de Ordenación y Búsqueda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton btnOrdenacion = new JButton("Ordenación");
        JButton btnBusqueda = new JButton("Búsqueda");

        panel.add(btnOrdenacion);
        panel.add(btnBusqueda);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        btnOrdenacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuOrdenacion();
            }
        });

        btnBusqueda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuBusqueda();
            }
        });
    }

    private static void mostrarMenuOrdenacion() {
        String[] opciones = {"Burbuja Menor a Mayor", "Burbuja Mayor a Menor", "Inserción", "Selección"};
        String metodo = (String) JOptionPane.showInputDialog(null, "Seleccione el método de ordenación:",
                "Ordenación", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (metodo != null) {
            String valores = JOptionPane.showInputDialog("Ingrese los valores a ordenar (separados por comas):");
            if (valores != null && !valores.isEmpty()) {
                String[] strArr = valores.split(",");
                int[] arr = new int[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    arr[i] = Integer.parseInt(strArr[i].trim());
                }

                switch (metodo) {
                    case "Burbuja Menor a Mayor":
                        Ordenacion.burbujaMenorMayor(arr);
                        break;
                    case "Burbuja Mayor a Menor":
                        Ordenacion.burbujaMayorMenor(arr);
                        break;
                    case "Inserción":
                        Ordenacion.insercion(arr);
                        break;
                    case "Selección":
                        Ordenacion.seleccion(arr);
                        break;
                }

                JOptionPane.showMessageDialog(null, "Array Ordenado: " + java.util.Arrays.toString(arr));
            }
        }
    }

    private static void mostrarMenuBusqueda() {
        String[] opciones = {"Secuencial en arreglo desordenado", "Secuencial en arreglo ordenado"};
        String metodo = (String) JOptionPane.showInputDialog(null, "Seleccione el método de búsqueda:",
                "Búsqueda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (metodo != null) {
            String valores = JOptionPane.showInputDialog("Ingrese los valores del arreglo (separados por comas):");
            if (valores != null && !valores.isEmpty()) {
                String[] strArr = valores.split(",");
                int[] arr = new int[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    arr[i] = Integer.parseInt(strArr[i].trim());
                }

                String valorBuscar = JOptionPane.showInputDialog("Ingrese el valor a buscar:");
                if (valorBuscar != null && !valorBuscar.isEmpty()) {
                    int x = Integer.parseInt(valorBuscar.trim());
                    int index = -1;

                    switch (metodo) {
                        case "Secuencial en arreglo desordenado":
                            index = Busqueda.busquedaSecuencial(arr, x);
                            break;
                        case "Secuencial en arreglo ordenado":
                            index = Busqueda.busquedaSecuencialOrdenada(arr, x);
                            break;
                    }

                    if (index != -1) {
                        JOptionPane.showMessageDialog(null, "Valor encontrado en el índice: " + index);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor no encontrado.");
                    }
                }
            }
        }
    }
}
