
package practicadibujarescenariomoraarellanojoshuazoramnl16grupo311;

import javax.swing.JFrame;

public class PracticaDibujarEscenario {


    public static void main(String[] args) {
        
        DibujoRectangulo dib = new DibujoRectangulo();
        JFrame ventana = new JFrame();
        ventana.add(dib);
        ventana.setSize(400,400);
        ventana.setVisible(true);
        
    }
    
}
