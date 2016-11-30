package test.test;

import java.io.UnsupportedEncodingException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

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
		
		
		Socket socket=new Socket();
		SocketAddress sa=new SocketAddress() {
			
		};
		DatagramSocket ds;
		ServerSocket ss;
		
		
		
		byte b = 0x35; //0011 0101
//	    System.out.println(byteToBit(b));  
	    // JDK自带的方法，会忽略前面的 0  
//	    System.out.println(Integer.toBinaryString(500));  
	    
		System.out.println(System.currentTimeMillis());
		
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
