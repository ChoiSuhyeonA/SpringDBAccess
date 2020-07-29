package com.spring.db.test;

public class AnonymousTest {

	public static void main(String[] args) {
		
		Car s = new Sonata();
		s.run();
		
		Car ferrari = new Car() {
			@Override
			public void run() {
				System.out.println("페라리가 쌩쌩 달립니다.");
			}	
		};
		ferrari.run();
		
		new Car() {
			@Override
			public void run() {
				System.out.println("포르쉐가 팍팍 달립니다.");
			}
		}.run();
		
		//lambda식 적용: 인터페이스 안에 추상메서드가 단 하나만 존재할 시 사용 가능!
		Car tesla = () -> {System.out.println("테슬라가 윙윙 달립니다.");};
		tesla.run();
		
		
		
		
		
		
		
		
		

	}

}
