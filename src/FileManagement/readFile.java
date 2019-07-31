/*
 * Free
 */
package FileManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Simple file reader
 * @author Alex Martin
 */
public class readFile 
{
    
    /**
     * returns contents of a file in a list. pathName MUST be directory and name e.g. "/tmp/afile.txt"
     * @param pathName
     * @return 
     */
    public static List readFileContent(String pathName)
    {
        List<String> contents = new ArrayList<>();
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader(pathName));
            String line;
            while ((line = br.readLine()) != null) 
            {
                contents.add(line);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (br != null) 
                {
                    br.close();
                }
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }
        return contents;
    }
}
