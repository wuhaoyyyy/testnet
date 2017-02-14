package test.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Te {

	public static void main(String[] args) {
		try {
			FileOutputStream o=new FileOutputStream(new File("D://a.png"));
			URL url = new URL("https://yyt.gsnsh.com/group1/M00/00/00/Cg0AZFg9RRCAMjg9AAB2kHNlNb0818.jpg");
			URLConnection uc = url.openConnection();
			InputStream in = uc.getInputStream();
			int c;
			while ((c = in.read()) != -1)
				o.write(c);
			in.close();
			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
