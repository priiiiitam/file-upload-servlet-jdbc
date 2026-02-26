package service;
import java.io.*;
public class saveFile {

	public void fileSave(InputStream in , String fileName , String userName) {
		
		String path = "C:\\Users\\ADMIN\\Desktop\\DataStroeToSendInsideDataBase";
		File obj = new File(path);
		if(!obj.exists()) {
			obj.mkdirs();
		}
		
		File file = new File(obj,fileName);
		
		try(InputStream input = in; FileOutputStream output = new FileOutputStream(file)){
			// A container which will store the incoming bytes 
			byte[] buff = new byte[8192];
			//store how many bytes actually read
			int byteRead;
			
			//this will read the byte from the stream put them into buffer and return number of byte read when end of stream reach and save that number into byte read
			while((byteRead = input.read(buff))!=-1) {
				//it will write from buffer starts at index 0 write byteRead
				output.write(buff,0,byteRead);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
