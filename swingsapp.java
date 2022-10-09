import javax.swing.*;
import java.awt.event.*;

public class swingsapp implements ActionListener {
    JFrame j;
    JButton b;
    JTextField jt;
    JLabel l,k;
    JPasswordField pt;
    public swingsapp(){
        j=new JFrame("Welcome");
        l=new JLabel("Username:");
        l.setBounds(30,100,200,50);
        k=new JLabel("Password:");
        k.setBounds(30,200,200,50);
        jt=new JTextField();
        jt.setBounds(100,100,300,50);
        pt=new JPasswordField();
        pt.setBounds(100,200,300,50);
        b=new JButton("Click me");
        b.setBounds(200,300,100,100);
        b.addActionListener(this);
        j.add(b);
        j.add(l);
        j.add(k);
        j.add(jt);
        j.add(pt);
        j.setSize(500,500);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b)
            JOptionPane.showMessageDialog(j,"Welcome to Java:" + jt.getText());
    }
    public static void main(String[] args){
        new swingsapp();
    }
}
