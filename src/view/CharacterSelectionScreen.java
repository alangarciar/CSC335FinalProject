package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CharacterSelectionScreen extends JPanel
{
  private static final String imageDir = System.getProperty("user.dir")
      + File.separator + "images" + File.separator;

  private BufferedImage img;

  private JLabel jlabel;

  public CharacterSelectionScreen()
  {

    jlabel = new JLabel("Select 5 Units!");
    jlabel.setFont(new Font("Verdana", Font.BOLD, 76));
    jlabel.setForeground(Color.RED);
    this.setBorder(new LineBorder(Color.BLACK)); // make it easy to see
    this.setVisible(true);
    jlabel.setLocation(0, 300);
    this.add(jlabel);
  }

}
