package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class RomaResponse implements Serializable {

    @InterfaceC65349Pkn("statusCode")
    public int code = -1;

    @InterfaceC65349Pkn("statusMsg")
    public String message;

    public final boolean isSuccess() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
