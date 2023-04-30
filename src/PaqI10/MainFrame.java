package PaqI10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JLabel IDNumberLabel;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JRadioButton a1RadioButton;
    private JRadioButton a3RadioButton;
    private JRadioButton a2RadioButton;
    private JTextField textField2;
    private JLabel weightTonsLabel;
    private JLabel countryLabel;
    private JLabel priorityLabel;
    private JLabel companyLogoLabel;
    private JLabel descriptionLabel;
    private JTextArea textArea1;
    private JLabel remitentCompanyLabel;
    private JTextField textField3;
    private JLabel receiverCompanyLabel;
    private JTextField textField4;
    private JButton pileButton;
    private JButton unpileButton;
    private JLabel operationsLabel;
    private JButton showContainerDescriptionButton;
    private JButton numberOfContainersButton;
    private JComboBox comboBox2;
    private JTextField putNumberHereTextField;
    private JCheckBox customInspectionCheckBox;
    private JTextArea textArea2;
    private JTextField columnNumberTextField;
    private JTextArea descriptionIsShownHereTextArea;
    private JTextField hubnumtextField;
    private JLabel labelIcon;

    public JTextField getHubnumtextField() {
        return hubnumtextField;
    }

    public void setHubnumtextField(JTextField hubnumtextField) {
        this.hubnumtextField = hubnumtextField;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JLabel getIDNumberLabel() {
        return IDNumberLabel;
    }

    public void setIDNumberLabel(JLabel IDNumberLabel) {
        this.IDNumberLabel = IDNumberLabel;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JRadioButton getA1RadioButton() {
        return a1RadioButton;
    }

    public void setA1RadioButton(JRadioButton a1RadioButton) {
        this.a1RadioButton = a1RadioButton;
    }

    public JRadioButton getA3RadioButton() {
        return a3RadioButton;
    }

    public void setA3RadioButton(JRadioButton a3RadioButton) {
        this.a3RadioButton = a3RadioButton;
    }

    public JRadioButton getA2RadioButton() {
        return a2RadioButton;
    }

    public void setA2RadioButton(JRadioButton a2RadioButton) {
        this.a2RadioButton = a2RadioButton;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JLabel getWeightTonsLabel() {
        return weightTonsLabel;
    }

    public void setWeightTonsLabel(JLabel weightTonsLabel) {
        this.weightTonsLabel = weightTonsLabel;
    }

    public JLabel getCountryLabel() {
        return countryLabel;
    }

    public void setCountryLabel(JLabel countryLabel) {
        this.countryLabel = countryLabel;
    }

    public JLabel getPriorityLabel() {
        return priorityLabel;
    }

    public void setPriorityLabel(JLabel priorityLabel) {
        this.priorityLabel = priorityLabel;
    }

    public JLabel getCompanyLogoLabel() {
        return companyLogoLabel;
    }

    public void setCompanyLogoLabel(JLabel companyLogoLabel) {
        this.companyLogoLabel = companyLogoLabel;
    }

    public JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    public void setDescriptionLabel(JLabel descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JLabel getRemitentCompanyLabel() {
        return remitentCompanyLabel;
    }

    public void setRemitentCompanyLabel(JLabel remitentCompanyLabel) {
        this.remitentCompanyLabel = remitentCompanyLabel;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JLabel getReceiverCompanyLabel() {
        return receiverCompanyLabel;
    }

    public void setReceiverCompanyLabel(JLabel receiverCompanyLabel) {
        this.receiverCompanyLabel = receiverCompanyLabel;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public JButton getPileButton() {
        return pileButton;
    }

    public void setPileButton(JButton pileButton) {
        this.pileButton = pileButton;
    }

    public JButton getUnpileButton() {
        return unpileButton;
    }

    public void setUnpileButton(JButton unpileButton) {
        this.unpileButton = unpileButton;
    }

    public JLabel getOperationsLabel() {
        return operationsLabel;
    }

    public void setOperationsLabel(JLabel operationsLabel) {
        this.operationsLabel = operationsLabel;
    }

    public JButton getShowContainerDescriptionButton() {
        return showContainerDescriptionButton;
    }

    public void setShowContainerDescriptionButton(JButton showContainerDescriptionButton) {
        this.showContainerDescriptionButton = showContainerDescriptionButton;
    }

    public JButton getNumberOfContainersButton() {
        return numberOfContainersButton;
    }

    public void setNumberOfContainersButton(JButton numberOfContainersButton) {
        this.numberOfContainersButton = numberOfContainersButton;
    }

    public JComboBox getComboBox2() {
        return comboBox2;
    }

    public void setComboBox2(JComboBox comboBox2) {
        this.comboBox2 = comboBox2;
    }

    public JTextField getPutNumberHereTextField() {
        return putNumberHereTextField;
    }

    public void setPutNumberHereTextField(JTextField putNumberHereTextField) {
        this.putNumberHereTextField = putNumberHereTextField;
    }

    public JCheckBox getCustomInspectionCheckBox() {
        return customInspectionCheckBox;
    }

    public void setCustomInspectionCheckBox(JCheckBox customInspectionCheckBox) {
        this.customInspectionCheckBox = customInspectionCheckBox;
    }

    public JTextArea getTextArea2() {
        return textArea2;
    }

    public void setTextArea2(JTextArea textArea2) {
        this.textArea2 = textArea2;
    }

    public JTextField getColumnNumberTextField() {
        return columnNumberTextField;
    }

    public void setColumnNumberTextField(JTextField columnNumberTextField) {
        this.columnNumberTextField = columnNumberTextField;
    }

    public JTextArea getDescriptionIsShownHereTextArea() {
        return descriptionIsShownHereTextArea;
    }

    public void setDescriptionIsShownHereTextArea(JTextArea descriptionIsShownHereTextArea) {
        this.descriptionIsShownHereTextArea = descriptionIsShownHereTextArea;
    }

    public JLabel getlabelIcon() {
        return labelIcon;
    }

    public void setlabelIcon(JLabel labelIcon) {
        this.labelIcon = labelIcon;
    }


    public MainFrame() {

        setTitle("Hub");
        setContentPane(mainPanel);
        setSize(900, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Hubs hub1 = new Hubs();
        Hubs hub2 = new Hubs();
        Hubs hub3 = new Hubs();
        companyLogoLabel.setSize(250,180);



        pileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(textField1.getText());
                    int weight = Integer.parseInt(textField2.getText());
                    if (!a1RadioButton.isSelected() && !a2RadioButton.isSelected() && !a3RadioButton.isSelected()) {
                        throw new Exception("Priority not assessed, please select it");
                    } } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(MainFrame.this, "ID Number and Weight must be integers", "Wrong Input", JOptionPane.ERROR_MESSAGE);
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(MainFrame.this, exception.getMessage(), "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Containers cont1 = new Containers();
                cont1.setIdentifier(Integer.parseInt(textField1.getText()));
                cont1.setWeight(Integer.parseInt(textField2.getText()));
                cont1.setDescription(textArea1.getText());
                cont1.setCompanySend(textField3.getText());
                cont1.setCompanyReceives(textField4.getText());
                cont1.setCountryOrigin((String) comboBox1.getSelectedItem());
                cont1.setCustoms(customInspectionCheckBox.isSelected());
                if (a1RadioButton.isSelected()) {
                    cont1.priority = 1;
                } else if (a2RadioButton.isSelected()) {
                    cont1.priority = 2;
                } else if (a3RadioButton.isSelected()) {
                    cont1.priority = 3;
                }

                if(hub1.setContainer(cont1)==true){
                    textArea2.setText("Hub 1\n"+hub1.printHub());
                }
                else if(hub1.setContainer(cont1)==false){
                    if(hub2.setContainer(cont1)==true){
                        textArea2.setText("Hub 2\n" + hub2.printHub());
                    }
                    else if(hub2.setContainer(cont1)==false){
                        try{
                            if(hub3.setContainer(cont1)==false){
                                throw new Exception("This column of the hubs is full");
                            }}catch(Exception excp){
                            JOptionPane.showMessageDialog(MainFrame.this,excp.getMessage(),"Full", JOptionPane.ERROR_MESSAGE);
                        }
                        textArea2.setText("Hub 3\n" + hub3.printHub());
                    }
                }



            }
        });

        unpileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int column = Integer.parseInt(columnNumberTextField.getText());
                int hub = Integer.parseInt(hubnumtextField.getText());
                if(hub == 1){
                    try{
                       if(hub1.delete_container(column)==false){
                           throw new Exception("There are no containers in this column of hub 1");
                       }}catch(Exception excp){
                        JOptionPane.showMessageDialog(MainFrame.this,excp.getMessage(),"Empty", JOptionPane.ERROR_MESSAGE);
                    }
                    textArea2.setText("Hub 1\n" + hub1.printHub());
                }
                else if(hub==2){
                    try{
                        if(hub2.delete_container(column)==false){
                            throw new Exception("There are no containers in this column of hub 2");
                        }}catch(Exception excp){
                        JOptionPane.showMessageDialog(MainFrame.this,excp.getMessage(),"Empty", JOptionPane.ERROR_MESSAGE);
                    }
                    textArea2.setText("Hub 2\n" + hub2.printHub());
                }
                else if(hub == 3){
                    try{
                        if(hub3.delete_container(column)==false){
                            throw new Exception("There are no containers in this column of hub 3");
                        }}catch(Exception excp){
                        JOptionPane.showMessageDialog(MainFrame.this,excp.getMessage(),"Empty", JOptionPane.ERROR_MESSAGE);
                    }
                    textArea2.setText("Hub 3\n" + hub3.printHub());

                }


            }
        });

        showContainerDescriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textField1.getText());
                descriptionIsShownHereTextArea.setText(hub1.showDescription(id));
            }
        });


        numberOfContainersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == numberOfContainersButton) {
                    String country = (String) comboBox2.getSelectedItem();
                    int count = (int) hub1.countContainers(country)+ hub2.countContainers(country) + hub3.countContainers(country);
                    putNumberHereTextField.setText(" " + count);
                }
            }
        });
    }

    public static void main(String[] args) {
        MainFrame prueba = new MainFrame();

    }

}

