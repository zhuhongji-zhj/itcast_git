package com.itheima.pojo;

import java.io.Serializable;
import java.util.*;


public class User implements Serializable {

    private Integer id;
    private String username;
    // 爱好
    private String[] hobby;
    // 银行卡
    private List<String> bankCards;
    // 学历-学校（小学:深圳小学）
    private Map<String, String> studyLevelSchool;

    private Properties friends;

    // 其他bean类型
    private Address address;

    private Set<String> sets;

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    // 省略toString、getter、

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<String> getBankCards() {
        return bankCards;
    }

    public void setBankCards(List<String> bankCards) {
        this.bankCards = bankCards;
    }

    public Map<String, String> getStudyLevelSchool() {
        return studyLevelSchool;
    }

    public void setStudyLevelSchool(Map<String, String> studyLevelSchool) {
        this.studyLevelSchool = studyLevelSchool;
    }

    public Properties getFriends() {
        return friends;
    }

    public void setFriends(Properties friends) {
        this.friends = friends;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", bankCards=" + bankCards +
                ", studyLevelSchool=" + studyLevelSchool +
                ", friends=" + friends +
                ", address=" + address +
                ", sets=" + sets +
                '}';
    }
}
