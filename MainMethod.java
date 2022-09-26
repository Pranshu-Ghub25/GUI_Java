import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

class FileHandlePage extends JFrame implements ActionListener {

    /* Assets of File Handling Page */
    JFrame fileframe = new JFrame();
    JPanel fpanel1 = new JPanel();
    JPanel fpanel2 = new JPanel();
    JPanel fpanel3 = new JPanel();
    JPanel fpanelbuttons = new JPanel();
    JButton b1 = new JButton("Write ");
    JButton b2 = new JButton("Read ");
    JButton b3 = new JButton("Append");
    JButton b4 = new JButton("Search");
    JButton b5 = new JButton("Button1");
    JButton b6 = new JButton("Button2");
    JButton b7 = new JButton("Button2");
    JTextArea txtarea = new JTextArea();
    JTextField searcharea = new JTextField();
    JTextField tCountfield = new JTextField();

    FileHandlePage() {

        fileframe.setTitle("File Handling in Java");
        fileframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fileframe.setSize(948, 670);
        fileframe.setResizable(false);
        fileframe.setLayout(new BorderLayout(2, 2));

        /* ************Color*********** */
        Color color1 = new Color(95, 85, 92);
        Color color2 = new Color(5, 65, 91);

        // **************Panel*************

        fpanel1.setLayout(new BorderLayout());
        fpanel1.setPreferredSize(new Dimension(948, 70));

        fpanel2.setLayout(new BorderLayout());
        fpanel2.setPreferredSize(new Dimension(948, 35));

        fpanel3.setLayout(null);
        fpanel3.setPreferredSize(new Dimension(948, 70));

        fpanelbuttons.setLayout(new FlowLayout(8, 10, 20));
        fpanelbuttons.setBounds(80, 400, 765, 80);
        fpanelbuttons.setBackground(color1);

        // // ******************Button**********************88

        b1.setFont(new Font("Serif", Font.PLAIN, 22));
        b1.setBackground(color2);
        b1.setBounds(90, 490, 80, 102);
        b1.setForeground(Color.white);
        b1.addActionListener(this);

        b2.setFont(new Font("Serif", Font.PLAIN, 22));
        b2.setBounds(185, 405, 80, 102);
        b2.setBackground(color2);
        b2.setForeground(Color.white);
        b2.addActionListener(this);

        b3.setFont(new Font("Serif", Font.PLAIN, 22));
        b3.setBounds(185, 405, 80, 102);
        b3.setBackground(color2);
        b3.setForeground(Color.white);

        b4.setFont(new Font("Serif", Font.PLAIN, 22));
        b4.setBounds(185, 405, 80, 102);
        b4.setBackground(color2);
        b4.setForeground(Color.white);

        b5.setFont(new Font("Serif", Font.PLAIN, 22));
        b5.setBounds(185, 405, 80, 102);
        b5.setBackground(color2);
        b5.setForeground(Color.white);

        b6.setFont(new Font("Serif", Font.PLAIN, 22));
        b6.setBounds(185, 405, 80, 102);
        b6.setBackground(color2);
        b6.setForeground(Color.white);
        b7.setFont(new Font("Serif", Font.PLAIN, 22));
        b7.setBounds(185, 405, 80, 102);
        b7.setBackground(color2);
        b7.setForeground(Color.white);

        // *********Label**********
        JLabel fPanel1title = new JLabel("File Handling Operations", SwingConstants.CENTER);
        fPanel1title.setForeground(Color.white);
        fPanel1title.setFont(new Font("Serif", Font.BOLD, 30));
        fPanel1title.setForeground(Color.white);

        JLabel fPanel2title = new JLabel("Made with <3 by Pranshu", SwingConstants.CENTER);
        fPanel2title.setForeground(Color.white);
        fPanel2title.setFont(new Font("Serif", Font.BOLD, 20));

        JLabel txthead = new JLabel("Write Your Text Below");
        txthead.setForeground(Color.white);
        txthead.setFont(new Font("Serif", Font.BOLD, 22));
        txthead.setBounds(320, 18, 500, 20);

        JLabel searchByF = new JLabel("Search by filter :");
        searchByF.setForeground(Color.white);
        searchByF.setFont(new Font("Serif", Font.BOLD, 22));
        searchByF.setBounds(80, 300, 250, 30);

        JLabel tCountlabel = new JLabel("Total Count :");
        tCountlabel.setForeground(Color.white);
        tCountlabel.setFont(new Font("Serif", Font.BOLD, 22));
        tCountlabel.setBounds(500, 300, 250, 30);

        // // *************Text Field ***********888

        // usnamefield.setPreferredSize(new Dimension(283,30));
        txtarea.setBounds(80, 50, 765, 230);
        txtarea.setFont(new Font("Serif", Font.BOLD, 22));
        txtarea.setLineWrap(true);
        txtarea.setWrapStyleWord(true);
        // txtarea.setText();

        searcharea.setBounds(250, 303, 230, 30);
        searcharea.setFont(new Font("Serif", Font.BOLD, 22));

        tCountfield.setBounds(650, 303, 200, 30);
        tCountfield.setFont(new Font("Serif", Font.BOLD, 22));

        fpanel1.setBackground(color1);
        fpanel2.setBackground(color1);
        fpanel3.setBackground(color2);

        // **********Container ****************
        fpanel1.add(fPanel1title, BorderLayout.CENTER);
        fpanel2.add(fPanel2title, BorderLayout.CENTER);
        fpanelbuttons.add(b1);
        fpanelbuttons.add(b2);
        fpanelbuttons.add(b3);
        fpanelbuttons.add(b4);
        fpanelbuttons.add(b5);
        fpanelbuttons.add(b6);
        fpanelbuttons.add(b7);
        fpanel3.add(txthead);
        fpanel3.add(txtarea);
        fpanel3.add(searchByF);
        fpanel3.add(searcharea);
        fpanel3.add(tCountlabel);
        fpanel3.add(tCountfield);
        fpanel3.add(fpanelbuttons);

        fileframe.add(fpanel1, BorderLayout.NORTH);
        fileframe.add(fpanel2, BorderLayout.SOUTH);
        fileframe.add(fpanel3, BorderLayout.CENTER);
        fileframe.setVisible(true);

    }

