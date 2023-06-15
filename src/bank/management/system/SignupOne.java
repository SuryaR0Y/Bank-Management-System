
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField ntf,ftf,etf,atf,ctf,stf,ptf;
    JButton next;
    JRadioButton male,female,other,married,unmarried,oth;
    JDateChooser dc;
    
    SignupOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        ntf = new JTextField();
        ntf.setBounds(300,140,400,30);
        ntf.setFont(new Font("Arial", Font.BOLD,14));
        add(ntf);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dc = new JDateChooser();
        dc.setBounds(300,240,400,30);
        dc.setForeground(new Color(105,105,105));
        add(dc);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        ftf = new JTextField();
        ftf.setBounds(300,190,400,30);
        ftf.setFont(new Font("Arial", Font.BOLD,14));
        add(ftf);
        
         JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,80,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        other = new JRadioButton("Others");
        other.setBounds(600,290,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gp = new ButtonGroup();
        gp.add(male);
        gp.add(female);
        gp.add(other);
        
         JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        etf = new JTextField();
        etf.setBounds(300,340,400,30);
        etf.setFont(new Font("Arial", Font.BOLD,14));
        add(etf);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        oth = new JRadioButton("Others");
        oth.setBounds(600,390,100,30);
        oth.setBackground(Color.WHITE);
        add(oth);
        
         ButtonGroup mp = new ButtonGroup();
        mp.add(married);
        mp.add(unmarried);
        mp.add(oth);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        atf = new JTextField();
        atf.setBounds(300,440,400,30);
        atf.setFont(new Font("Arial", Font.BOLD,14));
        add(atf);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        ctf = new JTextField();
        ctf.setBounds(300,490,400,30);
        ctf.setFont(new Font("Arial", Font.BOLD,14));
        add(ctf);
        
         JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stf = new JTextField();
        stf.setBounds(300,540,400,30);
        stf.setFont(new Font("Arial", Font.BOLD,14));
        add(stf);
        
         JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        ptf = new JTextField();
        ptf.setBounds(300,590,400,30);
        ptf.setFont(new Font("Arial", Font.BOLD,14));
        add(ptf);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
        setLocation(350,50);
}
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = ntf.getText();
        String fname = ftf.getText();
        String dob = ((JTextField) dc.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }else if(other.isSelected()){
            gender = "Others";
        }
        
        String email = etf.getText();
        
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(oth.isSelected()){
            marital = "Others";
        }
        
        String address = atf.getText();
        String city = ctf.getText();
        String state = stf.getText();
        String pin = ptf.getText(); 
        
        try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null, "Name is required");
           } else if(fname.equals("")){
               JOptionPane.showMessageDialog(null, "Father's Name is required");
           } else if(dob.equals("")){
               JOptionPane.showMessageDialog(null, "Date of Birth is required");
           } else if(gender.equals("")){
               JOptionPane.showMessageDialog(null, "Gender is required");
           } else if(email.equals("")){
               JOptionPane.showMessageDialog(null, "Email is required");
           } else if(marital.equals("")){
               JOptionPane.showMessageDialog(null, "Marital Status is required");
           } else if(address.equals("")){
               JOptionPane.showMessageDialog(null, "Address is required");
           } else if(city.equals("")){
               JOptionPane.showMessageDialog(null, "City is required");
           } else if(state.equals("")){
               JOptionPane.showMessageDialog(null, "State is required");
           } else if(pin.equals("")){
               JOptionPane.showMessageDialog(null, "Pin Code is required");
           } else{
               Conn c = new Conn();
               String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignupTwo(formno).setVisible(true);
           }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
    
}
