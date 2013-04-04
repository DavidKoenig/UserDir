import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UserDir {
	String userDirectory;
	UserDir() { this.userDirectory = System.getProperty("user.dir");}
	
	public void listStatus(String directory_ ) throws IOException {
		String type = null;
		
		File dir = null;
		dir = new File ( directory_ );
		
		for( String out : dir.list() ) {
			File file_ = new File( out );
			if(file_.isDirectory()) {
				type = "Ordner";
				System.out.println( out+"\t"+type );
				
				String atm = File.separator + out;
				listStatus(atm);
			}
			if(file_.isFile()) { 
				type = "Datei";
				System.out.println(out+"\t"+type);
			}
			

		}
	}
}
