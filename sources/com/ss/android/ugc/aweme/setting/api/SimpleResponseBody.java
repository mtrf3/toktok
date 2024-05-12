package com.ss.android.ugc.aweme.setting.api;

import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class SimpleResponseBody {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean LIZ() {
        Integer num = this.code;
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public SimpleResponseBody(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}
