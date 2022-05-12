package com.example.myservice.dao;

import com.example.myservice.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : DeptDao
 * author : macbook
 * date : 2022/05/12
 * description : 부서테이블에 접근해서 데이터를 처리할 클래스 (DAO)
 *               (CRUD: Insert, Select, Update, Delete)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/12         macbook          최초 생성
 */

@Mapper // myBatis에서 사용하는 annotation, xml문에서 select문을 작성하게 만들어 주는 역할
public interface DeptDao {
    // select문 메소드
    List<Dept> selectList(); // 부서 정보를 Select하는 메소드

}
