package com.niit.entity;

public class Comment {
    private long cId;
    private String cUName;
    private String cContent;
    private String cDate;
    private String cUHeadImg;
    private int cReplyId;
    private long mid;
    private long cLikeNum;

    public void setMid(long mid) {
        this.mid = mid;
    }

    public long getcLikeNum() {
        return cLikeNum;
    }

    public void setcLikeNum(long cLikeNum) {
        this.cLikeNum = cLikeNum;
    }

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
        this.cId = cId;
    }

    public String getcUName() {
        return cUName;
    }

    public void setcUName(String cUName) {
        this.cUName = cUName;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }

    public String getcUHeadImg() {
        return cUHeadImg;
    }

    public void setcUHeadImg(String cUHeadImg) {
        this.cUHeadImg = cUHeadImg;
    }

    public long getcReplyId() {
        return cReplyId;
    }

    public void setcReplyId(int cReplyId) {
        this.cReplyId = cReplyId;
    }

    public long getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
