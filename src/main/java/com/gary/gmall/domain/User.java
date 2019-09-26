package com.gary.gmall.domain;

public class User {
    private String id;
    private String right;
    private String group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", right='" + right + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
