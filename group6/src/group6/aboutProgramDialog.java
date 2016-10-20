package group6;

public class aboutProgramDialog extends javax.swing.JDialog
{

    /**
     * Creates new form aboutProgramDialog
     */
    public aboutProgramDialog(java.awt.Frame mainFrame, boolean modal)
    {
        super(mainFrame, modal);
        
        initComponents();
        
        //sets the window to the center of the screen, regardless of size.
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        aboutTextArea = new javax.swing.JTextArea();
        wmsu_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About this program");

        aboutTextArea.setEditable(false);
        aboutTextArea.setBackground(new java.awt.Color(240, 240, 240));
        aboutTextArea.setColumns(20);
        aboutTextArea.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        aboutTextArea.setLineWrap(true);
        aboutTextArea.setRows(5);
        aboutTextArea.setText("Changing of Font Size, Type, and Color.\nVersion 1.0\n\nCopyright (c) 2016 silemi5\n\nThis program is created for the purpose of fulfilling the partial requirement\nin Object Oriented Programming subject.\n-----------------------------\nFinal code as of October 6, 2016");
        aboutTextArea.setWrapStyleWord(true);
        aboutTextArea.setCaretPosition(0);
        jScrollPane1.setViewportView(aboutTextArea);

        wmsu_logo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        wmsu_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wmsu_logo.setText("Changing of Font Size, Type, and Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wmsu_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wmsu_logo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel wmsu_logo;
    // End of variables declaration//GEN-END:variables
}
