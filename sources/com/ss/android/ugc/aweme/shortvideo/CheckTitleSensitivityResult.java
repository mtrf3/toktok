package com.ss.android.ugc.aweme.shortvideo;

import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class CheckTitleSensitivityResult implements Serializable {

    @InterfaceC65349Pkn("post_prompts")
    public PostPrompts postPrompts;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMessage;

    public final PostPrompts getPostPrompts() {
        return this.postPrompts;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setPostPrompts(PostPrompts postPrompts) {
        this.postPrompts = postPrompts;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMessage(String str) {
        this.statusMessage = str;
    }
}
