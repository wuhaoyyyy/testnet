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
		InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(out);
        DataInputStream dis = new DataInputStream(in);

        System.out.println("客户端传值：");
        dos.write("1111111111111111111122222222222222222222333333333333333333334444444444444444444455555".getBytes());

        System.out.print("服务端返回值: ");
        int c;
        byte bytes[] = new byte[3];
        while((c = in.read(bytes)) != -1)
        {
            System.out.print(new String(bytes));
        }
        socket.close();
        System.out.println("客户端关闭连接");
	}

}
