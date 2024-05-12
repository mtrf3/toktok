package com.ss.android.ugc.aweme.share.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class ShortenModel {
    public String data;
    public String message;
    public String reason;

    @InterfaceC65349Pkn("shorten_url")
    public String shortenUrl;

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public String getShortenUrl() {
        return this.shortenUrl;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
