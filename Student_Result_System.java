import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_Result_System extends JFrame {

        private JTextField studentIDTextField;
        private JTextField firstNameTextField;
        private JTextField surnameTextField;
        private JComboBox <String> courseCodeComboBox;
        private JTextField totalScoreTextField;
        private JTextField rankingTextField;
        private JTextField mathsTextField;
        private JTextField englishTextField;
        private JTextField biologyTextField;
        private JTextField computingTextField;
        private JTextField chemistryTextField;
        private JTextField physicsTextfield;
        private JTextField addmathsTextField;
        private JTextField businessTextField;
        private JTextArea gradesTextArea;
        private JButton rankingButton;
        private JButton transcriptButton;
        private JButton deleteButton;
        private JButton resetButton;
        private JButton exitButton;
        private JTextField averageTextField;
    private JPanel Student_Result_System;
    private JLabel Student_ID;
    private JLabel Firstname;
    private JLabel Surname;
    private JLabel Course_Code;
    private JLabel Total_Score;
    private JLabel Average;
    private JLabel Ranking;
    private JLabel Maths;
    private JLabel English;
    private JLabel Biology;
    private JLabel Computing;
    private JLabel Chemistry;
    private JLabel Physics;
    private JLabel Add_Maths;
    private JLabel Business;


    private String[] courseCodes = {"CS", "IT", "BBIT"};


    public Student_Result_System() {
            setContentPane(Student_Result_System);
            setTitle("Student Records");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(300, 200);
            setLocationRelativeTo(null);
            setVisible(true);

            courseCodeComboBox = new JComboBox<>(courseCodes);

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            rankingButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int maths = Integer.parseInt(mathsTextField.getText());
                        int english = Integer.parseInt(englishTextField.getText());
                        int biology = Integer.parseInt(biologyTextField.getText());
                        int computing = Integer.parseInt(computingTextField.getText());
                        int chemistry = Integer.parseInt(chemistryTextField.getText());
                        int physics = Integer.parseInt(physicsTextfield.getText());
                        int addMaths = Integer.parseInt(addmathsTextField.getText());
                        int business = Integer.parseInt(businessTextField.getText());

                        int totalScore = maths + english + biology + computing + chemistry + physics + addMaths + business;
                        double average = totalScore / 8.0;

                        totalScoreTextField.setText(String.valueOf(totalScore));
                        averageTextField.setText(String.format("%.2f", average));

                        if (average >= 70) {
                            rankingTextField.setText("A");
                        } else if (average >= 60) {
                            rankingTextField.setText("B");
                        } else if (average >= 50) {
                            rankingTextField.setText("C");
                        } else if (average >= 40) {
                            rankingTextField.setText("D");
                        } else {
                            rankingTextField.setText("F");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter numeric values for all subject scores.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            transcriptButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gradesTextArea.setText(
                            "Student ID: " + studentIDTextField.getText() + "\n" +
                                    "Name: " + firstNameTextField.getText() + surnameTextField.getText() +"\n" +
                                    "Course Code: " + courseCodeComboBox.getSelectedItem() + "\n" +
                                    "Maths: " + mathsTextField.getText() + "\n" +
                                    "English: " + englishTextField.getText() + "\n" +
                                    "Biology: " + biologyTextField.getText() + "\n" +
                                    "Chemistry: " + chemistryTextField.getText() + "\n" +
                                    "Physics: " + physicsTextfield.getText() + "\n" +
                                    "Add Maths: " + addmathsTextField.getText() + "\n" +
                                    "Business: " + businessTextField.getText() + "\n" +
                                    "Total score: " + totalScoreTextField.getText() + "\n" +
                                    "Average: " + averageTextField.getText() + "\n" +
                                    "Ranking: " + rankingTextField.getText()
                    );
                }
            });
            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            resetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    studentIDTextField.setText("");
                    firstNameTextField.setText("");
                    surnameTextField.setText("");
                    totalScoreTextField.setText("");
                    averageTextField.setText("");
                    rankingTextField.setText("");
                    mathsTextField.setText("");
                    englishTextField.setText("");
                    biologyTextField.setText("");
                    computingTextField.setText("");
                    chemistryTextField.setText("");
                    physicsTextfield.setText("");
                    addmathsTextField.setText("");
                    businessTextField.setText("");
                    gradesTextArea.setText("");
                }
            });
        }
    public static void main(String[] args){
        new Student_Result_System();
    }
}
