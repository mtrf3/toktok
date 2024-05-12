package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class FBVCheckResponse extends F9E {

    @InterfaceC65349Pkn("consent_status_code")
    public final int status;

    @InterfaceC65349Pkn("expire_timestamp_ms")
    public final long timestampToCheckAgain;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status), Long.valueOf(this.timestampToCheckAgain)};
    }

    public FBVCheckResponse(int i, long j) {
        this.status = i;
        this.timestampToCheckAgain = j;
    }
}
