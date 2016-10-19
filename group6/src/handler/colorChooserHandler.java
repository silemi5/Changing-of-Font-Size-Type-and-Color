package handler;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

public class colorChooserHandler extends StyledEditorKit.StyledTextAction
{
    private JEditorPane editor;
    private final JTextPane textPane;
    private final JPanel panel;
    private Color color;
    
    public colorChooserHandler(JTextPane textPane, JPanel panel)
    {
        super("colorChooser");
        this.textPane = textPane;
        this.panel = panel;
    }
    
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        editor = textPane;
        
        if (editor != null)
        {
            SimpleAttributeSet sas = new SimpleAttributeSet();
            
            color = JColorChooser.showDialog(((Component) evt.getSource())
                .getParent(), "Choose a color", Color.black);
            
            if(color != null)
            {
                if (evt.getActionCommand().equals("backgroundButton"))
                {
                    StyleConstants.setBackground(sas, color);
                    panel.setBackground(color);
                }
                
                if (evt.getActionCommand().equals("foregroundButton"))
                {
                    StyleConstants.setForeground(sas, color);
                    panel.setBackground(color);
                }
                
                setCharacterAttributes(editor, sas, false);
            }
        }
    }
}