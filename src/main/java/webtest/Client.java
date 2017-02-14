package webtest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Client {
	
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket();
		SocketAddress as=new InetSocketAddress("10.10.96.134", 10000);
		socket.connect(as);
		socket.setKeepAlive(true);
		InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(out);
        DataInputStream dis = new DataInputStream(in);
        boolean s=true;
        while(true){
	        System.out.println("客户端传值：");
	        dos.write(System.in.read());
	
	        System.out.print("服务端返回值: ");
	        int c;
	        byte bytes[] = new byte[3];
	        while((c = in.read(bytes)) != -1)
	        {
	            System.out.print(new String(bytes));
	        }
        }
//        socket.close();
//        System.out.println("客户端关闭连接");
	}

}
