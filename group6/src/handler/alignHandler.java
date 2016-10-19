package handler;

import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.text.*;


public class alignHandler extends StyledEditorKit.StyledTextAction 
{
    private final JTextPane textPane;
    
    public alignHandler(JTextPane textPane)
    {
        super("alignHandler");
        this.textPane = textPane;
    }
    
  
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        JEditorPane editor = textPane;

        if (editor != null)
        {
            SimpleAttributeSet sas = new SimpleAttributeSet();
            
            if(evt.getActionCommand().equals("alignCenter"))
                StyleConstants.setAlignment(sas, StyleConstants.ALIGN_CENTER);
            
            if(evt.getActionCommand().equals("alignLeft"))
                StyleConstants.setAlignment(sas, StyleConstants.ALIGN_LEFT);
            
            if(evt.getActionCommand().equals("alignRight"))
                StyleConstants.setAlignment(sas, StyleConstants.ALIGN_RIGHT);
            
            if(evt.getActionCommand().equals("alignJustified"))
                StyleConstants.setAlignment(sas, StyleConstants.ALIGN_JUSTIFIED);
            
            setParagraphAttributes(editor, sas, false);
        }
    }
}