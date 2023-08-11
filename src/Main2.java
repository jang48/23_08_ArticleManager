import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    System.out.println("== 프로그램 시작 ==");
    Scanner sc = new Scanner(System.in);
    int 번호 = 1;
    int  lastArticleid = 0;
    while(true){
      System.out.printf("명령어 ) ");
      String cmd = sc.nextLine();

      if(cmd.length() == 0){
        System.out.println("명령어를 입력하세요.");
        continue; // 명령어 입력안하면 while에서 다시 시작할 수 있게 하기
      }
      if(cmd.equals("article list")){
        System.out.println("게시글이 없습니다");
      }
      else if(cmd.equals("article write")){
        int id = lastArticleid + 1;
        lastArticleid = id;
        //번호 = 번호;
        /*/
        System.out.printf("제목 : ( %s ) \n", sc.nextLine());  //원하는대로 안나옴 " 제목 : 작성한 내용 " 으로 나와야하는데 "작성한 내용 enter 후 제목 : 작성한 내용" 이 나옴
        System.out.printf("내용 : ( %s ) \n", sc.nextLine());
        System.out.printf("%d번 글이 생성되었습니다.\n",번호);
        번호++;
        */
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();
        System.out.printf("%d번 글이 생성되었습니다.\n",lastArticleid);

      }
      else
      {
        System.out.println("존재하지 않는 명령어입니다.");
        continue;
      }

      if(cmd.equals("System exit")){
        break;  //break를 작성해줘야 sc.close가 활성화된다.
      }
    }

    sc.close();
    System.out.println("== 프로그램 종료 ==");
  }
}
