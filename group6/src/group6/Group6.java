package group6;

import javax.swing.UIManager;

public class Group6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Sets the look and feel of the program.
        try
        {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e)
        {
            System.out.print("Exception: " + e.getMessage());
        }
        new mainFrame().setVisible(true);
    }
    
}
