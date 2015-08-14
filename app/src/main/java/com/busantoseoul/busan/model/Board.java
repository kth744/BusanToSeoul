package com.busantoseoul.busan.model;

/**
 * Created by NAVER on 2015-07-30.
 */
public class Board {
    private String num;
    private String title;
    private String description;
    private String regDate;

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegDate() {
        return regDate;
    }
}
