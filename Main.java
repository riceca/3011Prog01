import javax.swing.*;import java.awt.*;public class Main{    public static void main(String[] args)    {        //load the card image from the gif file.        final ImageIcon cardIcon = new ImageIcon("cardImages/tenClubs.gif");        //create a panel displaying the card image        JPanel panel = new JPanel()        {            //paintComponent is called automatically by the JRE whenever            //the panel needs to be drawn or redrawn            public void paintComponent(Graphics g) {                super.paintComponent(g);                cardIcon.paintIcon(this, g, 20, 20);            }        };        //create & make visible a JFrame to contain the panel        JFrame window = new JFrame("Title goes here");        window.add(panel);        window.setPreferredSize(new Dimension(200,200));        window.pack();        window.setVisible(true);    }}