import java.applet.Applet;
import java.awt.*;

public class ImageApplet extends Applet {
    Image img;  // Declare an image object

    public void init() {
        // Load the image from the given path
    	img = getImage(getDocumentBase(), "images/java_Image.png");  // Image should be in the same directory
    }

    public void paint(Graphics g) {
        // Draw the loaded image at position (50, 50)
        g.drawImage(img, 50, 50, this);
    }
}
