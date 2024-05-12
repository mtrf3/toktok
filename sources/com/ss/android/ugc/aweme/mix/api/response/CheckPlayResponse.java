package com.ss.android.ugc.aweme.mix.api.response;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CheckPlayResponse extends F9E {

    @InterfaceC65349Pkn("invalid_reason")
    public final String invalidReason;

    @InterfaceC65349Pkn("is_valid")
    public final boolean isValid;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMsg, Boolean.valueOf(this.isValid), this.invalidReason};
    }

    public CheckPlayResponse(int i, String statusMsg, boolean z, String invalidReason) {
        o.LJIIIZ(statusMsg, "statusMsg");
        o.LJIIIZ(invalidReason, "invalidReason");
        this.statusCode = i;
        this.statusMsg = statusMsg;
        this.isValid = z;
        this.invalidReason = invalidReason;
    }
}
