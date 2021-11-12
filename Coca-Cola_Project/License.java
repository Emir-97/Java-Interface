import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class License extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox box1;
  private JScrollPane scrollpane1;
  private JButton button1, button2;
  private JTextArea textarea1;
  String name = "";

  public License(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("License of use");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Welcome window_Welcome = new Welcome();
   name = window_Welcome.text;
   
   label1 = new JLabel("TERMS AND CONDITIONS");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono", 1, 14));
   label1.setForeground(new Color(0,0,0));
   add(label1);
 
   textarea1 = new JTextArea();
   textarea1.setEditable(false);
   textarea1.setFont(new Font("Andale Mono", 0, 9));
   textarea1.setText("\n\n          TERMS AND CONDITIONS" +
                     "\n\n          A. THEIR SALE OR DISTRIBUTION WITHOUT AUTHORIZATION OF EMIR ZAHIR ZATTA MIRANDA." +  
                     "\n          B. FORBIDDEN THE ALTERATION OF THE SOURCE CODE OR DESIGN OF THE GRAPHIC INTERFACES."  +
                     "\n          C. EMIR ZATTA IS NOT RESPONSIBLE FOR THE MISUSE OF THIS SOFTWARE." +
                     "\n\n          THE LEGAL AGREEMENTS SET FORTH BELOW GOVERN YOUR USE OF THIS SOFTWARE" +
                     "\n          (THE AUTHOR EMIR ZAHIR ZATTA MIRANDA), ARE NOT RESPONSIBLE FOR THE USE THAT YOU" +
                     "\n          PLEASE USE THIS SOFTWARE AND ITS SERVICES. TO ACCEPT THESE TERMS CLICK ON (I ACCEPT)" +
                     "\n          IF YOU DO NOT AGREE TO THESE TERMS, CLICK ON (I DO NOT AGREE) AND DO NOT USE THIS SOFTWARE." + 
                     "\n\n          FOR MORE INFORMATION ABOUT OUR PRODUCTS OR SERVICES, PLEASE VISIT" + 
                     "\n              http://www.facebook.com");
   scrollpane1 = new JScrollPane(textarea1);
   scrollpane1.setBounds(10,40,575,200);
   add(scrollpane1);

   box1 = new JCheckBox("I " + name + " Accept");
   box1.setBounds(10,250,300,30);
   box1.addChangeListener(this);
   add(box1);
    
   button1 = new JButton("Continue");
   button1.setBounds(10,290,100,30);
   button1.addActionListener(this);
   button1.setEnabled(false);
   add(button1);

   button2 = new JButton("I don't Accept");
   button2.setBounds(120,290,100,30);
   button2.addActionListener(this);
   button2.setEnabled(true);
   add(button2);  

   ImageIcon image =  new ImageIcon("images/coca-cola.png");
   label2 = new JLabel(image);
   label2.setBounds(315,135,300,300);
   add(label2);

 }

  public void stateChanged(ChangeEvent e){
   if(box1.isSelected() == true){
    button1.setEnabled(true);
    button2.setEnabled(false);
  } else{
    button1.setEnabled(false);
    button2.setEnabled(true);
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == button1){
    Principal prin1 = new Principal();
    prin1.setBounds(0,0,640,535);
    prin1.setVisible(true);
    prin1.setResizable(false);
    prin1.setLocationRelativeTo(null);
    this.setVisible(false);

  } else if(e.getSource() == button2){
    Welcome wel1 = new Welcome();
    wel1.setBounds(0,0,350,450);
    wel1.setVisible(true);
    wel1.setResizable(false);
    wel1.setLocationRelativeTo(null);
    this.setVisible(false);

  }
 }

  public static void main(String  args[]){
   License windowlicense = new License();
   windowlicense.setBounds(0,0,600,360);
   windowlicense.setVisible(true);
   windowlicense.setResizable(false);
   windowlicense.setLocationRelativeTo(null);
 }
}