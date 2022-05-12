package com.example.myservice.controller;

import com.example.myservice.dao.DeptDao;
import com.example.myservice.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.example.myservice.controller
 * fileName : DeptController
 * author : macbook
 * date : 2022/05/12
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/05/12         macbook          최초 생성
 */

// @RestController: 메뉴달기, 반환값이 json 파일형태
@RestController
public class DeptController {

    // @Autowired: 객체를 자동으로 의존성 주입(자동DI)
    @Autowired
    DeptDao deptDao;

    // 메뉴달기: /main
    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptDao.selectList();
        return list;
    }
}
