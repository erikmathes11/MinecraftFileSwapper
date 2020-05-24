import java.io.*;
import javax.swing.*;
public class FileSwapper
{
    public static void main(String[] args)
    {
        boolean error = false;
        try
        {
            File settings = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\options.txt");
            File settings2 = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\options2.txt");
            File settingsTemp = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\options3.txt");
            settings.renameTo(settingsTemp);
            settingsTemp = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\options.txt");
            settings2.renameTo(settingsTemp);
            settingsTemp = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\options2.txt");
            settings = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\options3.txt");
            settings.renameTo(settingsTemp);

            File settingsOf = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\optionsof.txt");
            File settingsOf2 = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\optionsof2.txt");
            settingsTemp = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\optionsof3.txt");
            settingsOf.renameTo(settingsTemp);
            settingsTemp = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\optionsof.txt");
            settingsOf2.renameTo(settingsTemp);
            settingsTemp = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\optionsof2.txt");
            settingsOf = new File("C:\\Users\\" + System.getProperty("user.name") + "\\OneDrive\\optionsof3.txt");
            settingsOf.renameTo(settingsTemp);
        }
        catch (Exception e)
        {
            error = true;
        }
        if (error == true)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Switched");
        }
    }
}