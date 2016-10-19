package handler;

import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.text.*;


public class styleHandler extends StyledEditorKit.StyledTextAction 
{
    public styleHandler()
    {
        super("styleHandler");
    }
    
  
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        JEditorPane editor = getEditor(evt);
        
        if (editor != null)
        {
            StyledEditorKit kit = getStyledEditorKit(editor);
            MutableAttributeSet attr = kit.getInputAttributes();
            SimpleAttributeSet sas = new SimpleAttributeSet();  
            
            boolean style;
            
            if(evt.getActionCommand().equals("boldButton"))
            {
                style = !(StyleConstants.isBold(attr));
                StyleConstants.setBold(sas, style);
            }
            if(evt.getActionCommand().equals("italicButton"))
            {
                style = !(StyleConstants.isItalic(attr));
                StyleConstants.setItalic(sas, style);
            }
            if(evt.getActionCommand().equals("underlineButton"))
            {
                style = !(StyleConstants.isUnderline(attr));
                StyleConstants.setUnderline(sas, style);
            }
            setCharacterAttributes(editor, sas, false);
        }
        
    }
}