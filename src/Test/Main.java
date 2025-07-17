package Test;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library1 = new Library();


        System.out.println("\n프로젝트 도서관에 오신걸 환영합니다.\n");

        while (true) {

            System.out.println(" 1번 보유책 목록\n\n 2번 대출과 반납 \n\n 3번 나가기\n");
            String next1 = sc.nextLine();
            if (next1.equals("1")) {
                //라이브러리와 연결
                System.out.println("\n프로젝트 도서관의 책 목록 입니다.\n");
                List<Book> bookList = library1.bookList;

                for(Book book : bookList){
                    System.out.print("\n  "+ book.isbn);
                    System.out.print(" / "+ book.bookName);
                    System.out.print(" / "+ book.genreString);
                    System.out.print(" / "+ book.writer);

                }
            } else if (next1.equals("2")) {
                System.out.println("\n대출/반납 하실 책의 번호를 입력해 주세요.\n");
            }

            // 라이브러리와?연결해서 컬렉션 세이브 기능을 통해 기록 조건은 맴버에서 가져옴


            System.out.println("\n\n종료를 하시겠 습니까? 종료 하시려면 3을 입력해 주세요");
            String next3 = sc.nextLine();
            if (next3.equals("3")) {
                System.out.println("프로젝트 도서관에 방문해주셔서 감사합니다. 안녕히 가세요");
                break;
            }
        }
    }
}
//라이브러리에서 북 을 만들고
//다음 할일이 대출 반납 구현 같은 다음기능 구현 대출 번호 다르게 하기