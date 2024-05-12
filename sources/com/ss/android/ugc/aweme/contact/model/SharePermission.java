package com.ss.android.ugc.aweme.contact.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class SharePermission {

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("update_time")
    public long updateTime;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    @InterfaceC65349Pkn("user_share_status")
    public Integer userShareStatus = 0;

    @InterfaceC65349Pkn("ttn_share_status")
    public Integer ttnShareStatus = 0;

    public final String getExtra() {
        return this.extra;
    }

    public final Integer getTtnShareStatus() {
        return this.ttnShareStatus;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Integer getUserShareStatus() {
        return this.userShareStatus;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setTtnShareStatus(Integer num) {
        this.ttnShareStatus = num;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserShareStatus(Integer num) {
        this.userShareStatus = num;
    }
}
