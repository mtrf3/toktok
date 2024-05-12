package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class PromoteEntryCheck implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    @InterfaceC65349Pkn("url")
    public String url = "";

    @InterfaceC65349Pkn("promote_status")
    public Integer promoteStatus = 0;

    public final Integer getPromoteStatus() {
        return this.promoteStatus;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setPromoteStatus(Integer num) {
        this.promoteStatus = num;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
