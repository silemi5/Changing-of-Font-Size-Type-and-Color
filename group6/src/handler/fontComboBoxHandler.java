package handler;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.text.*;


public class fontComboBoxHandler extends StyledEditorKit.StyledTextAction 
{
    private String selectedFont;
    private final JComboBox fontComboBox;
    private final JTextPane textPane;
    
    public fontComboBoxHandler(JTextPane textPane,JComboBox fontComboBox)
    {
        super("fontComboBoxHandler");
        
       this.fontComboBox = fontComboBox;
       this.textPane = textPane;
    }
    
  
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        JEditorPane editor = textPane;
        selectedFont = (String)fontComboBox.getSelectedItem();
        
        if (editor != null)
        {
            SimpleAttributeSet sas = new SimpleAttributeSet();
            
            if("fontComboBox".equals(evt.getActionCommand()))
                StyleConstants.setFontFamily(sas, selectedFont);
            
            setCharacterAttributes(editor, sas, false);
        }
        
        textPane.requestFocusInWindow();
        
    }
}