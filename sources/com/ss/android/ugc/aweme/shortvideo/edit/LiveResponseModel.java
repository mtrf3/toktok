package com.ss.android.ugc.aweme.shortvideo.edit;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class LiveResponseModel implements Serializable {

    @InterfaceC65349Pkn("code")
    public Integer code = 0;

    @InterfaceC65349Pkn("type")
    public String type = "highlight";

    @InterfaceC65349Pkn("status")
    public String status = "draft";

    public final Integer getCode() {
        return this.code;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final void setCode(Integer num) {
        this.code = num;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
