package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes10.dex */
public final class AppWidgetStruct {

    @InterfaceC65349Pkn("ch_info")
    public List<ChallengeStruct> challengeStructList;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    public final List<ChallengeStruct> getChallengeStructList() {
        return this.challengeStructList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setChallengeStructList(List<ChallengeStruct> list) {
        this.challengeStructList = list;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public AppWidgetStruct(int i, String str, long j, List<ChallengeStruct> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.cursor = j;
        this.challengeStructList = list;
    }
}
