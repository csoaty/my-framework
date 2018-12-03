package com.crystal.model;

import java.io.Serializable;

/**
 *
 */
@SuppressWarnings("all")
public class AdminModel implements Serializable{
    private static final long serialVersionUID = 1L;

    private int adminId;

    private String adminName;

    private String passWord;

    private long roleid;

    private long phone;

    private long department;

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setDepartment(long department) {
        this.department = department;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

    public int getAdminId() {
        return adminId;
    }

    public long getDepartment() {
        return department;
    }

    public long getPhone() {
        return phone;
    }

    public long getRoleid() {
        return roleid;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getPassWord() {
        return passWord;
    }
}