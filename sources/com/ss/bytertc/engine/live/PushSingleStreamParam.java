package com.ss.bytertc.engine.live;

/* loaded from: classes33.dex */
public class PushSingleStreamParam {
    public boolean isScreen;
    public String roomId;
    public String url;
    public String userId;

    public PushSingleStreamParam() {
    }

    public PushSingleStreamParam(String str, String str2, String str3, boolean z) {
        this.roomId = str;
        this.userId = str2;
        this.url = str3;
        this.isScreen = z;
    }
}
