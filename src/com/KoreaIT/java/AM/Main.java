package com.KoreaIT.java.AM;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("== 프로그램 시작 ==");
    Scanner sc = new Scanner(System.in);  // System.in 은 키보드 System.out 은 모니터
    //sc.nextLine(); // 1. nextLine()으로 작성하고 디버그 하면 계속 디버깅중이다. 나오는 곳에 입력하면 println이 됨

    System.out.printf("명령어 ) ");
    String cmd = sc.next(); // 4. next는 어절(띄어쓰기)기준으로 맨처음에 나온 어절만 받아드림 ex. 안녕 하세요. > 안녕 만 나옴
    System.out.printf("입력된 명령어 : %s\n", cmd);
    // String cmd = sc.nextLine(); // 3. 입력하고 엔터치고
    // cmd = sc.nextLine(); // 3. 다시 재입력해야 디버깅이 종료됨


    int num = sc.nextInt(); // 5. string 값을 넣으면 exception 뜬다. error가 아니고 -> 작동은 되지만 문제가 생길 수 있다.
    System.out.printf("입력된 정수 : %d\n", num);

    sc.close(); // 2. Scanner을 만들었으면 닫아줘야함
    System.out.println("== 프로그램 종료 ==");
  }
}


//ctrl + L 누르면 git가 다 사라짐
//shift + insert 하면 ctrl + v 와 같음