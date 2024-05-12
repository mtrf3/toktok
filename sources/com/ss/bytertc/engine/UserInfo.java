package com.ss.bytertc.engine;

/* loaded from: classes33.dex */
public class UserInfo {
    public final String extraInfo;
    public final String uid;

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public String getUid() {
        return this.uid;
    }

    public UserInfo(String str, String str2) {
        this.uid = str;
        this.extraInfo = str2;
    }

    public static UserInfo create(String str, String str2) {
        return new UserInfo(str, str2);
    }
}
