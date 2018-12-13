package com.example.administrator.warehousemanagementsystem;

import android.app.Application;

import com.example.administrator.warehousemanagementsystem.bean.UserBean;

/**
 * author: ZhongMing
 * DATE: 2018/11/21 0021
 * Description:
 * * root 1为仓库管理员 2为站长 3为主任 处长
 **/
public class MyApp extends Application {
    public static final int SL_DETAIL = 0x123;//申领detail
    public static final int SL_USE = 0x222;//申领物品用途
    public static final int SL_EXPLAIN = 0x212;//领用详情
    public static final int SL_CHOOSE_PRODUCT = 0x239; //选择商品
    public static final int SL_SPPERSON = 0x483;//选择审批人
    public static final int REPORT_BT = 0x882;//选择物品后 报告数据
    public static final int LOGIN_SUCCESS = 0x998;//登陆成功
    public static final int LOGIN_FAIL = 0x978;//登陆失败
    public static final int MENU_TYPE = 0X321;//获取物品类型
    public static final int MENU_DETAIL = 0x322;//获取商品


    public UserBean.DataBean user;

    public UserBean.DataBean getUser() {
        return user != null ? user : null;
    }

    public void setUser(UserBean.DataBean user) {
        this.user = user;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public int getRoot() {
        return user != null ? user.getUserRoleNo() : -1;
    }

    public void initUser() {
        setUser(null);
    }
}