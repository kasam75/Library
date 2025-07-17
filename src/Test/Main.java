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

                for (Book book : bookList) {
                    System.out.print("\n  " + "고유 번호  " + book.isbn);
                    System.out.print(" / " + book.bookName);
                    System.out.print(" / " + book.genreString);
                    System.out.print(" / " + book.writer);

                }
            } else if (next1.equals("2")) {
                System.out.println("\n대여가 필요하시면 1을 입력해주세요.\n반납이 필요하시면 2를 엽력해주세요.\n");
                List<Book> bookList = library1.bookList;
                String next2 = sc.nextLine();

                if (next2.equals("1")) {
                    System.out.println("대여가 필요하신 책의 고유번호를 입력주세요");
                    for (Book book : bookList) {
                        System.out.print("\n  " + "고유 번호  " + book.isbn);
                        System.out.print(" / " + book.bookName);
                        System.out.print(" / " + book.genreString);
                        System.out.print(" / " + book.writer);
                        System.out.println("\n\n");
                    }
                    sc.nextLine();
                    //sc.nextLine (고유번호 받아오고 )
                    //루프문을 돌리거나 for문 을 돌리면서 38번 book.isbn 43번라인 고유번호와 비교지정한 북을 해당북을 지우고 대여리스트에 추가  .remove

                    System.out.println(bookList);

                } else if (next2.equals("2")) {
                    for (Book book : bookList) {//북리스트가 아닌 라이브러리에 새로만든 대여리스를 돌려서 추가해야함 add
                        System.out.print("\n  " + "고유 번호  " + book.isbn);
                        System.out.print(" / " + book.bookName);
                        System.out.print(" / " + book.genreString);
                        System.out.print(" / " + book.writer);
                        System.out.println("\n\n");

                    }
                    System.out.println("반납하실 책의 고유번호를 입력해 주세요");

                    sc.nextLine();
                    //sc.nextLine (고유번호 받아오고 )

                    //루프문을 돌리거나 for문 을 돌리면서 50 book.isbn 57번라인 고유번호와 비교지정한 대여리스트에서 삭제하고 .remove 북리스트에 추가하기 .add
                    //소트 기능 추가(정렬)끝나고
                }

            }

            // 라이브러리와?연결해서 컬렉션 세이브 기능을 통해 기록 조건은 맴버에서 가져옴


            System.out.println("\n\n 계속 하시려면 아무 키나 입력해 주세요 \n\n종료를 하시려면 3을 입력해 주세요");
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