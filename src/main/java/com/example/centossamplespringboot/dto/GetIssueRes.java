package com.example.centossamplespringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetIssueRes {




        private String issueNo;
        private String rqTitleName;

        private String rqContents;

        private String issueStatusCd;

        private int maxissueNo;



        private String issueRqTypeCd;
        private String issuePriorityCd;
        private String registrantName;
        private String issueContactName;
        private String requestorName;
        private String registrantDatetime;
        private String updateDate;

        private String requestorFinishDesiredDate;
        private String finishEstimateDate;
        private String finishDatetime;

        private String relatedPeopleId;


        private String[] relatedPeopleIdArray;

        private String groupName;






}
