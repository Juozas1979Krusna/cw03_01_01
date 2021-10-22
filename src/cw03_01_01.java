
// Java program to create a blank text
// field of definite number of columns.
import java.awt.event.*;
import javax.swing.*;
import        javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Random;
import java.lang.Math;
class cw03_01_001 extends JFrame implements ActionListener {

    // JTextField
    static JTextField t04;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b01;
    static JButton b02;
    static JButton b03;
    // default constructor
    cw03_01_001()
    {
    }

    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("cw01_01_001");

        // create a label to display text

        t04 = new JTextField(20);

        // create a new button
        b01 = new JButton("Papirs");
        b02 = new JButton("Skeres");
        b03 = new JButton("Akmens");

        // create a object of the text class
        cw03_01_001 te = new cw03_01_001();

        // addActionListener to button
        b01.addActionListener(te);
        b02.addActionListener(te);
        b03.addActionListener(te);

        JPanel p = new JPanel();

        // add buttons and textfield to panel

        p.add(b01);
        p.add(b02);
        p.add(b03);
        p.add(t04);

        // add panel to frame
        f.add(p);

        // set the size of frame
        f.setSize(300, 300);

        f.show();
    }

    public void actionPerformed(ActionEvent e)
    {

        Random rand = new Random();
        String Atbilde01 = "";
        int choise=-1;
        String s = e.getActionCommand();
        if (s.equals("Papirs")) {
            choise =0;
            Atbilde01 = "Papirs";
        }
        if (s.equals("Skeres")) {
            choise =1;
            Atbilde01 = "Skeres";
        }
        if (s.equals("Akmens")) {
            choise =2;
            Atbilde01 = "Akmens";
        }
        if (choise >-1) {
            int int_random01 = (rand.nextInt(3) + 1)*(-1);
            String outStrPrint_01="";
            if (int_random01 == -1) {
                outStrPrint_01 = "Papirs";
            }
            if (int_random01 == -2) {
                outStrPrint_01 = "Skeres";
            }
            if (int_random01 == -3) {
                outStrPrint_01 = "Akmens";
            }
            String Atbilde02 = "";

            int_random01 = int_random01 +choise;
            if(int_random01 == -1){
                Atbilde02 =  " vs " + outStrPrint_01+ ". Jamegin.";
            }else{
                if(Math.cos(int_random01*3.14159*2/3) > 0){
                    Atbilde02 =  " vs " + outStrPrint_01+ ". Apsveicu.";
                }else{
                    Atbilde02 =  " vs " + outStrPrint_01+ ". Paveiksies.";
                }
            }
            t04.setText(Atbilde01+ Atbilde02);
        }
    }
}




