package com.ss.android.ugc.aweme.notice.api.bean;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class StrangerNoticeMessage {

    @InterfaceC65349Pkn("client_msg_id")
    public long clientMsgId;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("create_time")
    public long createTime;

    @InterfaceC65349Pkn("device_id")
    public long deviceId;

    @InterfaceC65349Pkn("ext")
    public String ext;

    @InterfaceC65349Pkn("from_user")
    public SimpleUser fromUser;

    @InterfaceC65349Pkn("msg_type")
    public int msgType;

    @InterfaceC65349Pkn("to_user")
    public SimpleUser toUser;

    public boolean isRecalled() {
        if (!TextUtils.isEmpty(this.ext)) {
            try {
                if (TextUtils.equals("true", (CharSequence) ((HashMap) new Gson().LJI(this.ext, HashMap.class)).get("s:is_recalled"))) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public SimpleUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public SimpleUser getToUser() {
        return this.toUser;
    }

    public void setClientMsgId(long j) {
        this.clientMsgId = j;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDeviceId(long j) {
        this.deviceId = j;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(SimpleUser simpleUser) {
        this.fromUser = simpleUser;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setToUser(SimpleUser simpleUser) {
        this.toUser = simpleUser;
    }
}
