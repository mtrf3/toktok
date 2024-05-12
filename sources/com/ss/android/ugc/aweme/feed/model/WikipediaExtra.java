package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class WikipediaExtra implements Serializable {

    @InterfaceC65349Pkn("warning_msg")
    public String warningMsg = "";

    @InterfaceC65349Pkn("language")
    public String language = "";

    @InterfaceC65349Pkn("review_status")
    public Integer status = 0;

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setWarningMsg(String str) {
        this.warningMsg = str;
    }
}
