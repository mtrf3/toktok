package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class UrgeNotice {

    @InterfaceC65349Pkn("blcok_urge_setting")
    public int blcokUrgeSetting;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("urge_unread_count")
    public long urgeUnreadCount;

    public int getBlcokUrgeSetting() {
        return this.blcokUrgeSetting;
    }

    public String getContent() {
        return this.content;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public void setBlcokUrgeSetting(int i) {
        this.blcokUrgeSetting = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }
}
