package practicadibujarescenariomoraarellanojoshuazoramnl16grupo311;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujoRectangulo extends JPanel {

    public DibujoRectangulo() {

        setBackground(Color.YELLOW);

    }

    public void PaintComponent(Graphics g) {

        super.paintComponent(g);
        int AnchoRec = 50;
        int AltoRec = 100;
        g.drawRect(0, 0, AnchoRec, AltoRec);
        g.setColor(Color.RED);

    }
}
