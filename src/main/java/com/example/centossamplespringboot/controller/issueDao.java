package com.example.centossamplespringboot.controller;

import com.example.centossamplespringboot.dto.GetIssueRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface issueDao {

    List<GetIssueRes>getIssues();
}
