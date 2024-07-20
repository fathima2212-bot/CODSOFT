import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGui {
    private JFrame frame;
    private JTextField nameField;
    private JTextField rollNumberField;
    private JTextField gradeField;

    public StudentGui() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(100, 30));

        JLabel rollNumberLabel = new JLabel("Roll Number:");
        rollNumberField = new JTextField();
        rollNumberField.setPreferredSize(new Dimension(100, 30));

        JLabel gradeLabel = new JLabel("Grade:");
        gradeField = new JTextField();
        gradeField.setPreferredSize(new Dimension(100, 30));

       
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollNumberLabel);
        frame.add(rollNumberField);

        frame.add(gradeLabel);
        frame.add(gradeField);

       
        JButton addButton = new JButton("Add Student");
        addButton.setPreferredSize(new Dimension(200, 50));
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String name = nameField.getText();
                int rollNumber = Integer.parseInt(rollNumberField.getText());
                String grade = gradeField.getText();
                Student student = new Student(name, rollNumber, grade);
                

                int option = JOptionPane.showConfirmDialog(frame, "Student added successfully. Do you want to add another student?");
                if (option == JOptionPane.YES_OPTION) {
                    
                    nameField.setText("");
                    rollNumberField.setText("");
                    gradeField.setText("");
                } else {
                    System.exit(0);
                }
            }
        });

        JButton removeButton = new JButton("Remove Student");
        removeButton.setPreferredSize(new Dimension(200, 50));
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                int rollNumber = Integer.parseInt(rollNumberField.getText());
                
                int option = JOptionPane.showConfirmDialog(frame, "Student removed successfully. Do you want to remove another student?");
                if (option == JOptionPane.YES_OPTION) {
                    
                    rollNumberField.setText("");
                } else {
                    System.exit(0);
                }
            }
        });

        JButton searchButton = new JButton("Search Student");
        searchButton.setPreferredSize(new Dimension(200, 50));
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                int rollNumber = Integer.parseInt(rollNumberField.getText());
               

                int option = JOptionPane.showConfirmDialog(frame, "Student found. Do you want to search another student?");
                if (option == JOptionPane.YES_OPTION) {
                    // Clear text fields
                    rollNumberField.setText("");
                } else {
                    System.exit(0);
                }
            }
        });

        
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(searchButton);

        
        frame.setSize(600, 400); 
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentGui();
            }
        });
    }
}

