package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.ForwardStreamInfo;

/* loaded from: classes33.dex */
public class InternalForwardStreamInfo {
    public String roomId;
    public String token;

    public String getRoomId() {
        String str = this.roomId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getToken() {
        String str = this.token;
        if (str == null) {
            return "";
        }
        return str;
    }

    public InternalForwardStreamInfo(ForwardStreamInfo forwardStreamInfo) {
        this.roomId = forwardStreamInfo.roomId;
        this.token = forwardStreamInfo.token;
    }

    public InternalForwardStreamInfo(String str, String str2) {
        this.roomId = str;
        this.token = str2;
    }
}
