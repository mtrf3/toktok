package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class AwemeStatusBean implements Serializable {

    @InterfaceC65349Pkn("item_id")
    public String awemeId;

    @InterfaceC65349Pkn("status")
    public Integer status;

    @InterfaceC65349Pkn("status_text")
    public String statusText;

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setStatusText(String str) {
        this.statusText = str;
    }
}
