package Jmeter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class DropDown {
	
	public static String hour="";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	 Database.dbValue();
    	
        String[] hours = {"01", "02", "03","04","05","06","07","08","09","10","11", "12", "13","14","16","17","18","19","20",
				"21", "22", "23","24"};
        
    	
    	
        String[] minutes = {"01", "02", "03","04","06","07","08","09","10","11", "12", "13","14","16","17","18","19","20",
        							"21", "22", "23","24","25","26","27","28","29","30", "31", "32","33","34","35","36","37","38",
        							"39", "40", "41","42","43","44","45","46","47","48", "49", "50","51","52","53","54","55","56",
        							"57", "58", "59"};

        
    	
    	
        String[] seconds = {"01", "02", "03","04","06","07","08","09","10","11", "12", "13","14","16","17","18","19","20",
        							"21", "22", "23","24","25","26","27","28","29","30", "31", "32","33","34","35","36","37","38",
        							"39", "40", "41","42","43","44","45","46","47","48", "49", "50","51","52","53","54","55","56",
        							"57", "58", "59"};


        JFrame jFrame = new JFrame();

        JComboBox<String> hours1 = new JComboBox<>(hours);
        hours1.setBounds(80, 50, 50, 20);
        

        JComboBox<String> minutes1 = new JComboBox<>(minutes);
        minutes1.setBounds(140, 50, 50, 20);
        

        JComboBox<String> seconds1 = new JComboBox<>(seconds);
        seconds1.setBounds(200, 50, 50, 20);

        JButton jButton = new JButton("Done");
        jButton.setBounds(100, 100, 90, 20);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(90, 100, 400, 100);

        jFrame.add(jButton);
        jFrame.add(hours1);
        jFrame.add(jLabel);
        jFrame.add(minutes1);
        jFrame.add(seconds1);
        
        jFrame.setLayout(null);
        jFrame.setSize(350, 250);
        jFrame.setVisible(true);
        
       
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFruit = hours1.getItemAt(hours1.getSelectedIndex());
             
                String minute23 = minutes1.getItemAt(minutes1.getSelectedIndex());
                
                String sec23 = seconds1.getItemAt(seconds1.getSelectedIndex());
                 
                System.out.println(selectedFruit+":"+minute23+":"+sec23);
               
            }
        });

    }
}