
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
   
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox Religion,category,income,edu,Occupation;
    String formno;
    
    SignupTwo(String formno){
        
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        Religion = new JComboBox(valReligion);
        Religion.setBounds(300,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);
        
        JLabel dob = new JLabel("Category:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20)); 
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category .setBounds(300,240,400,30);
        category .setBackground(Color.WHITE);
        add(category );
        
       
        JLabel fname = new JLabel("Income:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valIncome[] = {"Null", "< 1.5L", "< 2.5L", "< 5L", "Upto 10L"};
        income = new JComboBox(valIncome);
        income.setBounds(300,190,400,30);
        income.setBackground(Color.WHITE);
        add(income );
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String valEducation[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        edu = new JComboBox(valEducation);
        edu.setBounds(300,315,400,30);
        edu.setBackground(Color.WHITE);
        add(edu );
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,360,200,30);
        add(marital);
        
        String valOccupation[] = {"Salaried Employee", "Self Employed", "Businessman", "Student", "Retired","Others"};
        Occupation = new JComboBox(valOccupation);
        Occupation.setBounds(300,360,400,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation );
        
        JLabel address = new JLabel("PAN number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setBounds(300,440,400,30);
        pan.setFont(new Font("Arial", Font.BOLD,14));
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setBounds(300,490,400,30);
        aadhar.setFont(new Font("Arial", Font.BOLD,14));
        add(aadhar);
        
        
         JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup mp = new ButtonGroup();
        mp.add(syes);
        mp.add(sno);
        
         JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup ep = new ButtonGroup();
        mp.add(syes);
        mp.add(sno);
        
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
        //String formno = "" + random;
        String sreligion = (String)Religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome =  (String)income.getSelectedItem();
        String sedu =  (String)edu.getSelectedItem();
        String sOccupation =  (String)Occupation.getSelectedItem();
        String seniorCitizen = null;
        if(syes.isSelected()){
            seniorCitizen = "Yes";
        }else if(sno.isSelected()){
            seniorCitizen = "No";
        }
        
        String existingAcc = null;
        if(eyes.isSelected()){
            existingAcc = "Yes";
        }else if(eno.isSelected()){
            existingAcc = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText(); 
        
        try{
               Conn c = new Conn();
               String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+sedu+"','"+sOccupation+"','"+span+"','"+saadhar+"','"+seniorCitizen+"','"+existingAcc+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignupThree(formno);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
    
}

