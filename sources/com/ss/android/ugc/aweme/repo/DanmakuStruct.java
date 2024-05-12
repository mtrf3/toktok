package com.ss.android.ugc.aweme.repo;

import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class DanmakuStruct {

    @InterfaceC65349Pkn("danmaku_id")
    public String danmakuID;

    @InterfaceC65349Pkn("item_id")
    public String itemId;

    @InterfaceC65349Pkn("offset_time")
    public long offsetTime;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    public final String getDanmakuID() {
        return this.danmakuID;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final long getOffsetTime() {
        return this.offsetTime;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setDanmakuID(String str) {
        this.danmakuID = str;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setOffsetTime(long j) {
        this.offsetTime = j;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }
}
