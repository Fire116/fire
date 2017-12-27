package com.offcn.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//  读取网页的html
public class Test {

	
	public static void main(String[] args) {
		
	/*	try {
			URL url = new URL("http://www.iqiyi.com");
			InputStream is = url.openStream();
			int len = -1 ; 
			byte[] bytes = new byte[1024*2];
			while((len=is.read(bytes))!=-1 ){
			
				System.out.println(len);
				
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	*/	
		try {
			URL url = new URL("http://www.iqiyi.com");
			InputStream inputStream = url.openStream();	
			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();
			while(data != null ){
				System.out.println(data);
				data=br.readLine();
			}
			br.close();
			isr.close();
			isr.close();
			inputStream.close();
	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
