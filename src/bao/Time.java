package bao;
/**
����3-4
�û��ܹ�����ѡ��̬�滮�㷨�������㷨���ָ��D{0-1} KP���ݵ����Ž�����ʱ�䣨����Ϊ��λ��
**/
public class Time {
    public static void main(String[] args) {
    	//��ʼ��ʱ
    	long startTime = System.currentTimeMillis();
    	
    	//��Ʒ������
        int[] w={508,1021,1321,111,1098,1196,204,939,1107,399,474,719,803,1054,1781,525,1050,1362,530,641,903,432,583,894,754,806,1241,1056,1092,1545};
        //��Ʒ�ļ�ֵ
        int[] val={408,921,1329,11,998,1009,104,839,943,299,374,673,703,954,1657,425,950,1375,430,541,971,332,483,815,654,706,1360,956,992,1948};
        
        int m=10149;//����������
        int n=val.length;//��Ʒ�ĸ���

        //1.������ά����
        //v[i][j]��ʾ��ǰi����Ʒ���ܹ�װ������Ϊj�ı����е�����ֵ
        int[][] v=new int[n+1][m+1];
        //��ż�¼����
        int[][] path=new int[n+1][m+1];

        //2.��ʼ����һ�е�һ�У��Ѿ������ˣ���ΪĬ����0��
        //3.���ݹ�ʽ����̬�滮����
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++) {
                //��ʽ
                if(w[i-1]>j){//��Ϊ���ǳ���i�Ǵ�1��ʼ�ģ����ԭ���Ĺ�ʽ�е�w[i]�޸ĳ�w[i-1]
                    v[i][j]=v[i-1][j];
                }else{
                    //v[i][j]=Math.max(v[i-1][j],val[i-1]+v[i-1][j-w[i-1]]);
                    if(v[i-1][j]<val[i-1]+v[i-1][j-w[i-1]]){
                        v[i][j]=val[i-1]+v[i-1][j-w[i-1]];
                        path[i][j]=1;
                    }else{
                        v[i][j]=v[i-1][j];
                    }
                }
            }
        }

        
        //������
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j]+" ");
            } 
        }


        
        //���һ�δ�Ž����������
        System.out.println("���Ž�Ϊ��");
        int i=path.length-1;//�е�����±�
        int j=path[0].length-1;//�е�����±�

        while (i>0&&j>0){
            if(path[i][j]==1){
                System.out.printf("��%d����Ʒ���뵽����\n",i);
                j-=w[i-1];
            }
            i--;
        }
        
        System.out.println();
        //����ʱ��
      	long endTime = System.currentTimeMillis();
      	//long����ʱ����λ����
      	long timeLong = endTime - startTime;
      	//long����ʱ���תΪdouble����ʱ����λ����
      	double timeDouble= Double.parseDouble(Long.toString(timeLong));
      	System.out.println("�÷���ִ��ʱ��Ϊ" + timeDouble+ "���룬��" + timeDouble/(double)1000 + "��");
        
    }

}

