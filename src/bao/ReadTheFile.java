package bao;
import java.io.*;

/**
����3-1
����ȷ����ʵ�������ļ�����ЧD{0-1}KP���ݣ�
**/
public class  ReadTheFile  {

   public static void main(String[] args) {         

      //��ȡtxt�ļ�
      File file = new File("H:\\�������\\ʵ��� ����3data_set\\idkp1-10.txt");
      //File file = new File("H:\\�������\\ʵ��� ����3data_set\\sdkp1-10.txt");
      //File file = new File("H:\\�������\\ʵ��� ����3data_set\\udkp1-10.txt");
      //File file = new File("H:\\�������\\ʵ��� ����3data_set\\wdkp1-10.txt");
      
      BufferedInputStream bis = null;
      FileInputStream  fis= null;
      try{
          //��һ�� ͨ���ļ�·���������ļ�ʵ��
          fis = new FileInputStream(file);
          /*��FileInputStreamʵ�� ���ݵ� BufferedInputStream
                   Ŀ�����ܿ��ٶ�ȡ�ļ�
           */
          bis = new BufferedInputStream(fis);
          /*available����ǲ��Ƕ������ļ�ĩβ */
          
          while( bis.available() > 0 ){                 
              System.out.print((char)bis.read());
          }
          
       }catch(FileNotFoundException fnfe)
        {
            System.out.println("�ļ�������" + fnfe);
        }

        catch(IOException ioe)
        {
            System.out.println("I/O ����: " + ioe); 
        }

        finally
        {
            try{
               if(bis != null && fis!=null)
               {
                     fis.close();
                  bis.close();
               }      
             }catch(IOException ioe)
              {
                  System.out.println("�ر�InputStream�������: " + ioe);
              }         
        }
   }    
}