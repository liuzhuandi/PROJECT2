package bao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExportData {	
	/**
		������Ҫ�ǰѿ���̨��������ݱ��浽data.txt��
	*/
	public class TextOutputTest {
		private static final String fileName = "H:\\�������:\\data.txt";
	
		public void main(String[] args) throws IOException {
		System.out.println("������һ���ַ�,ϵͳ���Զ����浽H:\\�������:\\data.txt�ļ��С�");
		System.out.println("�ַ���Ϊ��");
	
		//����file�ĳ�ʼ��
		File outputFile = new File(fileName);
		if(!outputFile.exists()){
		outputFile.createNewFile();
		}
	
		//��ȡ����̨���ַ���
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)), true);
		String str = in.nextLine();
			
		if (str != null && str.length() != 0) {
			System.out.println(str);
		}else{
			System.out.println("��ʾ��û���ڿ���̨�����κ��ַ�!");
		}
	
		System.out.println("��۲����H������������ļ����µ�data.txt�ļ�,����ִ����ϡ�");
		out.close();
		in.close();
		}

	}

}
