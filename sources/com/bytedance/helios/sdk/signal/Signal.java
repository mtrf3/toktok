package com.bytedance.helios.sdk.signal;

/* loaded from: classes12.dex */
public class Signal {
    public final String content;
    public long time;

    public String getContent() {
        return this.content;
    }

    public long getTime() {
        return this.time;
    }

    public Signal(String str) {
        this.content = str;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public Signal(String str, long j) {
        this.content = str;
        this.time = j;
    }
}
