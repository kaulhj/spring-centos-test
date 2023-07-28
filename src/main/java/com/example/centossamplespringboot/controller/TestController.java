package com.example.centossamplespringboot.controller;


import com.example.centossamplespringboot.dto.GetIssueRes;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TestController {


    private final issueDao issueDao;

    @GetMapping("/issueTest")
    public List<GetIssueRes> issueTest(){
        try {
            List<GetIssueRes>result = issueDao.getIssues();
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
