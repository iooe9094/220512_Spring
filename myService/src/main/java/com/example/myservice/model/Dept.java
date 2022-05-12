package com.example.myservice.model;

import lombok.Getter;
import lombok.Setter;

/**
 * packageName : com.example.myservice.model
 * fileName : Dept
 * author : macbook
 * date : 2022/05/12
 * description : 부서 테이블에 데이터를 한 건씩 담는 클래스
 *               (DNO(숫자), DNAME(문자), LOC(문자))
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/12         macbook          최초 생성
 */

// @Setter와 @Getter 사용하면 만들 필요 없음 (Rombok 사용 했을 경우)
// 자동으로 getter와 setter를 만들어 준다
@Setter
@Getter
public class Dept {
    private int dno; // 숫자(부서번호)
    private String dname; // 문자열(부서이름)
    private String loc; // 문자열(지역)
}
