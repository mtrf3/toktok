package com.ss.android.ugc.aweme.commercialize.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OrderMessage implements Serializable {

    @InterfaceC65349Pkn("msg_type")
    public Integer msgType;

    @InterfaceC65349Pkn("status_code")
    public Integer statusCode;

    @InterfaceC65349Pkn("toast_content")
    public String toastContent = "";

    @InterfaceC65349Pkn("update_time")
    public long updateime;

    public final Integer getMsgType() {
        return this.msgType;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getToastContent() {
        return this.toastContent;
    }

    public final long getUpdateime() {
        return this.updateime;
    }

    public final void setMsgType(Integer num) {
        this.msgType = num;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setToastContent(String str) {
        this.toastContent = str;
    }

    public final void setUpdateime(long j) {
        this.updateime = j;
    }
}
