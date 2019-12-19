package com.suyu.websocket.entity;

import javax.websocket.Session;
import java.io.Serializable;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @Date 2019/3/1 上午9:08
 */
public class ClientB1 implements Serializable {

    private static final long serialVersionUID = 8957107006902627635L;

    private String userName;

    private Session session;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public ClientB1(String userName, Session session) {
        this.userName = userName;
        this.session = session;
    }

    public ClientB1() {
        System.out.println("ceshi");
        System.out.println();
        System.out.println("3");
        System.out.println("develop1修改了ClientB1");
    }
}


