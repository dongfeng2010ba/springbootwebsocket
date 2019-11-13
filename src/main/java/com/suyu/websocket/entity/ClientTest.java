package com.suyu.websocket.entity;

import javax.websocket.Session;
import java.io.Serializable;

/**
 * 测试git的版本回滚实现用
 */
public class ClientTest implements Serializable {

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

    public ClientTest(String userName, Session session) {
        this.userName = userName;
        this.session = session;
    }

    public ClientTest() {
        System.out.println("test");
        System.out.println("新增1");
        System.out.println("新增2");
        System.out.println("新增3");
        System.out.println("新增4");
        System.out.println("新增5");
        System.out.println("新增6");
        System.out.println("新增7");
        System.out.println("新增7");
        System.out.println("新增b");
        System.out.println("新增c");
        System.out.println("新增d");
        System.out.println("新增11");
        System.out.println("新增12");
        System.out.println("新增13");


    }
}
