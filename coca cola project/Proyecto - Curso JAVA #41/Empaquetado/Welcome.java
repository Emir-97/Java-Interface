import javax.swing.*;
import  java.awt.event.*;
import java.awt.*;

public class Welcome extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4;
  private JButton button1;

  public Welcome(){
   setLayout(null);
   setTitle("Welcome");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon imagen = ImageIcon("images/logo-coca.png");
   label1 = new JLabel(imagen);
   label1.setBounds(25,15,300,150);
   add(label1);

   label2 = new JLabel("Vacation system control");
   label2.setBounds(35,135,300,30);
   label2.setFont(new Font("Andale Mono", 3, 18));
   label2.setForeground(new Color(255,255,255));
   add(label2);

   label3 =  new JLabel("Input your name");
   label3.setBounds(45,212,200,30);
   label3.setFont(new Font("Andale Mono", 1, 12));
   label3.setForeground(new Color(255,255,255));
   add(label3);

   label4 = new JLabel("The Coca-Cola  Company 2021");
   label4.setBounds(85,375,300,30);
   label4.setFont(new Font("Andale Mono", 1, 12));
   label4.setForeground(new Color(255,255,255));
   add(label4);

   textfield1 = new JTextField();
   textfield1.setBounds(45,240,255,25);
   textfield1.setBackground(new Color(224,224,224));
   textfield1.setFont(new Font("Andale Mono", 1, 14));
   textfield1.setForeground(new Color(255,0,0));
   add(textfield1);

   button1 = new JButton();
   button1.setBounds(125,280,100,30);
   button1.setFont(new Font("Andale Mono", 1, 14));
   button1.setForeground(new Color(255,0,0));
   button1.addActionListener(this);
   add(button1);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getResource() == button1){

  }
 }


  public static void main(String args[]){
   Welcome wel1 = new Welcome();
   wel1.setBounds(0,0,350,450);
   wel1.setVisible(true);
   wel1.setResizable(false);
   wel1.setLocationRelativeTo(null);
 }


}