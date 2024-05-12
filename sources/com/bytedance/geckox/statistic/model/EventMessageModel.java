package com.bytedance.geckox.statistic.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class EventMessageModel {

    @InterfaceC65349Pkn("access_key")
    public String accessKey;

    @InterfaceC65349Pkn("channels")
    public String channels;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("err_msg")
    public String errMsg;

    @InterfaceC65349Pkn("event_type")
    public int eventType;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannels(String str) {
        this.channels = str;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setEventType(int i) {
        this.eventType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public EventMessageModel(int i, int i2) {
        this.eventType = i;
        this.subType = i2;
    }
}
