import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class PicPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private BufferedImage image;
    private int w, h;

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    public PicPanel(String fname) {
        setLayout(null);
        try {
            image = ImageIO.read(new File(fname));
            w = image.getWidth();
            h = image.getHeight();

        } catch (IOException ioe) {
            System.out.println("Could not read in the pic");
        }

    }

    public Dimension getPreferredSize() {
        return new Dimension(w, h);
    }

    // this will draw the image
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
