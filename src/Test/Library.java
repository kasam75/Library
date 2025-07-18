package Test;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList;
    List<Book> rentBook;

    Library() {

        bookList = new ArrayList<>(
                List.of(
                        new Book(1, "해리포터와 마법사의돌 ", "판타지", "조엔 케이 롤링"),
                        new Book(2, "반지의 제왕", "판타지", "J.K톨킨"),
                        new Book(4, "사기", "역사", "사마천"),
                        new Book(5, "삼국지 정사", "역사", "진수"),
                        new Book(6, "홍길동 전", "픽션", "허균"),
                        new Book(7, "자바의 정석-기초-", "자기 계발서", "남궁성"),
                        new Book(8, "어린왕자", "과학 판타지", "생텍쥐페리"),
                        new Book(9, "개미", "소설", "베르나르 베르베르"),
                        new Book(10, "구해줘", "픽션", "기욤 뮈소"),
                        new Book(11, "빅 빅쳐", "서스펜스", "더글러스 케네디"),
                        new Book(12, "호밀밭의 파수꾼", "청소년 문학", "제롬 데이비드 샐린저"),
                        new Book(13, "셜록홈즈 스페셜", "추리", "아서 코난 도일"),
                        new Book(14, "오리엔트 특급 살인", "추리", "애거사 크리스티")
                )
        );
        rentBook = new ArrayList<>(
                List.of
                        (new Book(15, "차라투스트라는 이렇게 말했다 ", "철학", "니체")

                )
        );
    }
}

//리스트 오브는 스테틱 메세지

//만약에 리스트 만드는게 햇갈리면 추천이

//둘다 고정된 리스트 차이가 리스트오브는 널이 불가능하고 Arrays.asList() 는 널이 됨 둘다 고정값이여서 추가 변경이 안됨

//추가변경을 하려면 뉴 어레이 리스트로 감싸야함

// 대여리스트 만들고 사용자가 책번호를 입력하면 루프문으로 북리스트를 돌리면서 북의 id값과
// 북리스트에서 제외하고 그때 찿아온 북의 대여리스트를 add로 넣음
// 반납할떄는 반대로 루프로 대여리스 돌리고 북 리스트에 에드