package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LinkValidateResult extends F9E {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMessage;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMessage};
    }

    public LinkValidateResult(int i, String statusMessage) {
        o.LJIIIZ(statusMessage, "statusMessage");
        this.statusCode = i;
        this.statusMessage = statusMessage;
    }
}
