package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class Barrage {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("left_diamond")
    public int leftDiamond;

    @InterfaceC65349Pkn("msg_id")
    public long msgId;

    @InterfaceC65349Pkn("order_id")
    public String orderId;

    @InterfaceC65349Pkn("msg")
    public String screenChatMsg;

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getScreenChatMsg() {
        return this.screenChatMsg;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i) {
        this.leftDiamond = i;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setScreenChatMsg(String str) {
        this.screenChatMsg = str;
    }
}
