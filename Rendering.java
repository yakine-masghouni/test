import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Rendering {
	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Users\\Yakine Masghouni\\Desktop\\digitalberry\\cv.pdf");
		//lire le fichier pdf
		try
        {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		String file=file1.toString();//conversion en une chaine pour accéder au nom du fichier
		String extension = "";//variable pour recuperer l extension actuelle du fichier
		int i = file.lastIndexOf('.');//indice du point(.) dans le nom du fichier 
		if (i > 0) {
			extension = file.substring(i+1); //prendre la partie du chaine apres le point
			String n= "png";
			File file2 =new File(file.replaceAll(extension,n));//remplacement de l extension pdf par png
		    file2.createNewFile(); //creation d un nouveau fichier sous l extension .png
		    System.out.println("File extension is : "+file2);
		}
		
		
	}
 
}
