package com.niit.entity;

public class IntroAlbum {
    private String aImgSrc;
    private String aTitle;
    private long aPlayNum;
    private long aId;

    public long getaId() {
        return aId;
    }

    public void setaId(long aId) {
        this.aId = aId;
    }

    public String getaImgSrc() {
        return aImgSrc;
    }

    public void setaImgSrc(String aImgSrc) {
        this.aImgSrc = aImgSrc;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle;
    }

    public long getaPlayNum() {
        return aPlayNum;
    }

    public void setaPlayNum(int aPlayNum) {
        this.aPlayNum = aPlayNum;
    }
}
