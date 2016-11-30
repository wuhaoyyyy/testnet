package webtest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static ServerSocket ss;
	public static void main(String[] args) throws IOException {
		ss=new ServerSocket(10000);
		while (true) {
	      Socket socket = ss.accept();
	      System.out.println("收到请求");
	      ServerSocketThread st = new ServerSocketThread(socket);      
	      st.start();
	      System.out.println("开始处理");
	    }
	}

}

class ServerSocketThread extends Thread{
	DataInputStream dis;
	DataOutputStream dos;
	public ServerSocketThread(Socket socket) throws IOException {
		InputStream is = socket.getInputStream();
	    dis = new DataInputStream(is);
	    OutputStream os = socket.getOutputStream();
	    dos = new DataOutputStream(os);
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				byte[] bytes = new byte[20];
				dis.read(bytes);
				System.out.println("服务端接收到客户端传值：" + new String(bytes));
				dos.write(bytes);
				System.out.println("服务端返回给客户端值：" + new String(bytes));
			}
		} 
		catch (Exception e) {
		}
	}
}
