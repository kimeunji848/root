package section1;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello java");
		//System.out.print("Hello:");
		//System.out.println("World");
		
		//���� ���б� 3�г⿡ �������Դϴ�.
		
		//System.out.print("���� ���б�"); //����
		//System.out.print("3"); //����
		//System.out.print("�г⿡ �������Դϴ�.");
		
		//���ڿ� 1~3������
		
		//1�� ���� :
		System.out.printf("���� ���б� %d �г⿡ �������Դϴ�.", 3);
 		
		System.out.println();		
		
		//2�� ���� : 1�� ù����, 2.0000000�� �ι�°, ���� ����° 
		System.out.printf("%d�� ù����, %f�� �ι�°, %s�� ����°",1,2.0000000 ,"��");
		
		System.out.println();		
		//3�� ���� : ����ó�� ���� ��� 
		System.out.printf("%.1f",1.12345);
		System.out.println();
		
		System.out.printf("%.2f",1.12345);
		System.out.println();	
		
		System.out.printf("%.3f",1.12345);
		System.out.println();
		
		System.out.printf("%.4f",1.12345);
		System.out.println();
		
		System.out.printf("%.5f",1.12345);
		System.out.println();
		
		//myage 20 �� ���Ԥ��ϰ� yourage ��������=������ 
		int myage = 20;
		int yourage = myage; //������ �� ���� 
		
		System.out.println(myage);
		System.out.println(yourage);
		
		System.out.println();
		//myage 20 yourage 30 = myage:30 yourage:20
		//temp : ��� ���� (�ӽ� ����)
		
		int temp; //�ڷ��� ��!
		int myage_ = 20;
		int yourage_ = 30;
		
		temp = myage_;
		myage_ = yourage_;
		yourage_ = temp;
		
		System.out.println(myage_);
		System.out.println(yourage_);
		
		System.out.println();
		
		//20 30 40 50 ���Ͱ��� ��� 
		//byte=1byte short=2byte int=4byte long=8byte
		//1byte = 8bit short = 8*2=16bit int = 4*8 =32bit 
		//long = 8*bit = 64; 
		byte num1 = 20; //1byte
		short num2 = 30; //2byte
		int num3 = 40; //4byte
		int num4 = 50; //8byte
		
		System.out.println(num1);    //8bit = 1byte
		System.out.println(num2);	 //16bit = 2byte
		System.out.println(num3);    //32bit  =4byte
		System.out.println(num4);	 //64bit  =8byte
		
	}

}
