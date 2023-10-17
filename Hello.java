package section1;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello java");
		//System.out.print("Hello:");
		//System.out.println("World");
		
		//나는 대학교 3학년에 재학중입니다.
		
		//System.out.print("나는 대학교"); //문자
		//System.out.print("3"); //숫자
		//System.out.print("학년에 재학중입니다.");
		
		//문자열 1~3번문제
		
		//1번 문제 :
		System.out.printf("나는 대학교 %d 학년에 재학중입니다.", 3);
 		
		System.out.println();		
		
		//2번 문제 : 1은 첫번쨰, 2.0000000은 두번째, 셋은 세번째 
		System.out.printf("%d은 첫번쨰, %f은 두번째, %s은 세번째",1,2.0000000 ,"셋");
		
		System.out.println();		
		//3번 문제 : 공백처리 숫자 출력 
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
		
		//myage 20 을 대입ㅎ하고 yourage 변수복사=값복사 
		int myage = 20;
		int yourage = myage; //변수의 값 복사 
		
		System.out.println(myage);
		System.out.println(yourage);
		
		System.out.println();
		//myage 20 yourage 30 = myage:30 yourage:20
		//temp : 어나더 공간 (임시 변수)
		
		int temp; //자료형 꼭!
		int myage_ = 20;
		int yourage_ = 30;
		
		temp = myage_;
		myage_ = yourage_;
		yourage_ = temp;
		
		System.out.println(myage_);
		System.out.println(yourage_);
		
		System.out.println();
		
		//20 30 40 50 엔터가들어간 출력 
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
