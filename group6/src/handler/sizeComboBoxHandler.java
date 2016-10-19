package handler;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.*;


public class sizeComboBoxHandler extends StyledEditorKit.StyledTextAction
{
    private int size;
    private final JComboBox sizeComboBox;
    private final JTextPane textPane;
    
    public sizeComboBoxHandler(JComboBox temp, JTextPane textPane)
    {
        super("sizeComboBox");
        sizeComboBox = temp;
        this.textPane = textPane;
    }
    
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        try
        {
            size = Integer.parseInt((String)sizeComboBox.getEditor().getItem());
            textPane.requestFocusInWindow();

            JEditorPane editor = textPane;

            if (editor != null)
            {
                SimpleAttributeSet sas = new SimpleAttributeSet();

                StyleConstants.setFontSize(sas, size);
                setCharacterAttributes(editor, sas, false);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid input!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}