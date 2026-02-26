package service;
import java.io.InputStream;
import dao.dataBase;
import service.saveFile;

public class dataProcess {
	public void process(String name , String password,InputStream in,String fileName) {
		
		saveFile save = new saveFile();
		save.fileSave(in,fileName,name);
		
		dataBase obj = new dataBase();
		obj.saveUser(name, password, fileName);
		
		
	}
}
