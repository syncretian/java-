import java.io.UnsupportedEncodingException;

public class Student1 {
	private static String[] ch= {"��","Ҽ","��","��","��","��","½","��","��","��"};
	private static String[] ch2 = {"","ʰ","��","ǧ"};
	private static String[] ch3 = {"Ԫ","��","��"};
	private static int count=-1;
	public static void main(String[] args) throws Exception {
		//
		
		//Array���������ǿ����
//		int[] a= {23,-5,234,77,3,56};
//		
//		Arrays.parallelSort(a);
//		System.out.println(Arrays.toString(a));
		//���ݼ��㹫ʽ���¼�����µ�Ԫ��
//		Arrays.parallelPrefix(a, new IntBinaryOperator() {
//
//			@Override
//			public int applyAsInt(int left, int right) {
//				// TODO Auto-generated method stub
//				return left*right;
//			}
//		
//		});
		
//		
//		Arrays.parallelSetAll(a, new IntUnaryOperator() {
//
//			@Override
//			public int applyAsInt(int arg0) {
//				// TODO Auto-generated method stub
//				return a[arg0];
//			}
//			
//		});
//		System.out.println(Arrays.toString(a));
		//�žų˷���
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" x "+j+"="+i*j+" ");
//			}
//			System.out.println();
//		}
		//����������
//		int height=5;
//		for(int i=0;i<height;i++) {
//			for(int j=0;j<2*height;j++) {
//				if(j>=(height-i)&&j<=height+i)
//						System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.println();
//		}
		//��ӡ��һ��Բ

//		int r=15;
//		
//		for(int i=0;i<=2*r;i+=2) {  //����i��2����Ϊ��ӡ̨�߶��ǿ�ȵ������������м���һ�Ρ���1�Ļ���Ϊ��Բ
//			
//			int d=(int)Math.round(Math.sqrt(2*r*i-i*i));
//			
//			int x=r-d;
//			//Բ�����հ�
//			for(int j=0;j<x;j++) {
//				System.out.print(" ");
//			}
//			//Բ����� *
//			System.out.print("*");
//			//Բ���м�հ�
//			for(int k=0;k<2*d;k++) {
//				System.out.print(" ");
//			}
//			//Բ���Ҳ�*
//			System.out.println("*");
//		}
		//����Ĳ��͡�������
		//i����ÿһ��
//		int r=5;
//				for(int i=0;i<=2*r;i+=2) {
//				//Բ�ϵ㵽���Ű뾶�ľ���
//					long y = Math.round(Math.sqrt(Math.pow(r,2)- Math.pow(r-i,2)));
//				//Բ�ϵ㵽���������αߵľ���
//					long x = r-y;
//				//�ȴ�ӡ����������߱ߵ�Բ�ϵ�Ŀհײ�λ
//				for(int j=0;j<x;j++) {
//					System.out.print(" ");
//				}
//				//��ӡ����ߵ�Բ�ϵ�
//				System.out.print("*");
//				//��ӡ���м�հײ���
//				for(int k=0;k<2*y;k++) {
//					System.out.print(" ");
//				}
//				//��ӡ���ұߵ�Բ�ϵ� �ұ߿հײ�Ҫ��ֱ�ӻ���
//				System.out.println("*");
//				}

		//���ֽڽ�ȡ�ַ���
		//����ռ���ֽڣ�Ӣ��ռһ���ֽ�  �����ʽ�ȡ�������ʱ����ʾ��
		
//		String str="aa��aa��aŶ�Ǻ�defgh";
//		System.out.println(str.length());
//		
//		System.out.println(substring(str,4));
		
		//��ϰ ��С��ת��Ϊ����Ҷ�������ֻ�ܶ����ǣ���
		double f= 20656333034.72432;
		//��Ϊ�������֣���Ԫ���ǣ�����
	
		//�õ���������
		long  positive= (long)f;
		System.out.println("��������"+positive);
		//�õ�С������,,ֻ��Ҫǰ��λ
		 long decimal = Math.round((f-positive)*100);
		System.out.println("С������"+decimal);
		
		System.out.print(dealPositive1(positive));
		System.out.println(dealDecimal(decimal));
	
	}
	//������������	
	//�ȿ�����λ�����
	public static String dealPositive1(long positve) {
	    String danwei=ch3[++count];
		long s1= positve%10000;   //��λ���������ڵ�����
		long s2=positve/10000;    //�����ڵ�����
		System.out.println(s1+"  "+s2);
		
		
		String str= String.valueOf(s1);
		String re1="";
		//��-->ʮ-->��-->ǧ
		for(int i =str.length()-1,j=0 ; i>=0;i--,j++) {
			//�õ�ÿλ,,,��0��=48
			int ii= str.charAt(i)-48;
			if(ii!=0) {			
				re1=ch[ii]+ch2[j]+re1;
//				System.out.println(i+"**i*j"+j);
//				System.out.println(ch[ii]+"* "+ch2[j]+" *"+re1);
			}else {
				//��λΪ0ʱ������
				//���ظ���λʱ�������ظ�������0��
				if(!re1.substring(0,1).equals("��")) {
					re1=ch[ii]+re1;
//				System.out.println(ch[ii]+" "+" "+re1);
				}
				
			}
			
			
		}
		if(s2!=0) {
			re1= dealPositive1(s2)+re1;
		}
		return re1+danwei;
		
	}
	//����С������
	public static String  dealDecimal(long decimal) {
	
//		System.out.println(decimal);
		if(decimal==0) {	
			return "";			
		}else if(decimal<10) {
			return ch[(int) decimal]+"��";
		}
		if(decimal%10==0) {
			return ch[(int) (decimal/10)]+"��";
		}
		
		
		return ch[(int) (decimal/10)]+"��"+ch[(int) (decimal%10)]+"��";
		
	}
	

//    public static String substring(String str,int len) throws UnsupportedEncodingException {
//    	//�õ����ַ�����UCS2������ֽ����飬
//    	//java�ڲ����õĶ���Unicode 16��UCS2�����룬ÿ���ַ����������ֽ�
//    	//�ֽ������ǰ��λ�Ǳ�־λ�� bytes[0] = -2��bytes[1] = -1
//    	byte[] b  = str.getBytes("unicode");
//    	
//    	int n=0;  //ͳ�ƽ�Ҫ��ȡ���ֽڳ���
//    	int i=2;    //�������ȡ���ֽ�������±�,�ӵ�������ʼ
//    	for(;  i<b.length && n<len; i++)  {
//    		if(i%2==1) { 
//    			n++;     //һ���ַ��ĵڶ����ֽ�
//    		}
//    		else {
//    			if(b[i]!=0) {
//    				n++;      //����һ���ֽڲ���0����UCS2�ַ�һ���Ǻ���
//    			}
//    		}
//    	}
//    	System.out.println("i,n "+i+n);
//    	// ��ʱ��nΪ��ȡ���ֽ�������iΪ Ҫ��ȡ�����鳤��
//    	
//    	if(i%2==1) {  //��i Ϊ����ʱ����UCS�ַ�Ϊ���֣�ȥ������ֽڲ�����
//    		if(b[i-1]!=0)
//    			i--;
//
//    	}
//    	return new String(b,0,i,"unicode");
//    }
}