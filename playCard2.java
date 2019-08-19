package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class playCard2 {
	ArrayList<Card2> cards=new ArrayList<Card2>();
	//4个玩家
		private Player[] user;
	public playCard2() {
		//生成54张牌
			String[] ch1= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
			String[] ch2= {"红桃","黑桃","方块","梅花"};
			
			String[] ch= {"小王","大王"};
			int i=0;
			for(String sp : ch1) {
				for(String num : ch2) {
					cards.add(new Card2(i++,sp,num));
				}
			}
			cards.add(new Card2(53,"",ch[0]));
			cards.add(new Card2(54,"",ch[1]));
	   //生成4个玩家
		user =new Player[4];
		user[0]=new Player("kk");
		user[1]=new Player("jj");
		user[2]=new Player("lili");
		user[3]=new Player("jack");
	}
	
	public void getCard() {
		Collections.shuffle(cards);
//		System.out.println(cards.toString());
		
		int i=0;
		while(!cards.isEmpty()) {
			i=i%user.length;
				user[i++].getCard().add(cards.remove(0));
		}
	}
	
	public void showCard() {
		for(int i=0 ;i<user.length;i++) {
			System.out.println("玩家"+(i+1)+user[i].getUserName()+":");
			System.out.println("牌数："+user[i].getCard().size());
			System.out.println(user[i].getCard().toString());
		}
			
	}

	public static void main(String[] args) {
		playCard2 c =new playCard2();
		c.getCard();
		c.showCard();
	}
}

class Card2 implements Comparable<Object>{
	private int id;  //54张牌的排序
	private String sp;  //牌面花色
	private String num;  //牌面数值
	
	public Card2(int id,String sp ,String num) {
		this.id=id;
		this.sp=sp;
		this.num=num;
	}

	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Card2)) {
			throw new ClassCastException("存入的对象不是Card类");
		}
		Card2 p=(Card2) o ;
		int temp =this.id - p.id;
		return  temp==0 ? this.sp.compareTo(p.sp) : temp;
	}

	@Override
	public String toString() {
		return "[" + num + sp + "]";
	}

	
	
}
class Player{
	
	private String userName;
	private TreeSet<Card2> card =new TreeSet<Card2>();
	
	public Player(String string) {
		// TODO Auto-generated constructor stub
		userName=string;
	}
	

	@Override
	public String toString() {
		return "Player [userName=" + userName + ", card=" + card + "]";
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public TreeSet<Card2> getCard() {
		return card;
	}

	public void setCard(TreeSet<Card2> card) {
		this.card = card;
	}
	
}