    public void writer(String s) throws Exception {
        Writer wr = new FileWriter("text.txt");
        wr.write(s);
        wr.close();
    }
    public void append(String s) throws Exception {
        Writer wr = new FileWriter("text.txt");
        wr.write(s);
        wr.close();
    }
    public void reader() throws Exception {
        // Reader r=new FileReader("text.txt");
        Reader re = new FileReader("text.txt");
        int data = re.read();
        int i=0;
        char[] chararr=new char[50];
        chararr[0]=(char) data;
        while (data != -1) {
            // System.out.print((char) data);
            data = re.read();
            i++;
            chararr[i]=(char)data;
            

        }
        String str=String.valueOf(chararr);
        txtarea.setText(str);
        System.out.print(str);
        re.close();
    }

    public void actionPerformed(ActionEvent s) {
        if (s.getSource() == b1) {
            String txt = txtarea.getText();

            try {
                this.writer(txt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (s.getSource() == b2) {
            try {
                this.reader();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        fileframe.setVisible(true);
    }

}

class WelcomePage extends JFrame implements ActionListener {
    /* Assets of Welcome Page */
    String superuser = "pranshu";
    String superpass = "pass1234";
    JFrame frame = new JFrame();
    JButton lb1 = new JButton("Submit");
    JButton lb2 = new JButton("Cancel");
    JTextField usnamefield = new JTextField(10);
    JPasswordField passfield = new JPasswordField();

    WelcomePage() {
        ImageIcon img = new ImageIcon("download.png");
        frame.setIconImage(img.getImage());
        frame.setTitle("Log in Page ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(702, 455);
        frame.setResizable(false);// (FlowLayout.CENTER,2,10)
        frame.setLayout(new BorderLayout(5, 5));

        // **************Panel*************
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setPreferredSize(new Dimension(680, 70));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.setPreferredSize(new Dimension(680, 35));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(10, 10));
        panel3.setPreferredSize(new Dimension(680, 333));

        JPanel userpass = new JPanel();
        userpass.setLayout(null);
        userpass.setPreferredSize(new Dimension(555, 286));

        // ******************Button**********************88

        lb1.setFont(new Font("Serif", Font.BOLD, 22));
        lb1.setBounds(210, 165, 135, 37);
        lb2.setFont(new Font("Serif", Font.BOLD, 22));
        lb2.setBounds(357, 165, 135, 37);
        lb1.addActionListener(this);

        // *********Label**********
        JLabel login = new JLabel("Log in Page", SwingConstants.CENTER);
        login.setForeground(Color.white);
        login.setFont(new Font("Serif", Font.BOLD, 30));
        login.setForeground(Color.white);

        JLabel cprt = new JLabel("Made with <3 by Pranshu", SwingConstants.CENTER);
        cprt.setForeground(Color.white);
        cprt.setFont(new Font("Serif", Font.BOLD, 15));

        JLabel usname = new JLabel("Username:");
        usname.setForeground(Color.white);
        usname.setFont(new Font("Serif", Font.BOLD, 22));
        usname.setBounds(90, 50, 200, 20);

        JLabel pass = new JLabel("Password : ");
        pass.setForeground(Color.white);
        pass.setFont(new Font("Serif", Font.BOLD, 22));
        pass.setBounds(90, 110, 200, 20);

        // *************Text Field ***********888

        usnamefield.setBounds(210, 45, 283, 35);
        usnamefield.setFont(new Font("Serif", Font.BOLD, 22));

        passfield.setFont(new Font("Serif", Font.BOLD, 22));
        passfield.setBounds(210, 105, 283, 35);

        // ************Color***********
        Color color1 = new Color(95, 85, 92);
        Color color2 = new Color(5, 65, 91);

        panel1.setBackground(color1);
        panel2.setBackground(color1);
        panel3.setBackground(color2);
        userpass.setBackground(color2);
        // **********Container ****************
        panel1.add(login, BorderLayout.CENTER);
        panel2.add(cprt, BorderLayout.CENTER);

        userpass.add(usname);
        userpass.add(pass);
        userpass.add(usnamefield);
        userpass.add(passfield);
        userpass.add(lb1);
        userpass.add(lb2);
        panel3.add(userpass, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent s) {
        if (s.getSource() == lb1) {
            String x = usnamefield.getText();
            String y = String.valueOf(passfield.getPassword());
            System.out.println(x);
            System.out.println(y);
            if (x.equals(superuser) && y.equals(superpass)) {
                frame.dispose();
                FileHandlePage ob = new FileHandlePage();
            }
        }
    }
}

class MainMethod {
    public static void main(String[] args) {

        WelcomePage wp = new WelcomePage();

    }
}
