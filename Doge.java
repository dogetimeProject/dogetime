import java.io.File;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.io.IOException;

// Displays file called doge.jpg in the same folder as the pogram
// This makes life dogetime
public class Doge extends JFrame
{
    public Doge()
    {
        setTitle("For the love of wow");
        Container wow = getContentPane();
        wow.setLayout(new GridLayout(1,1));
        
        try {
            BufferedImage myPicture = ImageIO.read(new File("doge.jpg"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            add(picLabel);
        } catch (IOException ex) {
            System.out.println("WOW NO MOON HERE");
        }
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
    
    public static void main(String args[])
    {
        Doge dogeTime = new Doge();
        dogeTime.setVisible(true);
    }
}
