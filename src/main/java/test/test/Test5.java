package test.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class Test5 {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		String s="11718.67 ";
//		s=s.replaceAll(" ", "");
//		System.out.println(s.trim());
//		String ss="11718.67 ";
//		System.out.println(ss.trim());
		
//		Object obj = new Object();
//        synchronized (obj) {
//        	try {
//				obj.wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//        	obj.notify();
//		}
		
		
//		Socket socket=new Socket();
//		SocketAddress sa=new SocketAddress() {
//			
//		};
//		DatagramSocket ds;
//		ServerSocket ss;
		
		
		
//		byte b = 0x35; //0011 0101
//	    System.out.println(byteToBit(b));  
	    // JDK自带的方法，会忽略前面的 0  
//	    System.out.println(Integer.toBinaryString(500));  
	    
//		System.out.println(System.currentTimeMillis());
		
		
		File zipFile = new File("F:\\downloadfile\\test.zip");
        File parent = zipFile.getParentFile(); 
        if(parent!=null&&!parent.exists()){ 
        	parent.mkdirs(); 
        } 
        if(zipFile.exists()){
        	zipFile.delete();
        }
        try {
			zipFile.createNewFile();
			ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
			
			File files=new File("F:\\configpath");
			File[] fileArr=files.listFiles();
			
			for(File file:fileArr){
			    InputStream input = new FileInputStream(file);
			    zipOut.putNextEntry(new ZipEntry(file.getName()));
				byte[] b = new byte[2048];
				int length;
				while ((length = input.read(b)) > 0) {
					zipOut.write(b, 0, length);
				}
			    input.close();
			}
			zipOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	 /** 
     * 把byte转为字符串的bit 
     */  
    public static String byteToBit(byte b) {  
        return ""  
                + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1)  
                + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1)  
                + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1)  
                + (byte) ((b >> 1) & 0x1) + (byte) ((b >> 0) & 0x1);  
    } 

}
