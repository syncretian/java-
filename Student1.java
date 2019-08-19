import java.io.UnsupportedEncodingException;

public class Student1 {
	private static String[] ch= {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private static String[] ch2 = {"","拾","佰","千"};
	private static String[] ch3 = {"元","万","亿"};
	private static int count=-1;
	public static void main(String[] args) throws Exception {
		//
		
		//Array工具类的增强功能
//		int[] a= {23,-5,234,77,3,56};
//		
//		Arrays.parallelSort(a);
//		System.out.println(Arrays.toString(a));
		//根据计算公式重新计算出新的元素
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
		//九九乘法表
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+" x "+j+"="+i*j+" ");
//			}
//			System.out.println();
//		}
		//等腰三角形
//		int height=5;
//		for(int i=0;i<height;i++) {
//			for(int j=0;j<2*height;j++) {
//				if(j>=(height-i)&&j<=height+i)
//						System.out.print("*");
//				else System.out.print(" ");
//			}
//			System.out.println();
//		}
		//打印出一个圆

//		int r=15;
//		
//		for(int i=0;i<=2*r;i+=2) {  //这里i增2，因为打印台高度是宽度的两倍，故两行计算一次。增1的话成为椭圆
//			
//			int d=(int)Math.round(Math.sqrt(2*r*i-i*i));
//			
//			int x=r-d;
//			//圆的左侧空白
//			for(int j=0;j<x;j++) {
//				System.out.print(" ");
//			}
//			//圆的左侧 *
//			System.out.print("*");
//			//圆的中间空白
//			for(int k=0;k<2*d;k++) {
//				System.out.print(" ");
//			}
//			//圆的右侧*
//			System.out.println("*");
//		}
		//借鉴的博客。。。。
		//i代表每一行
//		int r=5;
//				for(int i=0;i<=2*r;i+=2) {
//				//圆上点到竖着半径的距离
//					long y = Math.round(Math.sqrt(Math.pow(r,2)- Math.pow(r-i,2)));
//				//圆上点到外切正方形边的距离
//					long x = r-y;
//				//先打印出正方形左边边到圆上点的空白部位
//				for(int j=0;j<x;j++) {
//					System.out.print(" ");
//				}
//				//打印出左边的圆上点
//				System.out.print("*");
//				//打印出中间空白部分
//				for(int k=0;k<2*y;k++) {
//					System.out.print(" ");
//				}
//				//打印出右边的圆上点 右边空白不要打直接换行
//				System.out.println("*");
//				}

		//用字节截取字符串
		//汉字占两字节，英文占一个字节  、、故截取半个汉字时不显示、
		
//		String str="aa中aa国a哦呵呵defgh";
//		System.out.println(str.length());
//		
//		System.out.println(substring(str,4));
		
		//练习 将小数转化为人民币读法，，只能读到角，分
		double f= 20656333034.72432;
		//分为三个部分，，元，角，，分
	
		//得到整数部分
		long  positive= (long)f;
		System.out.println("整数部分"+positive);
		//得到小数部分,,只需要前两位
		 long decimal = Math.round((f-positive)*100);
		System.out.println("小数部分"+decimal);
		
		System.out.print(dealPositive1(positive));
		System.out.println(dealDecimal(decimal));
	
	}
	//处理整数部分	
	//先考虑四位的情况
	public static String dealPositive1(long positve) {
	    String danwei=ch3[++count];
		long s1= positve%10000;   //四位，，万以内的数字
		long s2=positve/10000;    //亿以内的数字
		System.out.println(s1+"  "+s2);
		
		
		String str= String.valueOf(s1);
		String re1="";
		//个-->十-->百-->千
		for(int i =str.length()-1,j=0 ; i>=0;i--,j++) {
			//得到每位,,,‘0’=48
			int ii= str.charAt(i)-48;
			if(ii!=0) {			
				re1=ch[ii]+ch2[j]+re1;
//				System.out.println(i+"**i*j"+j);
//				System.out.println(ch[ii]+"* "+ch2[j]+" *"+re1);
			}else {
				//该位为0时，加零
				//但重复两位时，不能重复加两个0吧
				if(!re1.substring(0,1).equals("零")) {
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
	//处理小数部分
	public static String  dealDecimal(long decimal) {
	
//		System.out.println(decimal);
		if(decimal==0) {	
			return "";			
		}else if(decimal<10) {
			return ch[(int) decimal]+"分";
		}
		if(decimal%10==0) {
			return ch[(int) (decimal/10)]+"角";
		}
		
		
		return ch[(int) (decimal/10)]+"角"+ch[(int) (decimal%10)]+"分";
		
	}
	

//    public static String substring(String str,int len) throws UnsupportedEncodingException {
//    	//得到该字符串的UCS2编码的字节数组，
//    	//java内部采用的都是Unicode 16（UCS2）编码，每个字符都是两个字节
//    	//字节数组的前两位是标志位， bytes[0] = -2，bytes[1] = -1
//    	byte[] b  = str.getBytes("unicode");
//    	
//    	int n=0;  //统计将要截取的字节长度
//    	int i=2;    //标记最后截取的字节数组的下标,从第三个开始
//    	for(;  i<b.length && n<len; i++)  {
//    		if(i%2==1) { 
//    			n++;     //一个字符的第二个字节
//    		}
//    		else {
//    			if(b[i]!=0) {
//    				n++;      //当第一个字节不是0，该UCS2字符一定是汉字
//    			}
//    		}
//    	}
//    	System.out.println("i,n "+i+n);
//    	// 此时，n为截取的字节数，，i为 要截取的数组长度
//    	
//    	if(i%2==1) {  //当i 为奇数时，若UCS字符为汉字，去掉这个字节不处理
//    		if(b[i-1]!=0)
//    			i--;
//
//    	}
//    	return new String(b,0,i,"unicode");
//    }
}