package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class AwemeRiskModel implements Serializable {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("notice")
    public boolean notice;

    @InterfaceC65349Pkn("risk_sink")
    public boolean riskSink;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    @InterfaceC65349Pkn("warn")
    public boolean warn;

    public String getContent() {
        if (TextUtils.isEmpty(this.content)) {
            return "";
        }
        return this.content;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isNotice() {
        return this.notice;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setNotice(boolean z) {
        this.notice = z;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
